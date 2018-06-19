package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "option")
public class Option {
	@Id
	@Column(name = "optionId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer optionId;
	private Character optionIndicator;
	private String optionValueInEnglish;
	private String optionImageInEnglishURL;
	private String optionImageRegionalURL;
	private String optionValueInRegional;
	private Integer questionId;
	private Boolean active;

	/**
	 * 
	 */
	public Option() {
	}

	/**
	 * @param optionId
	 * @param optionIndicator
	 * @param optionValueInEnglish
	 * @param optionImageInEnglishURL
	 * @param optionImageRegionalURL
	 * @param optionValueInRegional
	 * @param questionId
	 * @param active
	 */
	public Option(Integer optionId, Character optionIndicator, String optionValueInEnglish,
			String optionImageInEnglishURL, String optionImageRegionalURL, String optionValueInRegional,
			Integer questionId, Boolean active) {
		this.optionId = optionId;
		this.optionIndicator = optionIndicator;
		this.optionValueInEnglish = optionValueInEnglish;
		this.optionImageInEnglishURL = optionImageInEnglishURL;
		this.optionImageRegionalURL = optionImageRegionalURL;
		this.optionValueInRegional = optionValueInRegional;
		this.questionId = questionId;
		this.active = active;
	}

	/**
	 * @return the optionId
	 */
	public Integer getOptionId() {
		return optionId;
	}

	/**
	 * @param optionId
	 *            the optionId to set
	 */
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	/**
	 * @return the optionIndicator
	 */
	public Character getOptionIndicator() {
		return optionIndicator;
	}

	/**
	 * @param optionIndicator
	 *            the optionIndicator to set
	 */
	public void setOptionIndicator(Character optionIndicator) {
		this.optionIndicator = optionIndicator;
	}

	/**
	 * @return the optionValueInEnglish
	 */
	public String getOptionValueInEnglish() {
		return optionValueInEnglish;
	}

	/**
	 * @param optionValueInEnglish
	 *            the optionValueInEnglish to set
	 */
	public void setOptionValueInEnglish(String optionValueInEnglish) {
		this.optionValueInEnglish = optionValueInEnglish;
	}

	/**
	 * @return the optionImageInEnglishURL
	 */
	public String getOptionImageInEnglishURL() {
		return optionImageInEnglishURL;
	}

	/**
	 * @param optionImageInEnglishURL
	 *            the optionImageInEnglishURL to set
	 */
	public void setOptionImageInEnglishURL(String optionImageInEnglishURL) {
		this.optionImageInEnglishURL = optionImageInEnglishURL;
	}

	/**
	 * @return the optionImageRegionalURL
	 */
	public String getOptionImageRegionalURL() {
		return optionImageRegionalURL;
	}

	/**
	 * @param optionImageRegionalURL
	 *            the optionImageRegionalURL to set
	 */
	public void setOptionImageRegionalURL(String optionImageRegionalURL) {
		this.optionImageRegionalURL = optionImageRegionalURL;
	}

	/**
	 * @return the optionValueInRegional
	 */
	public String getOptionValueInRegional() {
		return optionValueInRegional;
	}

	/**
	 * @param optionValueInRegional
	 *            the optionValueInRegional to set
	 */
	public void setOptionValueInRegional(String optionValueInRegional) {
		this.optionValueInRegional = optionValueInRegional;
	}

	/**
	 * @return the questionId
	 */
	public Integer getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId
	 *            the questionId to set
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", optionIndicator=" + optionIndicator + ", optionValueInEnglish="
				+ optionValueInEnglish + ", optionImageInEnglishURL=" + optionImageInEnglishURL
				+ ", optionImageRegionalURL=" + optionImageRegionalURL + ", optionValueInRegional="
				+ optionValueInRegional + ", questionId=" + questionId + ", active=" + active + "]";
	}

}
