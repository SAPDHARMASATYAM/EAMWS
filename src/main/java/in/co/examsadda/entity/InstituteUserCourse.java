package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the institute_user_course database table.
 * 
 */
@Entity
@Table(name="institute_user_course")
@NamedQuery(name="InstituteUserCourse.findAll", query="SELECT i FROM InstituteUserCourse i")
public class InstituteUserCourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="registration_id", unique=true, nullable=false)
	private int registrationId;

	@Column(name="course_id_fk", nullable=false)
	private int courseIdFk;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_of_registration", nullable=false)
	private Date dateOfRegistration;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_on_registration_ending", nullable=false)
	private Date dateOnRegistrationEnding;

	@Column(name="institute_id_fk", nullable=false, length=100)
	private String instituteIdFk;

	@Column(name="is_course_active", nullable=false)
	private boolean isCourseActive;

	@Column(name="user_id_fk", nullable=false, length=100)
	private String userIdFk;

	public InstituteUserCourse() {
	}

	public int getRegistrationId() {
		return this.registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

	public int getCourseIdFk() {
		return this.courseIdFk;
	}

	public void setCourseIdFk(int courseIdFk) {
		this.courseIdFk = courseIdFk;
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

	public String getInstituteIdFk() {
		return this.instituteIdFk;
	}

	public void setInstituteIdFk(String instituteIdFk) {
		this.instituteIdFk = instituteIdFk;
	}

	public boolean getIsCourseActive() {
		return this.isCourseActive;
	}

	public void setIsCourseActive(boolean isCourseActive) {
		this.isCourseActive = isCourseActive;
	}

	public String getUserIdFk() {
		return this.userIdFk;
	}

	public void setUserIdFk(String userIdFk) {
		this.userIdFk = userIdFk;
	}

}