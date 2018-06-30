package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Option;

@Service
public interface OptionsService {

	Option getOptionByOptionId(Integer optionId);

	List<Option> getOptionsByQuestionId(Integer questionId);

	boolean saveQuestionOptions(List<Option> questionOptions);

}