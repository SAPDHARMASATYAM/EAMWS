package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;


/**
 * The persistent class for the question database table.
 * 
 */
@Entity
@Table(name="question")
@NamedQuery(name="Question.findAll", query="SELECT q FROM Question q")
public class Question implements Serializable, Persistable<Long> {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="question_id", unique=true, nullable=false)
	private Long questionId;

	@Column(name="answer_for_this_question", nullable=false, length=1)
	private String answerForThisQuestion;

	@Column(name="is_question_active", nullable=false)
	private boolean isQuestionActive;

	@Column(name="is_question_has_image", nullable=false)
	private boolean isQuestionHasImage;

	@Column(name="practice_paper_id_fk", nullable=false)
	private int practicePaperIdFk;

	
	@Column(name="question_in_english", nullable=false)
	private String questionInEnglish;

	
	@Column(name="question_in_english_image_url", nullable=false)
	private String questionInEnglishImageUrl;

	
	@Column(name="question_in_regional", nullable=false)
	private String questionInRegional;

	
	@Column(name="question_in_regional_image_url", nullable=false)
	private String questionInRegionalImageUrl;

	@ManyToOne
	@JoinColumn(name="section_id")
	private Section section;

	@Column(name="user_answer_for_this_question", nullable=false, length=1)
	private String userAnswerForThisQuestion;
	
	@Transient
	private boolean isNew = false;
	
	public Question() {
	}

	@Override
	public Long getId() {
		return this.getQuestionId();
	}

	@Override
	public boolean isNew() {
		return this.isNew;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getAnswerForThisQuestion() {
		return answerForThisQuestion;
	}

	public void setAnswerForThisQuestion(String answerForThisQuestion) {
		this.answerForThisQuestion = answerForThisQuestion;
	}

	public boolean isQuestionActive() {
		return isQuestionActive;
	}

	public void setQuestionActive(boolean isQuestionActive) {
		this.isQuestionActive = isQuestionActive;
	}

	public boolean isQuestionHasImage() {
		return isQuestionHasImage;
	}

	public void setQuestionHasImage(boolean isQuestionHasImage) {
		this.isQuestionHasImage = isQuestionHasImage;
	}

	public int getPracticePaperIdFk() {
		return practicePaperIdFk;
	}

	public void setPracticePaperIdFk(int practicePaperIdFk) {
		this.practicePaperIdFk = practicePaperIdFk;
	}

	public String getQuestionInEnglish() {
		return questionInEnglish;
	}

	public void setQuestionInEnglish(String questionInEnglish) {
		this.questionInEnglish = questionInEnglish;
	}

	public String getQuestionInEnglishImageUrl() {
		return questionInEnglishImageUrl;
	}

	public void setQuestionInEnglishImageUrl(String questionInEnglishImageUrl) {
		this.questionInEnglishImageUrl = questionInEnglishImageUrl;
	}

	public String getQuestionInRegional() {
		return questionInRegional;
	}

	public void setQuestionInRegional(String questionInRegional) {
		this.questionInRegional = questionInRegional;
	}

	public String getQuestionInRegionalImageUrl() {
		return questionInRegionalImageUrl;
	}

	public void setQuestionInRegionalImageUrl(String questionInRegionalImageUrl) {
		this.questionInRegionalImageUrl = questionInRegionalImageUrl;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public String getUserAnswerForThisQuestion() {
		return userAnswerForThisQuestion;
	}

	public void setUserAnswerForThisQuestion(String userAnswerForThisQuestion) {
		this.userAnswerForThisQuestion = userAnswerForThisQuestion;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", answerForThisQuestion=" + answerForThisQuestion
				+ ", isQuestionActive=" + isQuestionActive + ", isQuestionHasImage=" + isQuestionHasImage
				+ ", practicePaperIdFk=" + practicePaperIdFk + ", questionInEnglish=" + questionInEnglish
				+ ", questionInEnglishImageUrl=" + questionInEnglishImageUrl + ", questionInRegional="
				+ questionInRegional + ", questionInRegionalImageUrl=" + questionInRegionalImageUrl + ", section="
				+ section + ", userAnswerForThisQuestion=" + userAnswerForThisQuestion + "]";
	}
	
	
}