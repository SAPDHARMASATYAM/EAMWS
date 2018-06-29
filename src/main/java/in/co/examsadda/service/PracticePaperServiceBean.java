package in.co.examsadda.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.PracticePaperRepository;
import in.co.examsadda.entity.PracticePaper;

@Service
public class PracticePaperServiceBean {

	@Autowired
	private PracticePaperRepository practicePaperRepository;

	public PracticePaper getPracticePaperByPracticePaperId(int practicePaperId) {
		return practicePaperRepository.findById(practicePaperId).get();
	}

	public Set<PracticePaper> getPracticePapersByCourseId(int courseId) {
//		List<PracticePaper> practicePapersByCourseId = practicePaperRepository.findAllByCourseIdFk(courseId);
//		return new HashSet<PracticePaper>(practicePapersByCourseId);
		return null;
	}
	
	public Set<PracticePaper> getPracticePapersByByInstituteIdAndCourseId(String instituteId ,int courseId) {
//		List<PracticePaper> practicePapersByInstituteIdAndCourseId = practicePaperRepository.findAllByInstituteIdFkAndCourseIdFk(instituteId, courseId);
//		return new HashSet<PracticePaper>(practicePapersByInstituteIdAndCourseId);
		return null;
	}
	
	
}
