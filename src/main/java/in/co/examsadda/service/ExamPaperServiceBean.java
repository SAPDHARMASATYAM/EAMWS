package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.model.ExamSection;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ExamPaperServiceBean implements ExamPaperService{

	@Autowired
	private PracticePaperService practicePaperService;
	@Autowired
	private ExamSectionsService examSectionsService;
	@Override
	public ExamPaper findExamPaperByExamPaperId(Integer examPaperId) throws Exception {
		ExamPaper examPaper = new ExamPaper();
		PracticePaper practicePaperByPracticePaperId = practicePaperService.getPracticePaperByPracticePaperId(examPaperId);
		examPaper.setPracticePaper(practicePaperByPracticePaperId);
		List<ExamSection> allExamSectionsByPracticepaperId = examSectionsService.getAllExamSectionsByPracticepaperId(examPaperId);
		examPaper.setSections(allExamSectionsByPracticepaperId);
		return examPaper;
	}

	@Override
	public List<ExamPaper> findExamPapersByCourseId(Integer courseId) {
		
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
