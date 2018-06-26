package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inistitute_course")
public class InstituteCourse {
	
	@Id
	@Column(name = "Institute_course_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer icId;
	private Integer instituteId;
	private Integer courseId;
	private String effectiveDate;
	private String terminationDate;
	private Boolean active;

	/**
	 * 
	 */
	public InstituteCourse() {
		super();
	}

	public InstituteCourse(Integer icId, Integer instituteId, Integer courseId, String effectiveDate,
			String terminationDate, Boolean active) {
		super();
		this.icId = icId;
		this.instituteId = instituteId;
		this.courseId = courseId;
		this.effectiveDate = effectiveDate;
		this.terminationDate = terminationDate;
		this.active = active;
	}

	public Integer getIcId() {
		return icId;
	}

	public void setIcId(Integer icId) {
		this.icId = icId;
	}

	public Integer getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(String terminationDate) {
		this.terminationDate = terminationDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "InstituteCourse [icId=" + icId + ", instituteId=" + instituteId + ", courseId=" + courseId
				+ ", effectiveDate=" + effectiveDate + ", terminationDate=" + terminationDate + ", active=" + active
				+ "]";
	}

}
