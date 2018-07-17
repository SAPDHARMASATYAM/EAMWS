package in.co.examsadda.service;

import java.util.LinkedHashMap;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.Section;
import in.co.examsadda.util.ReadDocFile;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticePaperServiceTest {

	@Autowired
	private PracticePaperService practicePaperService;
	@Autowired
	private ReadDocFile readDocFile;
	@Autowired
	private SectionService sectionService;
	
	@Test
	public void savePracticePaperTest() {
		
		LinkedHashMap<Section, LinkedHashMap<Question, LinkedHashMap<Character, Option>>> fileData = readDocFile.readFile("E:\\Development\\Workspaces\\eaws\\SampleFIleReadid.docx");
		
		
		PracticePaper practicePaper = new PracticePaper();
		practicePaper.setIsPracticePaperActive(true);
		practicePaper.setNew(true);
		practicePaper.setNumberOfSectionsInThisPracticePaper(50);
		practicePaper.setPracticePaperCurrentDuration(200);
		practicePaper.setPracticePaperNameInEnglish("Practice paper 1");
		practicePaper.setPracticePaperNameInRegional("అభ్యాస పరీక్ష 1");
		PracticePaper savePracticePaperResponse = practicePaperService.savePracticePaper(practicePaper);
		if(savePracticePaperResponse != null) {
			Set<Section> sectionsKeySet = fileData.keySet();
			for (Section section : sectionsKeySet) {
					section.setPracticePaper(savePracticePaperResponse);
					LinkedHashMap<Question, LinkedHashMap<Character, Option>> questionsMap = fileData.get(section);
					Section saveSectionResponse = sectionService.saveSection(section);
					if(savePracticePaperResponse !=null) {
						Set<Question> QuestionsKeySet = questionsMap.keySet();
						for (Question question : QuestionsKeySet) {
							question.setSection(saveSectionResponse);
							LinkedHashMap<Character, Option> optionsMap = questionsMap.get(question);
							Set<Character> optionsKeySet = optionsMap.keySet();
							for (Character optionKey : optionsKeySet) {
								optionsMap.get(optionKey);
							}
								
							
						}
					}
					
			}
		}
		
	}
	
	@Test
	public void getPracticePaperByPracticePaperIdTest() {
		PracticePaper practicePaperByPracticePaperId = practicePaperService.getPracticePaperByPracticePaperId(1);
		System.err.println(practicePaperByPracticePaperId);
		Assert.assertNotEquals(null, practicePaperByPracticePaperId);
		
	}
	


}
