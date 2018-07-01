package in.co.examsadda.service;

import java.math.BigInteger;
import java.util.List;

import in.co.examsadda.entity.Option;

public interface OptionsService {

	Option getOptionByOptionId(Integer optionId);

	boolean saveQuestionOptions(List<Option> questionOptions);

	Option saveOption(Option option);

	List<Option> getAllOptionsByQuestionId(BigInteger questionId);

}