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
	public QuestionOptions saveQuestionOptions(QuestionOptions questionOptions) {
		QuestionOptions saveQuestionOptionsResponse = new QuestionOptions();
		Question saveQuestionResponse = questionService.saveQuestion(questionOptions.getQuestion());
		if(saveQuestionResponse != null) {
			saveQuestionOptionsResponse.setQuestion(saveQuestionResponse);
			List<Option> questionInOptionsList = populateQuestionInOptionsList(questionOptions.getOptions(), saveQuestionResponse);
			List<Option> saveOptions = optionsService.saveOptions(questionInOptionsList);
			if(!saveOptions.isEmpty()) {
				saveQuestionOptionsResponse.setOptions(saveOptions);
			}
		}
		return saveQuestionOptionsResponse;
	}
	
	@Override
	public List<QuestionOptions> saveAllQuestionsAndOptions(List<QuestionOptions> questionsAndOptions) {
		List<QuestionOptions> saveAllQuestionsAndOptionsResponse = new ArrayList<QuestionOptions>();
		for (QuestionOptions questionOptions : questionsAndOptions) {
			QuestionOptions saveQuestionOptionsResponse = saveQuestionOptions(questionOptions);
			saveAllQuestionsAndOptionsResponse.add(saveQuestionOptionsResponse);
		}
		return saveAllQuestionsAndOptionsResponse;
	}

	private List<Option> populateQuestionInOptionsList(List<Option> questionOptions, Question question){
		for(int i=0;i<questionOptions.size();i++) {
			questionOptions.get(i).setQuestion(question);
		}
		return questionOptions;
	}

}
