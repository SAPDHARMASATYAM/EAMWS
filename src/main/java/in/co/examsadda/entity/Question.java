package in.co.examsadda.entity;

public class Question {
	private Integer questionId;
	private String questionInEnglish;
	private String questionInRegional;
	private Byte [] questionImageInEnglish;
	private Byte [] questionImageInRegional;
	private Integer numberOfOptions;
	private Character answer;
	private Integer sectionId;
	/**
	 * 
	 */
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param questionId
	 * @param questionInEnglish
	 * @param questionInRegional
	 * @param questionImageInEnglish
	 * @param questionImageInRegional
	 * @param numberOfOptions
	 * @param answer
	 * @param sectionId
	 */
	public Question(Integer questionId, String questionInEnglish, String questionInRegional,
			Byte[] questionImageInEnglish, Byte[] questionImageInRegional, Integer numberOfOptions, Character answer,
			Integer sectionId) {
		this.questionId = questionId;
		this.questionInEnglish = questionInEnglish;
		this.questionInRegional = questionInRegional;
		this.questionImageInEnglish = questionImageInEnglish;
		this.questionImageInRegional = questionImageInRegional;
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
	 * @return the questionImageInEnglish
	 */
	public Byte[] getQuestionImageInEnglish() {
		return questionImageInEnglish;
	}
	/**
	 * @param questionImageInEnglish the questionImageInEnglish to set
	 */
	public void setQuestionImageInEnglish(Byte[] questionImageInEnglish) {
		this.questionImageInEnglish = questionImageInEnglish;
	}
	/**
	 * @return the questionImageInRegional
	 */
	public Byte[] getQuestionImageInRegional() {
		return questionImageInRegional;
	}
	/**
	 * @param questionImageInRegional the questionImageInRegional to set
	 */
	public void setQuestionImageInRegional(Byte[] questionImageInRegional) {
		this.questionImageInRegional = questionImageInRegional;
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
				+ ", questionInRegional=" + questionInRegional + ", numberOfOptions=" + numberOfOptions + ", answer="
				+ answer + ", sectionId=" + sectionId + "]";
	}
	
}
