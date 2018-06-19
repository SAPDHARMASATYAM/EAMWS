package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.OptionRepository;
import in.co.examsadda.entity.Option;

@Service
public class OptionsService {
	@Autowired
	private OptionRepository optionRepository;

	public Option getOptionByOptionId(Integer optionId) {
		return optionRepository.findById(optionId).get();
	}

	public List<Option> getOptionsByQuestionId(Integer questionId) {
		return optionRepository.findAllByQuestionId(questionId);
	}
}
