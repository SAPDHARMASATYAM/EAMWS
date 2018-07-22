package in.co.examsadda;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import in.co.examsadda.util.ReadDocFile;
/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class QuestionPaperLoadingTest {
	@Test
	public void questionPaperLoading() {
		
	ReadDocFile readDocFile = new ReadDocFile(); 
	try {
		//readDocFile.readexclFile("E:\\Development\\Workspaces\\eaws\\EAS\\src\\main\\resources\\SamplePaperexcl.xlsx");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("SamplePaperexcl.xlsx").getFile());
		readDocFile.readexclFile(file.getAbsolutePath());
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
