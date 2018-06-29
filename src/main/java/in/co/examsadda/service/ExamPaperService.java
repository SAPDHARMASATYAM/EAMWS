package in.co.examsadda.service;

import java.util.List;

import in.co.examsadda.model.ExamPaper;

public interface ExamPaperService {

	ExamPaper findExamPaperByExamPaperId(Integer examPaperId) throws Exception;

	List<ExamPaper> findExamPapersByExamId(Integer examId);

	String saveExamPaper(ExamPaper examPaper);

	String saveExamPapers(List<ExamPaper> examPapers);

	String updateExamPaperByExamId(ExamPaper examPaper);

	String deleteExamPaperByExamPaperId(Integer examPaperId);

	String deleteExamPapersByExamId(Integer examId);

	String activateExamPaperByExamPaperId(Integer examPaperId);

	String deactivateExamPaperByExamPaperId(Integer examPaperId);

	String activateExamPapersByExamId(Integer examId);

	String deactivateExamPapersByExamId(Integer examId);

}