package in.co.examsadda.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Option;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface OptionsService {

	Option getOptionByOptionId(Integer optionId);

	boolean saveQuestionOptions(List<Option> questionOptions);

	Option saveOption(Option option);

	List<Option> getAllOptionsByQuestionId(BigInteger questionId);

}