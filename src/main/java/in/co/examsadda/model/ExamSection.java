package in.co.examsadda.model;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.entity.Section;

public class ExamSection {
	private Section section;
	private List<QuestionOptions> questions;
	public ExamSection() {
		questions = new ArrayList<QuestionOptions>();
	}
	public ExamSection(Section section, List<QuestionOptions> questions) {
		super();
		this.section = section;
		this.questions = questions;
	}
	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	public List<QuestionOptions> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionOptions> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "ExamSection [section=" + section + ", questions=" + questions + "]";
	}
	
	
}
