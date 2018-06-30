package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;


/**
 * The persistent class for the section database table.
 * 
 */
@Entity
@Table(name="section")
@NamedQuery(name="Section.findAll", query="SELECT s FROM Section s")
public class Section implements Serializable, Persistable<Integer> {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="section_id", unique=true, nullable=false)
	private int sectionId;

	@Column(name="course_id_fk", nullable=false)
	private int courseIdFk;

	@Column(name="is_section_active", nullable=false)
	private boolean isSectionActive;

	@Column(name="number_of_questions_in_this_section", nullable=false)
	private int numberOfQuestionsInThisSection;

	@Column(name="practice_paper_id_fk", nullable=false)
	private int practicePaperIdFk;

	@Column(name="section_description_in_english", nullable=false)
	private String sectionDescriptionInEnglish;

	@Column(name="section_description_in_regional", nullable=false)
	private String sectionDescriptionInRegional;

	@Column(name="section_name_in_english", nullable=false)
	private String sectionNameInEnglish;

	@Column(name="section_name_in_regional", nullable=false)
	private String sectionNameInRegional;

	@Transient
	private boolean isNew = false;
	
	@Override
	public boolean isNew() {
		return this.isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	@Override
	public Integer getId() {
		return this.sectionId;
	}
	public Section() {
	}

	public int getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getCourseIdFk() {
		return this.courseIdFk;
	}

	public void setCourseIdFk(int courseIdFk) {
		this.courseIdFk = courseIdFk;
	}

	public boolean getIsSectionActive() {
		return this.isSectionActive;
	}

	public void setIsSectionActive(boolean isSectionActive) {
		this.isSectionActive = isSectionActive;
	}

	public int getNumberOfQuestionsInThisSection() {
		return this.numberOfQuestionsInThisSection;
	}

	public void setNumberOfQuestionsInThisSection(int numberOfQuestionsInThisSection) {
		this.numberOfQuestionsInThisSection = numberOfQuestionsInThisSection;
	}

	public int getPracticePaperIdFk() {
		return this.practicePaperIdFk;
	}

	public void setPracticePaperIdFk(int practicePaperIdFk) {
		this.practicePaperIdFk = practicePaperIdFk;
	}

	public String getSectionDescriptionInEnglish() {
		return this.sectionDescriptionInEnglish;
	}

	public void setSectionDescriptionInEnglish(String sectionDescriptionInEnglish) {
		this.sectionDescriptionInEnglish = sectionDescriptionInEnglish;
	}

	public String getSectionDescriptionInRegional() {
		return this.sectionDescriptionInRegional;
	}

	public void setSectionDescriptionInRegional(String sectionDescriptionInRegional) {
		this.sectionDescriptionInRegional = sectionDescriptionInRegional;
	}

	public String getSectionNameInEnglish() {
		return this.sectionNameInEnglish;
	}

	public void setSectionNameInEnglish(String sectionNameInEnglish) {
		this.sectionNameInEnglish = sectionNameInEnglish;
	}

	public String getSectionNameInRegional() {
		return this.sectionNameInRegional;
	}

	public void setSectionNameInRegional(String sectionNameInRegional) {
		this.sectionNameInRegional = sectionNameInRegional;
	}

}