package in.co.examsadda.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;

import org.springframework.data.domain.Persistable;

/**
 * The persistent class for the option database table.
 * 
 */
@Entity
@Table(name = "options")
@NamedQuery(name = "Option.findAll", query = "SELECT o FROM Option o")
public class Option implements Serializable, Persistable<BigInteger> {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "option_Id", unique = true, nullable = false)
	private BigInteger optionId;

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

	@Column(name = "question_id_fk", nullable = false)
	private java.math.BigInteger questionIdFk;

	@Column(name = "section_id_fk", nullable = false)
	private int sectionIdFk;

	@Transient
	private boolean isNew = false;

	public Option() {
	}

	public BigInteger getOptionId() {
		return optionId;
	}

	public void setOptionId(BigInteger optionId) {
		this.optionId = optionId;
	}

	public boolean getIsOptionActive() {
		return this.isOptionActive;
	}

	public void setIsOptionActive(boolean isOptionActive) {
		this.isOptionActive = isOptionActive;
	}

	public boolean getIsOptionHasImage() {
		return this.isOptionHasImage;
	}

	public void setIsOptionHasImage(boolean isOptionHasImage) {
		this.isOptionHasImage = isOptionHasImage;
	}

	public String getOptionIndicator() {
		return this.optionIndicator;
	}

	public void setOptionIndicator(String optionIndicator) {
		this.optionIndicator = optionIndicator;
	}

	public String getOptionValueInEnglish() {
		return this.optionValueInEnglish;
	}

	public void setOptionValueInEnglish(String optionValueInEnglish) {
		this.optionValueInEnglish = optionValueInEnglish;
	}

	public String getOptionValueInEnglishImageUrl() {
		return this.optionValueInEnglishImageUrl;
	}

	public void setOptionValueInEnglishImageUrl(String optionValueInEnglishImageUrl) {
		this.optionValueInEnglishImageUrl = optionValueInEnglishImageUrl;
	}

	public String getOptionValueInRegional() {
		return this.optionValueInRegional;
	}

	public void setOptionValueInRegional(String optionValueInRegional) {
		this.optionValueInRegional = optionValueInRegional;
	}

	public String getOptionValueInRegionalImageUrl() {
		return this.optionValueInRegionalImageUrl;
	}

	public void setOptionValueInRegionalImageUrl(String optionValueInRegionalImageUrl) {
		this.optionValueInRegionalImageUrl = optionValueInRegionalImageUrl;
	}

	public java.math.BigInteger getQuestionIdFk() {
		return this.questionIdFk;
	}

	public void setQuestionIdFk(java.math.BigInteger questionIdFk) {
		this.questionIdFk = questionIdFk;
	}

	public int getSectionIdFk() {
		return this.sectionIdFk;
	}

	public void setSectionIdFk(int sectionIdFk) {
		this.sectionIdFk = sectionIdFk;
	}

	@Override
	public BigInteger getId() {
		return this.optionId;
	}

	@Override
	public boolean isNew() {
		return this.isNew;
	}

	public void setOptionActive(boolean isOptionActive) {
		this.isOptionActive = isOptionActive;
	}

	public void setOptionHasImage(boolean isOptionHasImage) {
		this.isOptionHasImage = isOptionHasImage;
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
				+ optionValueInRegionalImageUrl + ", questionIdFk=" + questionIdFk + ", sectionIdFk=" + sectionIdFk
				+ ", isNew=" + isNew + "]";
	}

}