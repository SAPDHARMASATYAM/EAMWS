package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.model.ExamPaper;

@Service
public class ExamPaperService{

	@Autowired
	PracticePaperService practicePaperService;

	public ExamPaper findExamPaperByExamPaperId(Integer examPaperId) throws Exception {
		return practicePaperService.getPracticePaperByPracticePaperId(examPaperId);
	}

	public List<ExamPaper> findExamPapersByExamId(Integer examId) {
		return null;
	}

	public String saveExamPaper(ExamPaper examPaper) {
		return null;
	}

	public String saveExamPapers(List<ExamPaper> examPapers) {
		return null;
	}

	public String updateExamPaperByExamId(ExamPaper examPaper) {
		return null;
	}

	public String deleteExamPaperByExamPaperId(Integer examPaperId) {
		return null;
	}

	public String deleteExamPapersByExamId(Integer examId) {
		return null;
	}

	public String activateExamPaperByExamPaperId(Integer examPaperId) {
		return null;
	}

	public String deactivateExamPaperByExamPaperId(Integer examPaperId) {
		return null;
	}

	public String activateExamPapersByExamId(Integer examId) {
		return null;
	}

	public String deactivateExamPapersByExamId(Integer examId) {
		return null;
	}

}
