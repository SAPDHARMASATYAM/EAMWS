package in.co.examsadda.service;

import java.util.List;

import in.co.examsadda.model.QuestionOptions;

public interface QuestionOptionsService {
	
	public QuestionOptions getQuestionOptionsByQuestionId(Long questionId);
	public List<QuestionOptions> getAllQuestionsAndOptionsBySectionId(int sectionId);
	
	public boolean saveQuestionOptions(QuestionOptions questionOptions);
	public boolean saveAllQuestionsAndOptions(List<QuestionOptions> questionOptions);
	
}