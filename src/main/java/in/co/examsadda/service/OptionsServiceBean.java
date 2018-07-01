package in.co.examsadda.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.OptionRepository;
import in.co.examsadda.entity.Option;

@Service
public class OptionsServiceBean implements OptionsService {
	@Autowired
	private OptionRepository optionRepository;

	@Override
	public Option getOptionByOptionId(Integer optionId) {
		return optionRepository.findById(optionId).get();
	}

	@Override
	public List<Option> getOptionsByQuestionId(Integer questionId) {
		return optionRepository.findAllByQuestionIdFk(questionId);
	}
	@Override
	public boolean saveQuestionOptions(List<Option> questionOptions) {
		Iterator<Option> saveQuestionOptionsResponse = optionRepository.saveAll(questionOptions).iterator();
		return (saveQuestionOptionsResponse.hasNext())?true:false;
	}
	
	@Override
	public Option saveOption(Option option) {
		Option saveResponse = optionRepository.save(option);
		return saveResponse;
	}
	
	@Override
	public List<Option> getAllOptionsByQuestionId(int questionId){
		List<Option> allOptionsByQuestionId = optionRepository.findAllByQuestionIdFk(questionId);
		return allOptionsByQuestionId;
	}
}
