package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the institute_user_course database table.
 * 
 */
@Embeddable
public class InstituteUserCoursePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="institute_id_fk", unique=true, nullable=false, length=100)
	private String instituteIdFk;

	@Column(name="course_id_fk", insertable=false, updatable=false, unique=true, nullable=false)
	private int courseIdFk;

	@Column(name="user_id_fk", unique=true, nullable=false, length=100)
	private String userIdFk;

	public InstituteUserCoursePK() {
	}
	public String getInstituteIdFk() {
		return this.instituteIdFk;
	}
	public void setInstituteIdFk(String instituteIdFk) {
		this.instituteIdFk = instituteIdFk;
	}
	public int getCourseIdFk() {
		return this.courseIdFk;
	}
	public void setCourseIdFk(int courseIdFk) {
		this.courseIdFk = courseIdFk;
	}
	public String getUserIdFk() {
		return this.userIdFk;
	}
	public void setUserIdFk(String userIdFk) {
		this.userIdFk = userIdFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InstituteUserCoursePK)) {
			return false;
		}
		InstituteUserCoursePK castOther = (InstituteUserCoursePK)other;
		return 
			this.instituteIdFk.equals(castOther.instituteIdFk)
			&& (this.courseIdFk == castOther.courseIdFk)
			&& this.userIdFk.equals(castOther.userIdFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.instituteIdFk.hashCode();
		hash = hash * prime + this.courseIdFk;
		hash = hash * prime + this.userIdFk.hashCode();
		
		return hash;
	}
}