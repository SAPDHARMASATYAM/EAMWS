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
		Section sectionBySectionIdResponse = sectionService.getSectionBySectionId(sectionId);
		examSection.setSection(sectionBySectionIdResponse);
		List<QuestionOptions> allQuestionsAndOptionsBySectionIdResponse = questionOptionsService.getAllQuestionsAndOptionsBySectionId(sectionBySectionIdResponse.getSectionId());
		examSection.setQuestions(allQuestionsAndOptionsBySectionIdResponse);
		return examSection;
	}
	@Override
	public List<ExamSection> getAllExamSectionsByPracticepaperId(Integer practicePaperId) {
		List<ExamSection> examSections = new ArrayList<ExamSection>();
		List<Section> allSectionsByPracticePaperIdResponse = sectionService.getAllSectionsByPracticePaperId(practicePaperId);
		for (Section section : allSectionsByPracticePaperIdResponse) {
			ExamSection examSection = new ExamSection();
			examSection.setSection(section);
			List<QuestionOptions> allQuestionsAndOptionsBySectionIdResponse = questionOptionsService.getAllQuestionsAndOptionsBySectionId(section.getSectionId());
			examSection.setQuestions(allQuestionsAndOptionsBySectionIdResponse);
			examSections.add(examSection);
		}
		return examSections;
	}
	@Override
	public boolean saveExamSection(ExamSection examSection) {
		boolean saveExamSectionResponse = false;
		Section saveSectionResponse = sectionService.saveSection(examSection.getSection());
		if(saveSectionResponse != null) {
			boolean saveAllQuestionsAndOptionsResponse = questionOptionsService.saveAllQuestionsAndOptions(examSection.getQuestions());
			if(saveAllQuestionsAndOptionsResponse) {
				saveExamSectionResponse=true;
			}
		}
		return saveExamSectionResponse;
	}
	@Override
	public boolean saveAllExamSections(List<ExamSection> examSections) {
		boolean saveAllExamSectionsResponse = false;
		List<Section> sections = new ArrayList<Section>();
		List<QuestionOptions> questions = new ArrayList<QuestionOptions>();
		for (ExamSection examSection : examSections) {
			sections.add(examSection.getSection());
			questions.addAll(examSection.getQuestions());
		}
		List<Section> saveSectionsResponse = sectionService.saveSections(sections);
		if(!saveSectionsResponse.isEmpty()) {
			boolean saveAllQuestionsAndOptions = questionOptionsService.saveAllQuestionsAndOptions(questions);
			if(saveAllQuestionsAndOptions) {
				saveAllExamSectionsResponse = true;
			}
		}
		return saveAllExamSectionsResponse;
	}



}
