package in.co.examsadda.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import in.co.examsadda.crud.repository.OptionRepository;
import in.co.examsadda.entity.Option;

public class OptionsServiceBean {
	@Autowired
	private OptionRepository optionRepository;

	public Option getOptionByOptionId(Integer optionId) {
		return optionRepository.findById(optionId).get();
	}

	public List<Option> getOptionsByQuestionId(Integer questionId) {
		return optionRepository.findAllByQuestionIdFk(questionId);
	}
	public boolean saveQuestionOptions(List<Option> questionOptions) {
		Iterator<Option> saveQuestionOptionsResponse = optionRepository.saveAll(questionOptions).iterator();
		return (saveQuestionOptionsResponse.hasNext())?true:false;
	}
}
