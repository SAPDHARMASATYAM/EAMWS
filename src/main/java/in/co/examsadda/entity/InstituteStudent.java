package in.co.examsadda.entity;

public class InstituteStudent {
	private Integer instituteId;
	private Integer studentId;
	private String effectiveDate;
	private String expirationDate;
	private Boolean active;

	/**
	 * 
	 */
	public InstituteStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param instituteId
	 * @param studentId
	 * @param effectiveDate
	 * @param expirationDate
	 * @param active
	 */
	public InstituteStudent(Integer instituteId, Integer studentId, String effectiveDate, String expirationDate,
			Boolean active) {
		this.instituteId = instituteId;
		this.studentId = studentId;
		this.effectiveDate = effectiveDate;
		this.expirationDate = expirationDate;
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
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate
	 *            the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
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
		return "InstituteStudent [instituteId=" + instituteId + ", studentId=" + studentId + ", effectiveDate="
				+ effectiveDate + ", expirationDate=" + expirationDate + ", active=" + active + "]";
	}

}
