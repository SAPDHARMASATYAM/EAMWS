package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;

import java.util.Date;


/**
 * The persistent class for the institute_course database table.
 * 
 */
@Entity
@Table(name="institute_course")
@NamedQuery(name="InstituteCourse.findAll", query="SELECT i FROM InstituteCourse i")
public class InstituteCourse implements Serializable, Persistable<InstituteCoursePK>  {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InstituteCoursePK pkId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_registration", nullable=false)
	private Date dateOfRegistration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_on_ending", nullable=false)
	private Date dateOnEnding;

	@Column(name="is_institute_course_active", nullable=false)
	private boolean isInstituteCourseActive;

	@Column(name="registration_id", nullable=false)
	private int registrationId;

	@Transient
	private boolean isNew = false;

	
	public InstituteCourse() {
	}


	public InstituteCoursePK getPkId() {
		return pkId;
	}


	public void setPkId(InstituteCoursePK pkId) {
		this.pkId = pkId;
	}


	public Date getDateOfRegistration() {
		return this.dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Date getDateOnEnding() {
		return this.dateOnEnding;
	}

	public void setDateOnEnding(Date dateOnEnding) {
		this.dateOnEnding = dateOnEnding;
	}

	public boolean getIsInstituteCourseActive() {
		return this.isInstituteCourseActive;
	}

	public void setIsInstituteCourseActive(boolean isInstituteCourseActive) {
		this.isInstituteCourseActive = isInstituteCourseActive;
	}

	public int getRegistrationId() {
		return this.registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public void setInstituteCourseActive(boolean isInstituteCourseActive) {
		this.isInstituteCourseActive = isInstituteCourseActive;
	}

	@Override
	public InstituteCoursePK getId() {
		return this.getPkId();
	}
	
}