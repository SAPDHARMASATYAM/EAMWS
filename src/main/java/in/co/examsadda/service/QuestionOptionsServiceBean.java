package in.co.examsadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class QuestionOptionsServiceBean implements QuestionOptionsService {
	
	@Autowired
	private QuestionService questionService;
	@Autowired
	private OptionsService optionsService;
	

}
