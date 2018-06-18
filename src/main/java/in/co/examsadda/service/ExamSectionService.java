package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.crud.repository.SectionRepository;
import in.co.examsadda.entity.Section;
import in.co.examsadda.model.ExamSection;
import in.co.examsadda.model.QuestionOptions;
import in.co.examsadda.model.SectionQuestions;

@Service
public class ExamSectionService {
	@Autowired
	private SectionRepository sectionRepository;
	@Autowired
	private QuestionService questionService;

	public ExamSection getSectionBySectionId(Integer sectionId) {
		ExamSection examSection = new ExamSection();
		Section section = sectionRepository.findById(sectionId).get();
		examSection.setSection(section);
		List<QuestionOptions> questionsBySectionId = questionService.getQuestionsBySectionId(section.getSectionId());
		//TODO need to resolve complexity here.
		SectionQuestions sectionQuestions = new SectionQuestions(questionsBySectionId);
		examSection.setQuestions(sectionQuestions);
		return examSection;
	}

	public List<ExamSection> getAllSectionsByPracticepaperId(Integer practicePaperId) {
		List<ExamSection> sectionsListByExamPaper = new ArrayList<>();
		List<Section> sectionsListByExam = sectionRepository.findAllByPracticePaperId(practicePaperId);
		for(Section section: sectionsListByExam) {
			ExamSection examSection = getSectionBySectionId(section.getSectionId());
			sectionsListByExamPaper.add(examSection);
		}
		return sectionsListByExamPaper;
	}
}
