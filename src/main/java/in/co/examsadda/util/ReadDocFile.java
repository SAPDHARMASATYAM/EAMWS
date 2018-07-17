package in.co.examsadda.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.Section;

public class ReadDocFile
{
	
	ArrayList<String> fileContent=new ArrayList<String>();
	public LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,Option>>> readFile(String fileName) {
		String fileExt=""; 
		LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,Option>>> converListToMap = null;
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
				converListToMap= converListToMap(fileContent);
			
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
		return converListToMap;
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
	
	private LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,Option>>> converListToMap(ArrayList<String> fileData){
		LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,Option>>> examPaper = new LinkedHashMap<>();
		
		int index=0;
		
		if(fileData.size()==0) {
			return null;
		}
		
		//Section
		for(int i=0;i<4;i++) {
			LinkedHashMap<Question, LinkedHashMap<Character,Option>> questionMap = new LinkedHashMap<Question, LinkedHashMap<Character, Option>>();
			Section section = new Section();
			section.setSectionNameInEnglish(fileData.get(index++));
			section.setSectionNameInRegional(fileData.get(index++));
			
			//Question
			//For Storing English data
			for(int j=0;j<2;j++) {
				LinkedHashMap<Character, Option> questionOptionsMAP = new LinkedHashMap<>();
				Question question = new Question();
				question.setQuestionInEnglish(fileData.get(index++));
				
			//Options
				char opt = 'A';
				for(int k=0;k<4;k++) {
				Option option = new Option();
				option.setOptionIndicator(String.valueOf(opt++));
				option.setOptionValueInEnglish(fileData.get(index++));
				questionOptionsMAP.put(option.getOptionIndicator().charAt(0), option);
				}
				question.setAnswerForThisQuestion(fileData.get(index++));
				question.setQuestionInRegional(fileData.get(index++));
					
				//Options
					opt = 'A';
					for(int k=0;k<4;k++) {
					Option option = questionOptionsMAP.get(opt);
					option.setOptionIndicator(String.valueOf(opt++));
					option.setOptionValueInRegional(fileData.get(index++));
					questionOptionsMAP.put(option.getOptionIndicator().charAt(0), option);
					}
					question.setAnswerForThisQuestion(fileData.get(index++));
					questionMap.put(question, questionOptionsMAP);
				}
			examPaper.put(section, questionMap);
		}
		return examPaper;
	}
	
}
