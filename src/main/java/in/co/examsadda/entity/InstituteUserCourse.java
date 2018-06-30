package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;

import java.util.Date;


/**
 * The persistent class for the institute_user_course database table.
 * 
 */
@Entity
@Table(name="institute_user_course")
@NamedQuery(name="InstituteUserCourse.findAll", query="SELECT i FROM InstituteUserCourse i")
public class InstituteUserCourse implements Serializable, Persistable<InstituteUserCoursePK>  {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InstituteUserCoursePK iucPkId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_registration", nullable=false)
	private Date dateOfRegistration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_on_registration_ending", nullable=false)
	private Date dateOnRegistrationEnding;

	@Column(name="is_course_active", nullable=false)
	private boolean isCourseActive;

	@Transient
	private boolean isNew = false;

	public InstituteUserCourse() {
	}

	
	public InstituteUserCoursePK getIucPkId() {
		return iucPkId;
	}


	public void setIucPkId(InstituteUserCoursePK iucPkId) {
		this.iucPkId = iucPkId;
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


	public boolean isCourseActive() {
		return isCourseActive;
	}


	public void setCourseActive(boolean isCourseActive) {
		this.isCourseActive = isCourseActive;
	}

	@Override
	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}


	@Override
	public InstituteUserCoursePK getId() {
		return this.getIucPkId();
	}

}