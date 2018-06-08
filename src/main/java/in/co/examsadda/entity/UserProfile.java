package in.co.examsadda.entity;

public class UserProfile {
	private String emailId;
	private String firstName;
	private String lastName;
	private String mobile;
	private String gender;
	/**
	 * 
	 */
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param emailId
	 * @param firstName
	 * @param lastName
	 * @param mobile
	 * @param gender
	 */
	public UserProfile(String emailId, String firstName, String lastName, String mobile, String gender) {
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.gender = gender;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserProfile [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile="
				+ mobile + ", gender=" + gender + "]";
	}
	
}
