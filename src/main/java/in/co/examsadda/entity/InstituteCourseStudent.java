package in.co.examsadda.entity;

public class InstituteCourseStudent {
	private Integer instituteId;
	private Integer courseId;
	private Integer studentId;
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
	 */
	public InstituteCourseStudent(Integer instituteId, Integer courseId, Integer studentId) {
		this.instituteId = instituteId;
		this.courseId = courseId;
		this.studentId = studentId;
	}
	/**
	 * @return the instituteId
	 */
	public Integer getInstituteId() {
		return instituteId;
	}
	/**
	 * @param instituteId the instituteId to set
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
	 * @param courseId the courseId to set
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
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InstituteCourseStudent [instituteId=" + instituteId + ", courseId=" + courseId + ", studentId="
				+ studentId + "]";
	}

}
