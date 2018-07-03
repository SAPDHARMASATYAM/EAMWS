package in.co.examsadda.service;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Option;
import in.co.examsadda.jpa.repository.OptionRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OptionsServiceBean implements OptionsService {
	@Autowired
	private OptionRepository optionRepository;

	@Override
	public Option getOptionByOptionId(Integer optionId) {
		return optionRepository.findById(optionId).get();
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
	public List<Option> getAllOptionsByQuestionId(BigInteger questionId){
		List<Option> allOptionsByQuestionId = optionRepository.findAllByQuestionIdFk(questionId);
		return allOptionsByQuestionId;
	}
}
