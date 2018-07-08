package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Question;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface QuestionService {
	
	public Question getQuestionByQuestionId(Long questionId);
	public List<Question> getQuestionsBySectionId(int sectionId);
	
	public Question saveQuestion(Question question);
	public List<Question> saveQuestions(List<Question> questions);
	
}