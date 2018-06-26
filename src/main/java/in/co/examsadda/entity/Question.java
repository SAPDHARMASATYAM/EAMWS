package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@Column(name = "questionId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer questionId;
	private String questionInEnglish;
	private String questionInRegional;
	private String questionImageInEnglishURL;
	private String questionImageInRegionalURL;
	private Integer numberOfOptions;
	private Character answer;
	private Integer sectionId;
    private Boolean active;
    private Boolean isQuestionHasImage;

	/**
	 * 
	 */
	public Question() {
		super();
	}

	public Question(Integer questionId, String questionInEnglish, String questionInRegional,
			String questionImageInEnglishURL, String questionImageInRegionalURL, Integer numberOfOptions,
			Character answer, Integer sectionId, Boolean active, Boolean isQuestionHasImage) {
		super();
		this.questionId = questionId;
		this.questionInEnglish = questionInEnglish;
		this.questionInRegional = questionInRegional;
		this.questionImageInEnglishURL = questionImageInEnglishURL;
		this.questionImageInRegionalURL = questionImageInRegionalURL;
		this.numberOfOptions = numberOfOptions;
		this.answer = answer;
		this.sectionId = sectionId;
		this.active = active;
		this.isQuestionHasImage = isQuestionHasImage;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionInEnglish() {
		return questionInEnglish;
	}

	public void setQuestionInEnglish(String questionInEnglish) {
		this.questionInEnglish = questionInEnglish;
	}

	public String getQuestionInRegional() {
		return questionInRegional;
	}

	public void setQuestionInRegional(String questionInRegional) {
		this.questionInRegional = questionInRegional;
	}

	public String getQuestionImageInEnglishURL() {
		return questionImageInEnglishURL;
	}

	public void setQuestionImageInEnglishURL(String questionImageInEnglishURL) {
		this.questionImageInEnglishURL = questionImageInEnglishURL;
	}

	public String getQuestionImageInRegionalURL() {
		return questionImageInRegionalURL;
	}

	public void setQuestionImageInRegionalURL(String questionImageInRegionalURL) {
		this.questionImageInRegionalURL = questionImageInRegionalURL;
	}

	public Integer getNumberOfOptions() {
		return numberOfOptions;
	}

	public void setNumberOfOptions(Integer numberOfOptions) {
		this.numberOfOptions = numberOfOptions;
	}

	public Character getAnswer() {
		return answer;
	}

	public void setAnswer(Character answer) {
		this.answer = answer;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getIsQuestionHasImage() {
		return isQuestionHasImage;
	}

	public void setIsQuestionHasImage(Boolean isQuestionHasImage) {
		this.isQuestionHasImage = isQuestionHasImage;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionInEnglish=" + questionInEnglish
				+ ", questionInRegional=" + questionInRegional + ", questionImageInEnglishURL="
				+ questionImageInEnglishURL + ", questionImageInRegionalURL=" + questionImageInRegionalURL
				+ ", numberOfOptions=" + numberOfOptions + ", answer=" + answer + ", sectionId=" + sectionId
				+ ", active=" + active + ", isQuestionHasImage=" + isQuestionHasImage + "]";
	}

	
}
