package in.co.examsadda.util;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.Section;
import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.model.QuestionOptions;
import in.co.examsadda.model.SectionQuestions;

public class ExamController {


    public static void main(String... s) {
        ExamController examController = new ExamController();
        try {
            ExamPaper examPaperByExamPaperId = examController.getExamPaperByExamPaperId(1);
            System.out.println(examPaperByExamPaperId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /* This method is for single practice paper based on practice paper id */
    public ExamPaper getExamPaperByExamPaperId(Integer examPaperId) {
        return getExamPaper(examPaperId,1);
    }

    public List<ExamPaper> getExamPapersByCourseId(Integer courseId) {
        List<ExamPaper> examPapers = new ArrayList<ExamPaper>();
        for (int i = 1; i <= 20; i++) {
            examPapers.add(getExamPaperByExamPaperId(i));
        }
        return examPapers;
    }

    private ExamPaper getExamPaper(int practicePaperId,int courseId) {
        ExamPaper examPaper = new ExamPaper();
        examPaper.setPracticePaper(getPracticePaper(practicePaperId,courseId));
        for (int i = 1; i <= 5; i++) {
            examPaper.getSections().add(getSectionQuestions(i, practicePaperId));
        }
        return examPaper;
    }

    private PracticePaper getPracticePaper(int practicePaperId, int courseId) {
        PracticePaper practicePaper = new PracticePaper();
        practicePaper.setPaperId(practicePaperId);
        practicePaper.setActive(true);
        practicePaper.setPaperNameInEnglish("Practice Paper : " + practicePaperId);
        practicePaper.setPaperNameInRegional("అభ్యాస పరీక్ష : " + practicePaperId);
        practicePaper.setDuration(180);
        practicePaper.setCourseId(courseId);
        return practicePaper;
    }

    private SectionQuestions getSectionQuestions(int sectionId, int practicePaperId) {
        SectionQuestions sectionQuestions = new SectionQuestions();
        sectionQuestions.setSection(getSection(sectionId, practicePaperId));
        for (int i = 1; i <= sectionQuestions.getSection().getNumberOfQuestions(); i++) {
            sectionQuestions.getQuestions().add(getQuestionOptions(i, sectionId));
        }
        return sectionQuestions;
    }

    private Section getSection(int sectionId, int practicePaperId) {
        Section section = new Section();
        section.setSectionId(sectionId);
        section.setActive(true);
        section.setNameInEnglish("Section : " + sectionId);
        section.setNameInRegional("విభాగం : " + sectionId);
        section.setPracticePaperId(practicePaperId);
        section.setNumberOfQuestions(50);
        return section;
    }

    private QuestionOptions getQuestionOptions(int questionId, int sectionId) {
        QuestionOptions questionOptions = new QuestionOptions();
        questionOptions.setQuestion(getQuestion(questionId, sectionId));
        int optionIndicator = 65;
        for (int i = 0; i <= questionOptions.getQuestion().getNumberOfOptions(); i++) {
            char oi = (char) optionIndicator++;
            questionOptions.getOptions().add(getOption(questionOptions.getQuestion().getQuestionId(), questionOptions.getQuestion().getIsQuestionHasImage(), oi));
        }
        return questionOptions;
    }

    public Question getQuestion(int questionId, int sectionId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        question.setSectionId(sectionId);
        question.setNumberOfOptions(5);
        question.setQuestionInEnglish("Question : " + questionId);
        question.setQuestionInRegional("ప్రశ్న : " + questionId);
        if (questionId % 5 != 0) {
            question.setIsQuestionHasImage(false);
        } else {
            question.setIsQuestionHasImage(true);
            question.setQuestionImageInEnglishURL("http://placehold.it/120x120&text=image1");
            question.setQuestionImageInRegionalURL("http://placehold.it/120x120&text=image2");
        }
        question.setAnswer('A');
        question.setActive(true);
        return question;
    }

    private Option getOption(int questionId, boolean hasImage, char optionIndicator) {
        Option option = new Option();
        option.setActive(true);
        option.setQuestionId(questionId);
        option.setOptionIndicator(optionIndicator);
        option.setOptionValueInEnglish(" Option : " + optionIndicator);
        option.setOptionValueInRegional("ఎంపిక : " + optionIndicator);
        if (hasImage) {
            option.setOptionImageRegionalURL("http://placehold.it/120x120&text=image3");
            option.setOptionImageRegionalURL("http://placehold.it/120x120&text=image4");
        }
        return option;
    }
}
