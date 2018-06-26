package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.PracticePaperRepository;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.model.ExamSection;

@Service
public class PracticePaperService {

	@Autowired
	private PracticePaperRepository practicePaperRepository;
	@Autowired
	private ExamSectionService examSectionService;

	public ExamPaper getPracticePaperByPracticePaperId(Integer examPaperId) {
		ExamPaper examPaper = new ExamPaper();
		PracticePaper practicePaper = practicePaperRepository.findById(examPaperId).get();
//		examPaper.setExamPaper(practicePaper);
//		List<ExamSection> allSectionsByPracticepaperId = examSectionService
//				.getAllSectionsByPracticepaperId(practicePaper.getPaperId());
//		examPaper.setSections(allSectionsByPracticepaperId);
		return examPaper;
	}

	public List<ExamPaper> getPracticePapersByCourseId(Integer courseId) {
		List<ExamPaper> practicePapersLisByCourseId = new ArrayList<ExamPaper>();
		List<PracticePaper> practicePapersLisByCourse = practicePaperRepository.findAllByCourseId(courseId);
		for (PracticePaper practicePaper : practicePapersLisByCourse) {
			ExamPaper examPaper = getPracticePaperByPracticePaperId(practicePaper.getPaperId());
			practicePapersLisByCourseId.add(examPaper);
		}
		return practicePapersLisByCourseId;
	}
}
