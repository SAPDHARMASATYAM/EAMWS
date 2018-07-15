package in.co.examsadda;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.util.ReadDocFile;
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionPaperLoadingTest {
	@Test
	public void questionPaperLoading() {
		
	ReadDocFile readDocFile = new ReadDocFile(); 
	readDocFile.readDocxFile("E:\\Development\\Workspaces\\eaws\\SampleFIleReadid.docx");
	}
}
