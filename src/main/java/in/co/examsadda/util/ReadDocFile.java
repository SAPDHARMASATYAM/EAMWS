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

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.Section;
import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.model.QuestionOptions;
import in.co.examsadda.service.ExamPaperService;
import in.co.examsadda.service.PracticePaperService;
import in.co.examsadda.service.QuestionOptionsService;
import in.co.examsadda.service.QuestionService;
import in.co.examsadda.service.SectionService;

public class ReadDocFile
{
	@Autowired
	private ExamPaperService examPaperService;
	
	@Autowired
	private PracticePaperService practicePaperService;
	
	@Autowired
	private SectionService sectionService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private QuestionOptionsService questionOptionsService;
	
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

				/*Gson gson = new GsonBuilder().setPrettyPrinting().create();
			        // Convert the ordered map into an ordered string.
			        String json = gson.toJson(converListToMap, LinkedHashMap.class);

			        // Print ordered string.
			        //System.out.println(json); 
			        
			        
			        JsonParser jp = new JsonParser();
			        JsonElement je = jp.parse(json);
			        String prettyJsonString = gson.toJson(je);
			        System.out.println(prettyJsonString); */
			        
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
	
	public void savePracticePaper(LinkedHashMap<Section,LinkedHashMap<Question,LinkedHashMap<Character,String>>> practicePaperMap) throws Exception {
		
		
		Section section=null;
		Question question = null;
	
		QuestionOptions questionOptions = null; 
		LinkedHashMap<Question, LinkedHashMap<Character,String>> questionOption=new LinkedHashMap<Question, LinkedHashMap<Character,String>>();
		LinkedHashMap<Character,String> optionMap = new LinkedHashMap<Character,String>();
		if(practicePaperMap!=null) {
			PracticePaper practicePaper = new PracticePaper();
			ExamPaper examPaper = new ExamPaper();
			
			practicePaper.setPracticePaperNameInEnglish("ssc");
			practicePaper.setPracticePaperNameInRegional("ఎస్ఎస్సి");
			practicePaper.setIsPracticePaperActive(true);
			practicePaper.setNumberOfSectionsInThisPracticePaper(4);
			practicePaper.setPracticePaperCurrentDuration(120);
			
			examPaper.setPracticePaper(practicePaper);
			
			examPaperService.saveExamPaper(examPaper);
			
			Set set = practicePaperMap.entrySet();
			Iterator iterator = set.iterator();
			
			while(iterator.hasNext()) {
				Map.Entry paperMap = (Map.Entry)iterator.next();
				section = (Section)paperMap.getKey();
				section.setNew(true);
				section.setNumberOfQuestionsInThisSection(10);
				section.setPracticePaper(practicePaper);
				section.setSectionActive(true);
				practicePaperService.savePracticePaper(practicePaper);
				questionOption = (LinkedHashMap)paperMap.getValue();
				
				Set questionOptionSet = questionOption.entrySet();
				Iterator questionOptionIterator = questionOptionSet.iterator();
				
				while(questionOptionIterator.hasNext()) {
					
					Map.Entry questionOptionPaper = (Map.Entry)iterator.next();
					question = (Question)questionOptionPaper.getKey();
					question.setQuestionActive(true);
					question.setQuestionHasImage(false);
					question.setSection(section);
					optionMap = (LinkedHashMap<Character,String>)questionOptionPaper.getValue();
					
					Set optionSet = optionMap.entrySet();
					Iterator optionIterator = optionSet.iterator();
					
					while(optionIterator.hasNext()) {
						Option option = new Option();
						Map.Entry optionEntryMap = (Map.Entry)optionIterator.next();
						option.setOptionIndicator((String) optionEntryMap.getKey());
						option.setOptionValueInEnglish((String) optionEntryMap.getValue());
						option.setQuestion(question);
						questionOptionsService.saveQuestionOptions(questionOptions);
					}
				}
				
			}
		}
		
	}
	
}
