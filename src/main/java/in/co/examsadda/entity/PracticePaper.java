package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;


/**
 * The persistent class for the practice_paper database table.
 * 
 */
@Entity
@Table(name="practice_paper")
@NamedQuery(name="PracticePaper.findAll", query="SELECT p FROM PracticePaper p")
public class PracticePaper implements Serializable, Persistable<Integer> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="practice_paper_id", unique=true, nullable=false)
	private int practicePaperId;

    //Mapping To Course 
    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;
	
	@Column(name="is_practice_paper_active", nullable=false)
	private boolean isPracticePaperActive;

	@Column(name="number_of_sections_in_this_practice_paper", nullable=false)
	private boolean numberOfSectionsInThisPracticePaper;

	@Column(name="practice_paper_duration", nullable=false)
	private int practicePaperDuration;

	@Transient
	private int practicePaperCurrentDuration;

	@Column(name="practice_paper_name_in_english", nullable=false)
	private String practicePaperNameInEnglish;


	@Column(name="practice_paper_name_in_regional", nullable=false)
	private String practicePaperNameInRegional;

	@Transient
	private boolean isNew = false;

	public PracticePaper() {
	}

	public int getPracticePaperId() {
		return this.practicePaperId;
	}

	public void setPracticePaperId(int practicePaperId) {
		this.practicePaperId = practicePaperId;
	}

	public boolean getIsPracticePaperActive() {
		return this.isPracticePaperActive;
	}

	public void setIsPracticePaperActive(boolean isPracticePaperActive) {
		this.isPracticePaperActive = isPracticePaperActive;
	}

	public boolean getNumberOfSectionsInThisPracticePaper() {
		return this.numberOfSectionsInThisPracticePaper;
	}

	public void setNumberOfSectionsInThisPracticePaper(boolean numberOfSectionsInThisPracticePaper) {
		this.numberOfSectionsInThisPracticePaper = numberOfSectionsInThisPracticePaper;
	}

	public int getPracticePaperDuration() {
		return this.practicePaperDuration;
	}

	public void setPracticePaperDuration(int practicePaperDuration) {
		this.practicePaperDuration = practicePaperDuration;
	}

	public String getPracticePaperNameInEnglish() {
		return this.practicePaperNameInEnglish;
	}

	public void setPracticePaperNameInEnglish(String practicePaperNameInEnglish) {
		this.practicePaperNameInEnglish = practicePaperNameInEnglish;
	}

	public String getPracticePaperNameInRegional() {
		return this.practicePaperNameInRegional;
	}

	public void setPracticePaperNameInRegional(String practicePaperNameInRegional) {
		this.practicePaperNameInRegional = practicePaperNameInRegional;
	}

	@Override
	public Integer getId() {
		return this.practicePaperId;
	}

	@Override
	public boolean isNew() {
		return this.isNew;
	}

	public void setPracticePaperActive(boolean isPracticePaperActive) {
		this.isPracticePaperActive = isPracticePaperActive;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public int getPracticePaperCurrentDuration() {
		return practicePaperCurrentDuration;
	}

	public void setPracticePaperCurrentDuration(int practicePaperCurrentDuration) {
		this.practicePaperCurrentDuration = practicePaperCurrentDuration;
	}

	@Override
	public String toString() {
		return "PracticePaper [practicePaperId=" + practicePaperId + ", course=" + course + ", isPracticePaperActive="
				+ isPracticePaperActive + ", numberOfSectionsInThisPracticePaper=" + numberOfSectionsInThisPracticePaper
				+ ", practicePaperDuration=" + practicePaperDuration + ", practicePaperCurrentDuration="
				+ practicePaperCurrentDuration + ", practicePaperNameInEnglish=" + practicePaperNameInEnglish
				+ ", practicePaperNameInRegional=" + practicePaperNameInRegional + "]";
	}

}