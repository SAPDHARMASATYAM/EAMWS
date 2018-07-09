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
	public ExamSection saveExamSection(ExamSection examSection) {
		ExamSection saveExamSectionResponse = new  ExamSection();
		Section saveSectionResponse = sectionService.saveSection(examSection.getSection());
		if(saveSectionResponse != null) {
			saveExamSectionResponse.setSection(saveSectionResponse);
			List<QuestionOptions> questionsAndOptionsList = populateSectionIdInQuestionsList(examSection.getQuestions(),saveSectionResponse);
			List<QuestionOptions> saveAllQuestionsAndOptionsResponse = questionOptionsService.saveAllQuestionsAndOptions(questionsAndOptionsList);
			if(!saveAllQuestionsAndOptionsResponse.isEmpty()) {
				saveExamSectionResponse.setQuestions(saveAllQuestionsAndOptionsResponse);
			}
		}
		return saveExamSectionResponse;
	}
	private List<QuestionOptions> populateSectionIdInQuestionsList(List<QuestionOptions> questionOptions, Section saveSectionResponse) {
		for(int index=0;index<questionOptions.size();index++) {
			questionOptions.get(index).getQuestion().setSection(saveSectionResponse);
		}
		return questionOptions;
	}
	@Override
	public List<ExamSection> saveAllExamSections(List<ExamSection> examSections) {
		List<ExamSection> saveAllExamSectionsResponse = new ArrayList<ExamSection>();
		for(ExamSection examSection : examSections) {
			saveAllExamSectionsResponse.add(saveExamSection(examSection));
		}
		return saveAllExamSectionsResponse;
	}



}
