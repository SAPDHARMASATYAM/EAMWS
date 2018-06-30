package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.model.ExamSection;

public class ExamPaperServiceBean implements ExamPaperService{

	@Autowired
	private PracticePaperService practicePaperService;
	@Autowired
	private ExamSectionsService examSectionsService;
	@Override
	public ExamPaper findExamPaperByExamPaperId(Integer examPaperId) throws Exception {
		ExamPaper examPaper = new ExamPaper();
		PracticePaper practicePaper=null;
		List<ExamSection> sections = null;
		practicePaper = practicePaperService.getPracticePaperByPracticePaperId(examPaperId);
		sections = examSectionsService.getAllSectionsByPracticepaperId(examPaperId);
		examPaper.setPracticePaper(practicePaper);
		examPaper.setSections(sections);
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
