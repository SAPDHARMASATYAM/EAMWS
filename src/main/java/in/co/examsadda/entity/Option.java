package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;

/**
 * The persistent class for the option database table.
 * 
 */
@Entity
@Table(name = "options")
@NamedQuery(name = "Option.findAll", query = "SELECT o FROM Option o")
public class Option implements Serializable, Persistable<Long> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "option_Id", unique = true, nullable = false)
	private Long optionId;

	@Column(name = "is_option_active", nullable = false)
	private boolean isOptionActive;

	@Column(name = "is_option_has_image", nullable = false)
	private boolean isOptionHasImage;

	@Column(name = "option_indicator", nullable = false, length = 1)
	private String optionIndicator;

	@Column(name = "option_value_in_english", nullable = false)
	private String optionValueInEnglish;

	@Column(name = "option_value_in_english_image_url", nullable = true)
	private String optionValueInEnglishImageUrl;

	@Column(name = "option_value_in_regional", nullable = false)
	private String optionValueInRegional;

	@Column(name = "option_value_in_regional_image_url", nullable = true)
	private String optionValueInRegionalImageUrl;

	@ManyToOne
	@JoinColumn(name="question_id", nullable=false)
	private Question question;

	@Transient
	private boolean isNew = false;

	public Option() {
	}

	@Override
	public Long getId() {
		return this.getOptionId();
	}

	@Override
	public boolean isNew() {
		return this.isNew;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public boolean isOptionActive() {
		return isOptionActive;
	}

	public void setOptionActive(boolean isOptionActive) {
		this.isOptionActive = isOptionActive;
	}

	public boolean isOptionHasImage() {
		return isOptionHasImage;
	}

	public void setOptionHasImage(boolean isOptionHasImage) {
		this.isOptionHasImage = isOptionHasImage;
	}

	public String getOptionIndicator() {
		return optionIndicator;
	}

	public void setOptionIndicator(String optionIndicator) {
		this.optionIndicator = optionIndicator;
	}

	public String getOptionValueInEnglish() {
		return optionValueInEnglish;
	}

	public void setOptionValueInEnglish(String optionValueInEnglish) {
		this.optionValueInEnglish = optionValueInEnglish;
	}

	public String getOptionValueInEnglishImageUrl() {
		return optionValueInEnglishImageUrl;
	}

	public void setOptionValueInEnglishImageUrl(String optionValueInEnglishImageUrl) {
		this.optionValueInEnglishImageUrl = optionValueInEnglishImageUrl;
	}

	public String getOptionValueInRegional() {
		return optionValueInRegional;
	}

	public void setOptionValueInRegional(String optionValueInRegional) {
		this.optionValueInRegional = optionValueInRegional;
	}

	public String getOptionValueInRegionalImageUrl() {
		return optionValueInRegionalImageUrl;
	}

	public void setOptionValueInRegionalImageUrl(String optionValueInRegionalImageUrl) {
		this.optionValueInRegionalImageUrl = optionValueInRegionalImageUrl;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", isOptionActive=" + isOptionActive + ", isOptionHasImage="
				+ isOptionHasImage + ", optionIndicator=" + optionIndicator + ", optionValueInEnglish="
				+ optionValueInEnglish + ", optionValueInEnglishImageUrl=" + optionValueInEnglishImageUrl
				+ ", optionValueInRegional=" + optionValueInRegional + ", optionValueInRegionalImageUrl="
				+ optionValueInRegionalImageUrl + ", question=" + question + "]";
	}

	
}