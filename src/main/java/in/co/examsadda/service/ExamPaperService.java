package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.model.ExamPaper;

@Service
public class ExamPaperService implements IExamPaperService{

	@Autowired
	PracticePaperService practicePaperService;
	ExamPaper examPaper;
	@Override
	public ExamPaper findExamPaperByExamPaperId(Integer examPaperId) throws Exception {
		 examPaper = practicePaperService.getPracticePaperByPracticePaperId(examPaperId);
		return examPaper;
	}

	@Override
	public List<ExamPaper> findExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveExamPaper(ExamPaper examPaper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveExamPapers(List<ExamPaper> examPapers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateExamPaperByExamId(ExamPaper examPaper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteExamPaperByExamPaperId(Integer examPaperId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String activateExamPaperByExamPaperId(Integer examPaperId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deactivateExamPaperByExamPaperId(Integer examPaperId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String activateExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deactivateExamPapersByExamId(Integer examId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
