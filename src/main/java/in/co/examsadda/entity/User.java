package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Access(AccessType.PROPERTY)
	@Column(name="emailId")
	private String emailId;
	@Column(name="password")
	private String password;
	@Column(name="securityQuestion1")
	private String securityQuestion1;
	@Column(name="securotyQuestionAnswer1")
	private String securotyQuestionAnswer1;
	@Column(name="securityQuestion2")
	private String securityQuestion2;
	@Column(name="securotyQuestionAnswer2")
	private String securotyQuestionAnswer2;
	@Column(name="dateOfRegistraion")
	private String dateOfRegistraion;
	@Column(name="lastLogin")
	private String lastLogin;
	@Column(name="active")
	private Boolean active;
	@Column(name="addressId")
	private Integer addressId;

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param emailId
	 * @param password
	 * @param securityQuestion1
	 * @param securotyQuestionAnswer1
	 * @param securityQuestion2
	 * @param securotyQuestionAnswer2
	 * @param dateOfRegistraion
	 * @param lastLogin
	 * @param active
	 * @param addressId
	 */
	public User(String emailId, String password, String securityQuestion1, String securotyQuestionAnswer1,
			String securityQuestion2, String securotyQuestionAnswer2, String dateOfRegistraion, String lastLogin,
			Boolean active, Integer addressId) {
		this.emailId = emailId;
		this.password = password;
		this.securityQuestion1 = securityQuestion1;
		this.securotyQuestionAnswer1 = securotyQuestionAnswer1;
		this.securityQuestion2 = securityQuestion2;
		this.securotyQuestionAnswer2 = securotyQuestionAnswer2;
		this.dateOfRegistraion = dateOfRegistraion;
		this.lastLogin = lastLogin;
		this.active = active;
		this.addressId = addressId;
	}

	/**
	 * @return the emailId
	 */

	@Column(name = "emailId")
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the securityQuestion1
	 */
	public String getSecurityQuestion1() {
		return securityQuestion1;
	}

	/**
	 * @param securityQuestion1
	 *            the securityQuestion1 to set
	 */
	public void setSecurityQuestion1(String securityQuestion1) {
		this.securityQuestion1 = securityQuestion1;
	}

	/**
	 * @return the securotyQuestionAnswer1
	 */
	public String getSecurotyQuestionAnswer1() {
		return securotyQuestionAnswer1;
	}

	/**
	 * @param securotyQuestionAnswer1
	 *            the securotyQuestionAnswer1 to set
	 */
	public void setSecurotyQuestionAnswer1(String securotyQuestionAnswer1) {
		this.securotyQuestionAnswer1 = securotyQuestionAnswer1;
	}

	/**
	 * @return the securityQuestion2
	 */
	public String getSecurityQuestion2() {
		return securityQuestion2;
	}

	/**
	 * @param securityQuestion2
	 *            the securityQuestion2 to set
	 */
	public void setSecurityQuestion2(String securityQuestion2) {
		this.securityQuestion2 = securityQuestion2;
	}

	/**
	 * @return the securotyQuestionAnswer2
	 */
	public String getSecurotyQuestionAnswer2() {
		return securotyQuestionAnswer2;
	}

	/**
	 * @param securotyQuestionAnswer2
	 *            the securotyQuestionAnswer2 to set
	 */
	public void setSecurotyQuestionAnswer2(String securotyQuestionAnswer2) {
		this.securotyQuestionAnswer2 = securotyQuestionAnswer2;
	}

	/**
	 * @return the dateOfRegistraion
	 */
	public String getDateOfRegistraion() {
		return dateOfRegistraion;
	}

	/**
	 * @param dateOfRegistraion
	 *            the dateOfRegistraion to set
	 */
	public void setDateOfRegistraion(String dateOfRegistraion) {
		this.dateOfRegistraion = dateOfRegistraion;
	}

	/**
	 * @return the lastLogin
	 */
	public String getLastLogin() {
		return lastLogin;
	}

	/**
	 * @param lastLogin
	 *            the lastLogin to set
	 */
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
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

	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId
	 *            the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", password=" + password + ", securityQuestion1=" + securityQuestion1
				+ ", securotyQuestionAnswer1=" + securotyQuestionAnswer1 + ", securityQuestion2=" + securityQuestion2
				+ ", securotyQuestionAnswer2=" + securotyQuestionAnswer2 + ", dateOfRegistraion=" + dateOfRegistraion
				+ ", lastLogin=" + lastLogin + ", active=" + active + ", addressId=" + addressId + "]";
	}

}
