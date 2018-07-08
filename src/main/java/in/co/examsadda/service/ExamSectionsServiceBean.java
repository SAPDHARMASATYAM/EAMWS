package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.Section;
import in.co.examsadda.model.ExamSection;
import in.co.examsadda.model.QuestionOptions;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ExamSectionsServiceBean implements ExamSectionsService {
	
	@Autowired
	private SectionService sectionService;
	@Autowired
	private QuestionOptionsService questionOptionsService;

	@Override
	public ExamSection getExamSectionBySectionId(Integer sectionId) {
		ExamSection examSection = new ExamSection();
//		Section section = sectionService.getSectionBySectionId(sectionId);
//		examSection.setSection(section);
//		List<QuestionOptions> allQuestionOptionsBySectionId = questionOptionsService.getAllQuestionOptionsBySectionId(sectionId);
//		examSection.setQuestions(allQuestionOptionsBySectionId);
		return examSection;
	}

	@Override
	public List<ExamSection> getAllExamSectionsByPracticepaperId(Integer practicePaperId) {
		List<ExamSection> examSectionsByPracticePaperId = new ArrayList<ExamSection>();
//		List<Section> sectionsByPracticePaperId = sectionService.getSectionsByPracticePaperId(practicePaperId);
//		for (Section section : sectionsByPracticePaperId) {
//			ExamSection examSectionBySectionId = getExamSectionBySectionId(section.getSectionId());
//			examSectionsByPracticePaperId.add(examSectionBySectionId);
//		}
		return examSectionsByPracticePaperId;
	}
}
