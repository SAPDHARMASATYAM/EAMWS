package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.QuestionRepository;
import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.Question;
import in.co.examsadda.model.QuestionOptions;

@Service
public class QuestionServiceBean {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private OptionsServiceBean optionsService;

	public QuestionOptions getQuestionByquestionId(Integer questionId) {
		QuestionOptions questionOptions = new QuestionOptions();
		Question question = questionRepository.findById(questionId).get();
		questionOptions.setQuestion(question);
//		List<Option> optionsByQuestionId = optionsService.getOptionsByQuestionId(question.getQuestionId());
//		questionOptions.setOptions(optionsByQuestionId);
		return questionOptions;
	}

	public List<QuestionOptions> getQuestionsBySectionId(Integer sectionId) {
//		List<QuestionOptions> questionsBySectionId = new ArrayList<>();
//		List<Question> questionsBySection = questionRepository.findAllBySectionId(sectionId);
//		for (Question question : questionsBySection) {
////			QuestionOptions questionOptions = getQuestionByquestionId(question.getQuestionId());
////			questionsBySectionId.add(questionOptions);
//		}
//		return questionsBySectionId;
		return null;
	}
}
