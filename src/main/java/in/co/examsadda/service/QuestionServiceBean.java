package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Question;
import in.co.examsadda.jpa.QuestionRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class QuestionServiceBean implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question getQuestionByQuestionId(Long questionId) {
		Question getQuestionByQuestionIdResponse = questionRepository.getOne(questionId);
		return getQuestionByQuestionIdResponse;
	}

	@Override
	public List<Question> getQuestionsBySectionId(int sectionId) {
		List<Question> findAllBySectionSectionIdResponse = questionRepository.findAllBySectionSectionId(sectionId);
		return findAllBySectionSectionIdResponse;
	}

	@Override
	public Question saveQuestion(Question question) {
		Question saveQuestionResponse = questionRepository.save(question);
		return saveQuestionResponse;
	}

	@Override
	public List<Question> saveQuestions(List<Question> questions) {
		List<Question> saveQuestionsResponse = questionRepository.saveAll(questions);
		return saveQuestionsResponse;
	}

}
