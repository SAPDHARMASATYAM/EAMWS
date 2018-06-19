package in.co.examsadda.entity;

public class InstituteCourse {
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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param instituteId
	 * @param courseId
	 * @param effectiveDate
	 * @param terminationDate
	 * @param active
	 */
	public InstituteCourse(Integer instituteId, Integer courseId, String effectiveDate, String terminationDate,
			Boolean active) {
		this.instituteId = instituteId;
		this.courseId = courseId;
		this.effectiveDate = effectiveDate;
		this.terminationDate = terminationDate;
		this.active = active;
	}

	/**
	 * @return the instituteId
	 */
	public Integer getInstituteId() {
		return instituteId;
	}

	/**
	 * @param instituteId
	 *            the instituteId to set
	 */
	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
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
	 * @return the effectiveDate
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate
	 *            the effectiveDate to set
	 */
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the terminationDate
	 */
	public String getTerminationDate() {
		return terminationDate;
	}

	/**
	 * @param terminationDate
	 *            the terminationDate to set
	 */
	public void setTerminationDate(String terminationDate) {
		this.terminationDate = terminationDate;
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
		return "InstituteCourse [instituteId=" + instituteId + ", courseId=" + courseId + ", effectiveDate="
				+ effectiveDate + ", terminationDate=" + terminationDate + ", active=" + active + "]";
	}

}
