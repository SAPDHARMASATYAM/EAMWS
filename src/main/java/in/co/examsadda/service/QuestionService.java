package in.co.examsadda.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Question;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface QuestionService {

	Question getQuestionByquestionId(BigInteger questionId);

	List<Question> getQuestionsBySectionId(int sectionId);

}