package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@Column(name="questionId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer questionId;
	private String questionInEnglish;
	private String questionInRegional;
	private String questionImageInEnglishURL;
	private String questionImageInRegionalURL;
	private Integer numberOfOptions;
	private Character answer;
	private Integer sectionId;
	/**
	 * 
	 */
	public Question() {
		super();
	}
	/**
	 * @param questionId
	 * @param questionInEnglish
	 * @param questionInRegional
	 * @param questionImageInEnglishURL
	 * @param questionImageInRegionalURL
	 * @param numberOfOptions
	 * @param answer
	 * @param sectionId
	 */
	public Question(Integer questionId, String questionInEnglish, String questionInRegional,
			String questionImageInEnglishURL, String questionImageInRegionalURL, Integer numberOfOptions,
			Character answer, Integer sectionId) {
		this.questionId = questionId;
		this.questionInEnglish = questionInEnglish;
		this.questionInRegional = questionInRegional;
		this.questionImageInEnglishURL = questionImageInEnglishURL;
		this.questionImageInRegionalURL = questionImageInRegionalURL;
		this.numberOfOptions = numberOfOptions;
		this.answer = answer;
		this.sectionId = sectionId;
	}
	/**
	 * @return the questionId
	 */
	public Integer getQuestionId() {
		return questionId;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the questionInEnglish
	 */
	public String getQuestionInEnglish() {
		return questionInEnglish;
	}
	/**
	 * @param questionInEnglish the questionInEnglish to set
	 */
	public void setQuestionInEnglish(String questionInEnglish) {
		this.questionInEnglish = questionInEnglish;
	}
	/**
	 * @return the questionInRegional
	 */
	public String getQuestionInRegional() {
		return questionInRegional;
	}
	/**
	 * @param questionInRegional the questionInRegional to set
	 */
	public void setQuestionInRegional(String questionInRegional) {
		this.questionInRegional = questionInRegional;
	}
	/**
	 * @return the questionImageInEnglishURL
	 */
	public String getQuestionImageInEnglishURL() {
		return questionImageInEnglishURL;
	}
	/**
	 * @param questionImageInEnglishURL the questionImageInEnglishURL to set
	 */
	public void setQuestionImageInEnglishURL(String questionImageInEnglishURL) {
		this.questionImageInEnglishURL = questionImageInEnglishURL;
	}
	/**
	 * @return the questionImageInRegionalURL
	 */
	public String getQuestionImageInRegionalURL() {
		return questionImageInRegionalURL;
	}
	/**
	 * @param questionImageInRegionalURL the questionImageInRegionalURL to set
	 */
	public void setQuestionImageInRegionalURL(String questionImageInRegionalURL) {
		this.questionImageInRegionalURL = questionImageInRegionalURL;
	}
	/**
	 * @return the numberOfOptions
	 */
	public Integer getNumberOfOptions() {
		return numberOfOptions;
	}
	/**
	 * @param numberOfOptions the numberOfOptions to set
	 */
	public void setNumberOfOptions(Integer numberOfOptions) {
		this.numberOfOptions = numberOfOptions;
	}
	/**
	 * @return the answer
	 */
	public Character getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(Character answer) {
		this.answer = answer;
	}
	/**
	 * @return the sectionId
	 */
	public Integer getSectionId() {
		return sectionId;
	}
	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionInEnglish=" + questionInEnglish
				+ ", questionInRegional=" + questionInRegional + ", questionImageInEnglishURL="
				+ questionImageInEnglishURL + ", questionImageInRegionalURL=" + questionImageInRegionalURL
				+ ", numberOfOptions=" + numberOfOptions + ", answer=" + answer + ", sectionId=" + sectionId + "]";
	}
	
}
