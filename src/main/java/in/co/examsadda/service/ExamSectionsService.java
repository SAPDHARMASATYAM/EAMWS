package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.model.ExamSection;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public interface ExamSectionsService {

	public ExamSection getExamSectionBySectionId(Integer sectionId);
	public List<ExamSection> getAllExamSectionsByPracticepaperId(Integer practicePaperId);
	
	public ExamSection saveExamSection(ExamSection examSection);
	public List<ExamSection> saveAllExamSections(List<ExamSection> examSections);

}