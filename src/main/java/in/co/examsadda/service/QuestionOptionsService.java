package in.co.examsadda.service;

import java.math.BigInteger;
import java.util.List;

import in.co.examsadda.model.QuestionOptions;

public interface QuestionOptionsService {

	QuestionOptions getQuestionOptionsByQuestionId(BigInteger questionId);

	List<QuestionOptions> getAllQuestionOptionsBySectionId(int sectionId);

}