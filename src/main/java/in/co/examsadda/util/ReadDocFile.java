package in.co.examsadda.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.Section;
import in.co.examsadda.service.ExamPaperService;

public class ReadDocFile
{
	@Autowired
	private ExamPaperService examPaper;
	
	ArrayList<String> fileContent=new ArrayList<String>();
	public void readFile(String fileName) {
		String fileExt=""; 
		LinkedHashMap<String, LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,String>>>> examPaper=new LinkedHashMap<>();
		LinkedHashMap<String, LinkedHashMap<String,List<String>>> section = new LinkedHashMap<>();
		LinkedHashMap<String,List> questionOption = new LinkedHashMap<>();
		List<String> option = new ArrayList<String>();
		
		String answer="";
		String sectionValue="";
		
		if(fileName!=null) {
			fileExt = fileName.substring(fileName.lastIndexOf(".") + 1);
			if(fileExt!=null && (fileExt.equals("docx") || fileExt.equals("doc"))) {
				fileContent = readDocxFile(fileName);
			}else if(fileExt!=null && fileExt.equals("pdf")) {
				fileContent = readPfdFile(fileName);
			}
			System.out.println("Inside read file method");
			try {
				System.out.println("File content size :: "+fileContent.size());
				LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,String>>> converListToMap = converListToMap(fileContent);
			
				 //Gson gson = new Gson();

				Gson gson = new GsonBuilder().setPrettyPrinting().create();
			        // Convert the ordered map into an ordered string.
			        String json = gson.toJson(converListToMap, LinkedHashMap.class);

			        // Print ordered string.
			        //System.out.println(json); 
			        
			        
			        JsonParser jp = new JsonParser();
			        JsonElement je = jp.parse(json);
			        String prettyJsonString = gson.toJson(je);
			        System.out.println(prettyJsonString); 
			        
				//System.out.println(converListToMap);
			}catch(Exception e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
	}
	
	public ArrayList<String> readDocxFile(String fileName) {
		System.out.println("Inside readDocxFile method");
		ArrayList<String> questionPaperContent = new ArrayList<String>();
		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			XWPFDocument document = new XWPFDocument(fis);

			List<XWPFParagraph> paragraphs = document.getParagraphs();
			
			System.out.println("Total no of paragraph "+paragraphs.size());
			for (XWPFParagraph para : paragraphs) {
				//System.out.println(para.getText());
				questionPaperContent.add(para.getText());
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return questionPaperContent;
	}
	
	public ArrayList<String> readPfdFile(String fileName) {
		try{
			PDDocument document = null; 
			document = PDDocument.load(new File(fileName));
			document.getClass();
			if( !document.isEncrypted() ){
			    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
			    stripper.setSortByPosition( true );
			    PDFTextStripper Tstripper = new PDFTextStripper();
			    String st = Tstripper.getText(document);
			    System.out.println("Text:"+st);
			    
			}
			}catch(Exception e){
			    e.printStackTrace();
			}
		return null;
	}
	
	private LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,String>>> converListToMap(ArrayList<String> fileData){
		LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,String>>> examPaper = new LinkedHashMap<>();
		
		int index=0;
		
		if(fileData.size()==0) {
			return null;
		}
		PracticePaper practicePaper = new PracticePaper();
		practicePaper.setPracticePaperNameInEnglish("ssc");
		practicePaper.setPracticePaperNameInRegional("ssc");
		
		//Section
		for(int i=0;i<4;i++) {
			LinkedHashMap<Question, LinkedHashMap<Character,String>> questionMap = new LinkedHashMap();
			Section section = new Section();
			section.setSectionNameInEnglish(fileData.get(index++));
			section.setSectionNameInRegional(fileData.get(index++));
			
			//Question
			//For Storing English data
			for(int j=0;j<2;j++) {
				LinkedHashMap<Character, String> questionOptionsMAP = new LinkedHashMap<>();
				Question question = new Question();
				question.setQuestionInEnglish(fileData.get(index++));
				
			//Options
				char opt = 'A';
				for(int k=0;k<4;k++) {
				Option option = new Option();
				option.setOptionIndicator(String.valueOf(opt++));
				option.setOptionValueInEnglish(fileData.get(index++));
				questionOptionsMAP.put(option.getOptionIndicator().charAt(0), option.getOptionValueInEnglish());
				}
				question.setAnswerForThisQuestion(fileData.get(index++));
				question.setQuestionInRegional(fileData.get(index++));
					
				//Options
					 opt = 'a';
					for(int k=0;k<4;k++) {
					Option option = new Option();
					option.setOptionIndicator(String.valueOf(opt++));
					option.setOptionValueInEnglish(fileData.get(index++));
					questionOptionsMAP.put(option.getOptionIndicator().charAt(0), option.getOptionValueInEnglish());
					}
					question.setAnswerForThisQuestion(fileData.get(index++));
					questionMap.put(question, questionOptionsMAP);
				}
			examPaper.put(section, questionMap);
		}
		return examPaper;
	}
	
	public void savePracticePaper(LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,String>>> practicePaper) {
		
		Set examPaper = null;
		Section section=null;
		Question question = null;
		LinkedHashMap<Question, LinkedHashMap<Character,String>> questionOption=new LinkedHashMap<Question, LinkedHashMap<Character,String>>();
		LinkedHashMap<Character,String> option = new LinkedHashMap<Character,String>();
		if(practicePaper!=null) {
		
			Set set = practicePaper.entrySet();
			Iterator iterator = set.iterator();
			
			while(iterator.hasNext()) {
				Map.Entry paper = (Map.Entry)iterator.next();
				section = (Section)paper.getKey();
				
				questionOption = (LinkedHashMap)paper.getValue();
				
				Set questionOptionSet = questionOption.entrySet();
				Iterator questionOptionIterator = questionOptionSet.iterator();
				
				while(questionOptionIterator.hasNext()) {
					
					Map.Entry questionOptionPaper = (Map.Entry)iterator.next();
					question = (Question)questionOptionPaper.getKey();
					option = (LinkedHashMap<Character,String>)questionOptionPaper.getValue();
					
					Set optionSet = option.entrySet();
					Iterator optionIterator = optionSet.iterator();
					
					while(optionIterator.hasNext()) {
						Map.Entry optionMap = (Map.Entry)optionIterator.next();
						optionMap.getKey();
						
					}
				}
				
			}
		}
		
	}
	
}
