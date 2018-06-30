package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.model.QuestionOptions;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface QuestionService {

	QuestionOptions getQuestionByquestionId(Integer questionId);

	List<QuestionOptions> getQuestionsBySectionId(Integer sectionId);

}