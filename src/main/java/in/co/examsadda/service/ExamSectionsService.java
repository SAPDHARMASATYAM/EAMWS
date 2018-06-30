package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.model.ExamSection;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface ExamSectionsService {

	ExamSection getSectionBySectionId(Integer sectionId);

	List<ExamSection> getAllSectionsByPracticepaperId(Integer practicePaperId);

}