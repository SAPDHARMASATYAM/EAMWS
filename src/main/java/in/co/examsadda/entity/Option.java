package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the option database table.
 * 
 */
@Entity
@Table(name="option")
@NamedQuery(name="Option.findAll", query="SELECT o FROM Option o")
public class Option implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String option_Id;

	@Column(name="is_option_active", nullable=false)
	private byte isOptionActive;

	@Column(name="is_option_has_image", nullable=false)
	private byte isOptionHasImage;

	@Column(name="option_indicator", nullable=false, length=1)
	private String optionIndicator;

	@Lob
	@Column(name="option_value_in_english", nullable=false)
	private String optionValueInEnglish;

	@Lob
	@Column(name="option_value_in_english_image_url", nullable=false)
	private String optionValueInEnglishImageUrl;

	@Lob
	@Column(name="option_value_in_regional", nullable=false)
	private String optionValueInRegional;

	@Lob
	@Column(name="option_value_in_regional_image_url", nullable=false)
	private String optionValueInRegionalImageUrl;

	@Column(name="question_id_fk", nullable=false)
	private java.math.BigInteger questionIdFk;

	@Column(name="section_id_fk", nullable=false)
	private int sectionIdFk;

	public Option() {
	}

	public String getOption_Id() {
		return this.option_Id;
	}

	public void setOption_Id(String option_Id) {
		this.option_Id = option_Id;
	}

	public byte getIsOptionActive() {
		return this.isOptionActive;
	}

	public void setIsOptionActive(byte isOptionActive) {
		this.isOptionActive = isOptionActive;
	}

	public byte getIsOptionHasImage() {
		return this.isOptionHasImage;
	}

	public void setIsOptionHasImage(byte isOptionHasImage) {
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

}