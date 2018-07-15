package in.co.examsadda;

import org.junit.Test;

import in.co.examsadda.util.ReadDocFile;
/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class QuestionPaperLoadingTest {
	@Test
	public void questionPaperLoading() {
		
	ReadDocFile readDocFile = new ReadDocFile(); 
	readDocFile.readFile("E:\\Development\\Workspaces\\eaws\\SampleFIleReadid.docx");
	}
}
