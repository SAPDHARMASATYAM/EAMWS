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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="section_id", unique=true, nullable=false)
	private int sectionId;

	@Column(name="is_section_active", nullable=false)
	private boolean isSectionActive;

	@Column(name="number_of_questions_in_this_section", nullable=false)
	private int numberOfQuestionsInThisSection;

	@ManyToOne
	@JoinColumn(name="practice_paper_id", nullable=false)
	private PracticePaper practicePaper;

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

	@Override
	public Integer getId() {
		return this.getSectionId();
	}

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public boolean isSectionActive() {
		return isSectionActive;
	}

	public void setSectionActive(boolean isSectionActive) {
		this.isSectionActive = isSectionActive;
	}

	public int getNumberOfQuestionsInThisSection() {
		return numberOfQuestionsInThisSection;
	}

	public void setNumberOfQuestionsInThisSection(int numberOfQuestionsInThisSection) {
		this.numberOfQuestionsInThisSection = numberOfQuestionsInThisSection;
	}

	public PracticePaper getPracticePaper() {
		return practicePaper;
	}

	public void setPracticePaper(PracticePaper practicePaper) {
		this.practicePaper = practicePaper;
	}

	public String getSectionDescriptionInEnglish() {
		return sectionDescriptionInEnglish;
	}

	public void setSectionDescriptionInEnglish(String sectionDescriptionInEnglish) {
		this.sectionDescriptionInEnglish = sectionDescriptionInEnglish;
	}

	public String getSectionDescriptionInRegional() {
		return sectionDescriptionInRegional;
	}

	public void setSectionDescriptionInRegional(String sectionDescriptionInRegional) {
		this.sectionDescriptionInRegional = sectionDescriptionInRegional;
	}

	public String getSectionNameInEnglish() {
		return sectionNameInEnglish;
	}

	public void setSectionNameInEnglish(String sectionNameInEnglish) {
		this.sectionNameInEnglish = sectionNameInEnglish;
	}

	public String getSectionNameInRegional() {
		return sectionNameInRegional;
	}

	public void setSectionNameInRegional(String sectionNameInRegional) {
		this.sectionNameInRegional = sectionNameInRegional;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", isSectionActive=" + isSectionActive
				+ ", numberOfQuestionsInThisSection=" + numberOfQuestionsInThisSection + ", practicePaper="
				+ practicePaper + ", sectionDescriptionInEnglish=" + sectionDescriptionInEnglish
				+ ", sectionDescriptionInRegional=" + sectionDescriptionInRegional + ", sectionNameInEnglish="
				+ sectionNameInEnglish + ", sectionNameInRegional=" + sectionNameInRegional + "]";
	}
	
}