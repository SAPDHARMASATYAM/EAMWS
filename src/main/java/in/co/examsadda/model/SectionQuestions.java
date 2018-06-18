package in.co.examsadda.model;

import java.util.ArrayList;
import java.util.List;

public class SectionQuestions {
	private List<QuestionOptions> questions;
	/**
	 * 
	 */
	public SectionQuestions() {
		questions = new ArrayList<>();
	}
	/**
	 * @param questions
	 */
	public SectionQuestions(List<QuestionOptions> questions) {
		this.questions = questions;
	}
	/**
	 * @return the questions
	 */
	public List<QuestionOptions> getQuestions() {
		return questions;
	}
	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<QuestionOptions> questions) {
		this.questions = questions;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SectionQuestions [questions=" + questions + "]";
	}
	
	
}
