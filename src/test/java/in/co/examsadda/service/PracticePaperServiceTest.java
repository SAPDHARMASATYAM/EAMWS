package in.co.examsadda.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.entity.PracticePaper;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticePaperServiceTest {

	@Autowired
	private PracticePaperService practicePaperService;
	
	@Test
	public void savePracticePaperTest() {
		PracticePaper practicePaper = new PracticePaper();
		practicePaper.setIsPracticePaperActive(true);
		practicePaper.setNew(true);
		practicePaper.setNumberOfSectionsInThisPracticePaper(50);
		practicePaper.setPracticePaperCurrentDuration(200);
		practicePaper.setPracticePaperNameInEnglish("Practice paper 1");
		practicePaper.setPracticePaperNameInRegional("అభ్యాస పరీక్ష 1");
		PracticePaper savePracticePaperResponse = practicePaperService.savePracticePaper(practicePaper);
		System.err.println(savePracticePaperResponse);
		Assert.assertNotEquals(null, savePracticePaperResponse);
	}
	
	@Test
	public void getPracticePaperByPracticePaperIdTest() {
		PracticePaper practicePaperByPracticePaperId = practicePaperService.getPracticePaperByPracticePaperId(1);
		System.err.println(practicePaperByPracticePaperId);
		Assert.assertNotEquals(null, practicePaperByPracticePaperId);
		
	}
	


}
