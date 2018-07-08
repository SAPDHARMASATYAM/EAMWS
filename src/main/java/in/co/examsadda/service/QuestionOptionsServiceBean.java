package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.Question;
import in.co.examsadda.model.QuestionOptions;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class QuestionOptionsServiceBean implements QuestionOptionsService {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private OptionsService optionsService;
	@Override
	public QuestionOptions getQuestionOptionsByQuestionId(Long questionId) {
		QuestionOptions questionOptions = new QuestionOptions();
		Question questionByQuestionId = questionService.getQuestionByQuestionId(questionId);
		List<Option> optionsByQuestionId = optionsService.getOptionsByQuestionId(questionByQuestionId.getQuestionId());
		questionOptions.setQuestion(questionByQuestionId);
		questionOptions.setOptions(optionsByQuestionId);
		return questionOptions;
	}
	@Override
	public List<QuestionOptions> getAllQuestionsAndOptionsBySectionId(int sectionId) {
		List<QuestionOptions> questionsAndOptionsBySectionId = new ArrayList<QuestionOptions>();
		List<Question> questionsBySectionId = questionService.getQuestionsBySectionId(sectionId);
		for (Question question : questionsBySectionId) {
			QuestionOptions questionOptions = new QuestionOptions();
			questionOptions.setQuestion(question);
			List<Option> optionsByQuestionId = optionsService.getOptionsByQuestionId(question.getQuestionId());
			questionOptions.setOptions(optionsByQuestionId);
			questionsAndOptionsBySectionId.add(questionOptions);
		}
		return questionsAndOptionsBySectionId;
	}
	@Override
	public boolean saveQuestionOptions(QuestionOptions questionOptions) {
		boolean saveQuestionOptionsResponse = false;
		Question saveQuestionResponse = questionService.saveQuestion(questionOptions.getQuestion());
		if(saveQuestionResponse != null) {
			List<Option> saveOptions = optionsService.saveOptions(questionOptions.getOptions());
			if(!saveOptions.isEmpty()) {
				saveQuestionOptionsResponse = true;
			}
		}
		return saveQuestionOptionsResponse;
	}
	@Override
	public boolean saveAllQuestionsAndOptions(List<QuestionOptions> questionsAndOptions) {
		boolean saveAllQuestionsAndOptionsResponse = false;
		List<Question> questions = new ArrayList<Question>();
		List<Option> options = new ArrayList<Option>();
		
		for (QuestionOptions questionOptions : questionsAndOptions) {
			questions.add(questionOptions.getQuestion());
			options.addAll(questionOptions.getOptions());
		}
		List<Question> saveQuestionsResponse = questionService.saveQuestions(questions);
		if(!saveQuestionsResponse.isEmpty()) {
			List<Option> saveOptionsResponse = optionsService.saveOptions(options);
			if(!saveOptionsResponse.isEmpty()) {
				saveAllQuestionsAndOptionsResponse = true;
			}
		}
		return saveAllQuestionsAndOptionsResponse;
	}


}
