package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.dao.ExamPaperDAO;
import in.co.examsadda.model.ExamPaper;

@Service
public class ExamPaperService implements IExamPaperService {

	@Autowired
	private ExamPaperDAO examPaperServiceImpl;
	@Override
	public ExamPaper findExamPaperByExamPaperId(Integer examPaperId) {
	
		return examPaperServiceImpl.findExamPaperByExamPaperId(examPaperId);
	}

	@Override
	public List<ExamPaper> findExamPapersByExamId(Integer examId) {
	
		return null;
	}

	@Override
	public String saveExamPaper(ExamPaper examPaper) {
	
		return null;
	}

	@Override
	public String saveExamPapers(List<ExamPaper> examPapers) {
	
		return null;
	}

	@Override
	public String updateExamPaperByExamId(ExamPaper examPaper) {
	
		return null;
	}

	@Override
	public String deleteExamPaperByExamPaperId(Integer examPaperId) {
	
		return null;
	}

	@Override
	public String deleteExamPapersByExamId(Integer examId) {
	
		return null;
	}

	@Override
	public String activateExamPaperByExamPaperId(Integer examPaperId) {
	
		return null;
	}

	@Override
	public String deactivateExamPaperByExamPaperId(Integer examPaperId) {
	
		return null;
	}

	@Override
	public String activateExamPapersByExamId(Integer examId) {
	
		return null;
	}

	@Override
	public String deactivateExamPapersByExamId(Integer examId) {
	
		return null;
	}

	
}
