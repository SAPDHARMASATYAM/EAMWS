package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Option;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface OptionsService {

	public Option getOptionByOptionId(Long optionId);
	public List<Option> getOptionsByQuestionId(Long questionId);
	
	public Option saveOption(Option option);
	public List<Option> saveOptions(List<Option> options);
}