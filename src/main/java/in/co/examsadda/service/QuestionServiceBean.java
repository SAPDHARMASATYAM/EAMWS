package in.co.examsadda.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Question;
import in.co.examsadda.jpa.repository.QuestionRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class QuestionServiceBean implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question getQuestionByquestionId(BigInteger questionId) {
		Question questionByQuestionId = questionRepository.findByQuestionId(questionId.intValue());
		return questionByQuestionId;
	}

	@Override
	public List<Question> getQuestionsBySectionId(int sectionId) {
		List<Question> questionsBySectionId = questionRepository.findAllBySectionIdFk(sectionId);
		return questionsBySectionId;
	}
}
