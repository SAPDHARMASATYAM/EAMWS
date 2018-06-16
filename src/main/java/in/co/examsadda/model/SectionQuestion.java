package in.co.examsadda.model;

import java.util.List;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.Question;

public class SectionQuestion {
	private Question question;
	private List<Option> options;
	/**
	 * 
	 */
	public SectionQuestion() {
		super();
	}
	/**
	 * @param question
	 * @param options
	 */
	public SectionQuestion(Question question, List<Option> options) {
		this.question = question;
		this.options = options;
	}
	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
	/**
	 * @return the options
	 */
	public List<Option> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SectionQuestion [question=" + question + ", options=" + options + "]";
	}
	
}
