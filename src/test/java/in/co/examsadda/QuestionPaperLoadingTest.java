package in.co.examsadda;

import java.io.File;
import java.util.LinkedHashMap;

import org.junit.Test;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.Section;
import in.co.examsadda.util.ReadDocFile;
/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class QuestionPaperLoadingTest {
	@Test
	public void questionPaperLoading() {

		ReadDocFile readDocFile = new ReadDocFile(); 
		String fileName = "SampleFIleReadid.docx";
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		String filePath = file.getAbsolutePath();
		LinkedHashMap<Section, LinkedHashMap<Question, LinkedHashMap<Character, Option>>> practicePaperMap = readDocFile.readFile(filePath);

	}
}
