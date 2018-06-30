package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import in.co.examsadda.entity.Section;
import in.co.examsadda.model.ExamSection;
import in.co.examsadda.model.QuestionOptions;

public class ExamSectionsServiceBean implements ExamSectionsService {
	@Autowired
	private SectionService sectionService;
	@Autowired
	private QuestionService questionService;

	@Override
	public ExamSection getSectionBySectionId(Integer sectionId) {
		ExamSection examSection = new ExamSection();
		Section section = sectionService.getSectionBySectionId(sectionId);
		examSection.setSection(section);
		List<QuestionOptions> questionsBySectionId = questionService.getQuestionsBySectionId(section.getSectionId());
		examSection.setQuestions(questionsBySectionId);
		return examSection;
	}

	@Override
	public List<ExamSection> getAllSectionsByPracticepaperId(Integer practicePaperId) {
		List<ExamSection> examSectionsListByPracticePaperId = new ArrayList<>();
		List<Section> sectionsListByPracticePaperId = sectionService.getSectionsByPracticePaperId(practicePaperId);
		for (Section section : sectionsListByPracticePaperId) {
			ExamSection examSection = getSectionBySectionId(section.getSectionId());
			examSectionsListByPracticePaperId.add(examSection);
		}
		return examSectionsListByPracticePaperId;
	}
}
