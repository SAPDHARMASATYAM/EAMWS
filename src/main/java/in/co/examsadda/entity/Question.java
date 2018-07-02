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
public class Question implements Serializable, Persistable<Integer> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="question_id", unique=true, nullable=false)
	private Integer questionId;

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

	@Column(name="section_id_fk", nullable=false)
	private int sectionIdFk;

	@Column(name="user_answer_for_this_question", nullable=false, length=1)
	private String userAnswerForThisQuestion;
	
	@Transient
	private boolean isNew = false;
	
	public Question() {
	}

	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getAnswerForThisQuestion() {
		return this.answerForThisQuestion;
	}

	public void setAnswerForThisQuestion(String answerForThisQuestion) {
		this.answerForThisQuestion = answerForThisQuestion;
	}

	public boolean getIsQuestionActive() {
		return this.isQuestionActive;
	}

	public void setIsQuestionActive(boolean isQuestionActive) {
		this.isQuestionActive = isQuestionActive;
	}

	public boolean getIsQuestionHasImage() {
		return this.isQuestionHasImage;
	}

	public void setIsQuestionHasImage(boolean isQuestionHasImage) {
		this.isQuestionHasImage = isQuestionHasImage;
	}

	public int getPracticePaperIdFk() {
		return this.practicePaperIdFk;
	}

	public void setPracticePaperIdFk(int practicePaperIdFk) {
		this.practicePaperIdFk = practicePaperIdFk;
	}

	public String getQuestionInEnglish() {
		return this.questionInEnglish;
	}

	public void setQuestionInEnglish(String questionInEnglish) {
		this.questionInEnglish = questionInEnglish;
	}

	public String getQuestionInEnglishImageUrl() {
		return this.questionInEnglishImageUrl;
	}

	public void setQuestionInEnglishImageUrl(String questionInEnglishImageUrl) {
		this.questionInEnglishImageUrl = questionInEnglishImageUrl;
	}

	public String getQuestionInRegional() {
		return this.questionInRegional;
	}

	public void setQuestionInRegional(String questionInRegional) {
		this.questionInRegional = questionInRegional;
	}

	public String getQuestionInRegionalImageUrl() {
		return this.questionInRegionalImageUrl;
	}

	public void setQuestionInRegionalImageUrl(String questionInRegionalImageUrl) {
		this.questionInRegionalImageUrl = questionInRegionalImageUrl;
	}

	public int getSectionIdFk() {
		return this.sectionIdFk;
	}

	public void setSectionIdFk(int sectionIdFk) {
		this.sectionIdFk = sectionIdFk;
	}

	public String getUserAnswerForThisQuestion() {
		return this.userAnswerForThisQuestion;
	}

	public void setUserAnswerForThisQuestion(String userAnswerForThisQuestion) {
		this.userAnswerForThisQuestion = userAnswerForThisQuestion;
	}

	@Override
	public Integer getId() {
		return this.questionId;
	}

	@Override
	public boolean isNew() {
		// TODO Auto-generated method stub
		return false;
	}

}