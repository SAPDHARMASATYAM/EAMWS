package in.co.examsadda.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.data.domain.Persistable;


/**
 * The persistent class for the institute_user database table.
 * 
 */
@Entity
@Table(name="institute_user")
@NamedQuery(name="InstituteUser.findAll", query="SELECT i FROM InstituteUser i")
public class InstituteUser implements Serializable, Persistable<InstituteUserPK>  {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InstituteUserPK pkId;

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
	
	@Transient
	private boolean isNew = false;

	public InstituteUser() {
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


	public InstituteUserPK getPkId() {
		return pkId;
	}


	public void setPkId(InstituteUserPK pkId) {
		this.pkId = pkId;
	}


	public void setInstituteUserActive(boolean isInstituteUserActive) {
		this.isInstituteUserActive = isInstituteUserActive;
	}


	@Override
	public InstituteUserPK getId() {
		return this.getPkId();
	}


	@Override
	public boolean isNew() {
		return this.isNew;
	}


	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	
	
	
}