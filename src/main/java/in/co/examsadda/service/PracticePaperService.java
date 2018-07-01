package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.PracticePaper;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface PracticePaperService {

	PracticePaper getPracticePaperByPracticePaperId(int practicePaperId);

	List<PracticePaper> getPracticePapersByCourseId(int courseId);

	List<PracticePaper> getPracticePapersByInstituteIdAndCourseId(String instituteId, int courseId);

}