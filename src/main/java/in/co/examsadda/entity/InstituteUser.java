package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the institute_user database table.
 * 
 */
@Entity
@Table(name="institute_user")
@NamedQuery(name="InstituteUser.findAll", query="SELECT i FROM InstituteUser i")
public class InstituteUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InstituteUserPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_registration", nullable=false)
	private Date dateOfRegistration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_on_registration_ending", nullable=false)
	private Date dateOnRegistrationEnding;

	@Column(name="is_institute_user_active", nullable=false)
	private boolean isInstituteUserActive;

	@Column(name="registration_id", nullable=false)
	private int registrationId;

	public InstituteUser() {
	}

	public InstituteUserPK getId() {
		return this.id;
	}

	public void setId(InstituteUserPK id) {
		this.id = id;
	}

	public Date getDateOfRegistration() {
		return this.dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Date getDateOnRegistrationEnding() {
		return this.dateOnRegistrationEnding;
	}

	public void setDateOnRegistrationEnding(Date dateOnRegistrationEnding) {
		this.dateOnRegistrationEnding = dateOnRegistrationEnding;
	}

	public boolean getIsInstituteUserActive() {
		return this.isInstituteUserActive;
	}

	public void setIsInstituteUserActive(boolean isInstituteUserActive) {
		this.isInstituteUserActive = isInstituteUserActive;
	}

	public int getRegistrationId() {
		return this.registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

}