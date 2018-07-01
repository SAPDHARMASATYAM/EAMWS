package in.co.examsadda.service;

import java.math.BigInteger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.entity.Option;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OptionServiceTest {
	
	@Autowired
	private OptionsService optionService;
	
	@Test
	public void saveOptionTest() {
		Option option = new Option();
		
		option.setIsOptionActive(true);
		option.setIsOptionHasImage(false);
		option.setNew(true);
		option.setOptionIndicator("A");
		option.setOptionValueInEnglish("Option : A");
		option.setOptionValueInRegional("ఎంపిక : A");
		option.setQuestionIdFk(new BigInteger(String.valueOf(1)));
		option.setSectionIdFk(0);
		Option saveOptionResponse = optionService.saveOption(option);
		System.out.println("saveOptionResponse :::::::::::::::::::: " + saveOptionResponse);
	}

}
