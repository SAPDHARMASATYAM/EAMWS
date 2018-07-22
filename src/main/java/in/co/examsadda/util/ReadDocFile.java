package in.co.examsadda.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

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
				System.out.println(para.getText());
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
	
	
	public ArrayList<String> readexclFile(String fileName) throws IOException{
		System.out.println("FIlename :: "+fileName);
		ArrayList<String> questionPaperContent = new ArrayList<String>();
		String excelFilePath = fileName;
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();
		try {
		while (iterator.hasNext()) {//Iterate Row by row 
			Row nextRow = iterator.next(); //gets the row
			Iterator<Cell> cellIterator = nextRow.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				if(cell!=null) {
				
				//System.out.println("Celltype :: "+cell.getCellType());
				//System.out.println("CellValue :: "+cell.getRichStringCellValue());
					
					String cellValue = String.valueOf(cell);
					String convertedCellValue="";
					if(!cellValue.isEmpty()) {
						convertedCellValue = getCellValue(cell);
						System.out.println(convertedCellValue);
					questionPaperContent.add(convertedCellValue);
					}
				}
			}
		}
		}catch(Exception e) {
			throw e;
		}
		//workbook.close();
		inputStream.close();
		
		return questionPaperContent;
	}
	
	
	private String getCellValue(Cell cell) {
		
		String cellValue = "";
		
		switch (cell.getCellType()) {
        case Cell.CELL_TYPE_STRING:
        	System.out.println("String type");
        	cellValue = cell.getStringCellValue();
            break;
        case Cell.CELL_TYPE_BOOLEAN:
        	System.out.println("Boolean type");
        	cellValue = String.valueOf(cell.getBooleanCellValue());
            break;
        case Cell.CELL_TYPE_NUMERIC:
        	System.out.println("NUmeric type");
        	cellValue = String.valueOf(cell.getNumericCellValue());
            break;
        case Cell.CELL_TYPE_FORMULA:
        	System.out.println("Formula type");
        	cellValue = String.valueOf(cell.getCellFormula());
            break;
    }
		
		
		return cellValue;
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
			for(int j=0;j<15;j++) {
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
