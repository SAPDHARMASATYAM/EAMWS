package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="email_id", unique=true, nullable=false, length=100)
	private String emailId;

	@Column(name="is_user_active", nullable=false)
	private boolean isUserActive;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login", nullable=false)
	private Date lastLogin;

	@Column(nullable=false, length=15)
	private String password;

	public User() {
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public boolean getIsUserActive() {
		return this.isUserActive;
	}

	public void setIsUserActive(boolean isUserActive) {
		this.isUserActive = isUserActive;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}