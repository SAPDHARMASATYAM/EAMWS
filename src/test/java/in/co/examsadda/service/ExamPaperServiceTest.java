package in.co.examsadda.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.model.ExamPaper;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamPaperServiceTest {
	
	@Autowired
	private ExamPaperService examPaperService;
	
	@Test
	public void getExamPaperByExamPaperIdTest() throws Exception {
		
		try {
			ExamPaper examPaperByExamPaperId = examPaperService.getExamPaperByExamPaperId(3);
			System.err.println(examPaperByExamPaperId);
			Assert.assertNotEquals(null, examPaperByExamPaperId.getPracticePaper());
			Assert.assertNotEquals(true, examPaperByExamPaperId.getSections().isEmpty());
		} catch (javax.persistence.EntityNotFoundException e) {
			System.err.println("Record not found");
		}
	}
	
	
}
