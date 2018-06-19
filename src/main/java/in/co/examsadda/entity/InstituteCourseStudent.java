package in.co.examsadda.entity;

//@Entity
public class InstituteCourseStudent {
	private Integer instituteId;
	private Integer courseId;
	private Integer studentId;
	private Boolean active;

	/**
	 * 
	 */
	public InstituteCourseStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param instituteId
	 * @param courseId
	 * @param studentId
	 * @param active
	 */
	public InstituteCourseStudent(Integer instituteId, Integer courseId, Integer studentId, Boolean active) {
		this.instituteId = instituteId;
		this.courseId = courseId;
		this.studentId = studentId;
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
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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
		return "InstituteCourseStudent [instituteId=" + instituteId + ", courseId=" + courseId + ", studentId="
				+ studentId + ", active=" + active + "]";
	}

}
