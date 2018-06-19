package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "courseId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer courseId;
	private String nameInEnglish;
	private String nameInTelugu;
	private Integer numberOfPracticePapers;
	private Boolean active;

	/**
	 * 
	 */
	public Course() {
		super();
	}

	/**
	 * @param courseId
	 * @param nameInEnglish
	 * @param nameInTelugu
	 * @param numberOfPracticePapers
	 * @param active
	 */
	public Course(Integer courseId, String nameInEnglish, String nameInTelugu, Integer numberOfPracticePapers,
			Boolean active) {
		this.courseId = courseId;
		this.nameInEnglish = nameInEnglish;
		this.nameInTelugu = nameInTelugu;
		this.numberOfPracticePapers = numberOfPracticePapers;
		this.active = active;
	}

	/**
	 * @return the courseId
	 */
	public Integer getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId
	 *            the courseId to set
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the nameInEnglish
	 */
	public String getNameInEnglish() {
		return nameInEnglish;
	}

	/**
	 * @param nameInEnglish
	 *            the nameInEnglish to set
	 */
	public void setNameInEnglish(String nameInEnglish) {
		this.nameInEnglish = nameInEnglish;
	}

	/**
	 * @return the nameInTelugu
	 */
	public String getNameInTelugu() {
		return nameInTelugu;
	}

	/**
	 * @param nameInTelugu
	 *            the nameInTelugu to set
	 */
	public void setNameInTelugu(String nameInTelugu) {
		this.nameInTelugu = nameInTelugu;
	}

	/**
	 * @return the numberOfPracticePapers
	 */
	public Integer getNumberOfPracticePapers() {
		return numberOfPracticePapers;
	}

	/**
	 * @param numberOfPracticePapers
	 *            the numberOfPracticePapers to set
	 */
	public void setNumberOfPracticePapers(Integer numberOfPracticePapers) {
		this.numberOfPracticePapers = numberOfPracticePapers;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", nameInEnglish=" + nameInEnglish + ", nameInTelugu=" + nameInTelugu
				+ ", numberOfPracticePapers=" + numberOfPracticePapers + ", active=" + active + "]";
	}

}
