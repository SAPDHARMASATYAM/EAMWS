package in.co.examsadda.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.jpa.repository.PracticePaperRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
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
	public List<PracticePaper> getPracticePapersByInstituteIdAndCourseId(String instituteId ,int courseId) {
		List<PracticePaper> practicePapersByInstituteIdAndCourseId = practicePaperRepository.findAllByInstituteIdFkAndCourseIdFk(instituteId, courseId);
		return practicePapersByInstituteIdAndCourseId;
	}
	
	
}
