package in.co.examsadda.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.Question;
import in.co.examsadda.model.QuestionOptions;
import in.co.examsadda.util.NumberConverter;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class QuestionOptionsServiceBean implements QuestionOptionsService {
	
	@Autowired
	private QuestionService questionService;
	@Autowired
	private OptionsService optionsService;
	
	@Override
	public QuestionOptions getQuestionOptionsByQuestionId(BigInteger questionId) {
		QuestionOptions questionOptions = new QuestionOptions();
		Question questionByquestionId = questionService.getQuestionByquestionId(questionId);
		questionOptions.setQuestion(questionByquestionId);
		List<Option> allOptionsByQuestionId = optionsService.getAllOptionsByQuestionId(questionId);
		questionOptions.setOptions(allOptionsByQuestionId);
		return questionOptions;
	}
	
	@Override
	public List<QuestionOptions> getAllQuestionOptionsBySectionId(int sectionId){
		List<QuestionOptions> allQuestionOptionsBySectionId = new ArrayList<QuestionOptions>();
		List<Question> questionsBySectionId = questionService.getQuestionsBySectionId(sectionId);
		for (Question question : questionsBySectionId) {
			QuestionOptions questionOptions = getQuestionOptionsByQuestionId(NumberConverter.getBigInt(question.getQuestionId()));
			allQuestionOptionsBySectionId.add(questionOptions);
		}
		return allQuestionOptionsBySectionId;
	}

}
