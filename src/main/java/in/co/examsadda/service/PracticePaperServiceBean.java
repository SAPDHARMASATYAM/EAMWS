package in.co.examsadda.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import in.co.examsadda.crud.repository.PracticePaperRepository;
import in.co.examsadda.entity.PracticePaper;

public class PracticePaperServiceBean implements PracticePaperService {

	@Autowired
	private PracticePaperRepository practicePaperRepository;

	@Override
	public PracticePaper getPracticePaperByPracticePaperId(int practicePaperId) {
		return practicePaperRepository.findById(practicePaperId).get();
	}

	@Override
	public List<PracticePaper> getPracticePapersByCourseId(int courseId) {
		List<PracticePaper> practicePapersByCourseId = practicePaperRepository.findAllByCourseIdFk(courseId);
		return practicePapersByCourseId;
	}
	
	@Override
	public List<PracticePaper> getPracticePapersByByInstituteIdAndCourseId(String instituteId ,int courseId) {
		List<PracticePaper> practicePapersByInstituteIdAndCourseId = practicePaperRepository.findAllByInstituteIdFkAndCourseIdFk(instituteId, courseId);
		return practicePapersByInstituteIdAndCourseId;
	}
	
	
}
