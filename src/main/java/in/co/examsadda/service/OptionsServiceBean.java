package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Option;
import in.co.examsadda.jpa.OptionRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OptionsServiceBean implements OptionsService {
	@Autowired
	private OptionRepository optionRepository;

	@Override
	public Option getOptionByOptionId(Long optionId) {
		Option getOptionByOptionIdResponse = optionRepository.getOne(optionId);
		return getOptionByOptionIdResponse;
	}

	@Override
	public List<Option> getOptionsByQuestionId(Long questionId) {
		List<Option> findAllByQuestionQuestionIdResponse = optionRepository.findAllByQuestionQuestionId(questionId);
		return findAllByQuestionQuestionIdResponse;
	}

	@Override
	public Option saveOption(Option option) {
		Option saveOptionResponse = optionRepository.save(option);
		return saveOptionResponse;
	}

	@Override
	public List<Option> saveOptions(List<Option> options) {
		List<Option> saveAllOptionsResponse = optionRepository.saveAll(options);
		return saveAllOptionsResponse;
	}

}
