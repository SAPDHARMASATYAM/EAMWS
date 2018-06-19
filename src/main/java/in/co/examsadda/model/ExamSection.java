package in.co.examsadda.model;

import in.co.examsadda.entity.Section;

public class ExamSection {
	private Section section;
	private SectionQuestions questions;

	/**
	 * 
	 */
	public ExamSection() {
		section = new Section();
		questions = new SectionQuestions();
	}

	/**
	 * @param section
	 * @param questions
	 */
	public ExamSection(Section section, SectionQuestions questions) {
		this.section = section;
		this.questions = questions;
	}

	/**
	 * @return the section
	 */
	public Section getSection() {
		return section;
	}

	/**
	 * @param section
	 *            the section to set
	 */
	public void setSection(Section section) {
		this.section = section;
	}

	/**
	 * @return the questions
	 */
	public SectionQuestions getQuestions() {
		return questions;
	}

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(SectionQuestions questions) {
		this.questions = questions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExamSection [section=" + section + ", questions=" + questions + "]";
	}

}
