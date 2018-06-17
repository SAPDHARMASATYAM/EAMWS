package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.OptionRepository;
import in.co.examsadda.crud.repository.QuestionRepository;
import in.co.examsadda.crud.repository.SectionRepository;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.model.ExamPaper;

@Service
public class ExamPaperService implements IExamPaperService {
	
	@Autowired
	PracticePaperService practicePaperService;

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private OptionRepository optionRepository;
	@Override
	public ExamPaper findExamPaperByExamPaperId(Integer examPaperId) throws Exception {
		ExamPaper examPaper = new ExamPaper();
		
		// Reading practice paper details
		PracticePaper practicePaper = practicePaperService.getPracticePaperByPracticePaperId(examPaperId);
		examPaper.setExamPaper(practicePaper);
		return examPaper;
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
