package in.co.examsadda.service;

import java.util.List;

import in.co.examsadda.entity.Option;

public interface OptionsService {

	Option getOptionByOptionId(Integer optionId);

	List<Option> getOptionsByQuestionId(Integer questionId);

	boolean saveQuestionOptions(List<Option> questionOptions);

	Option saveOption(Option option);

	List<Option> getAllOptionsByQuestionId(int questionId);

}