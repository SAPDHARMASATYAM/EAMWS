package in.co.examsadda.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.data.domain.Persistable;


/**
 * The persistent class for the course database table.
 * 
 */
@Entity
@Table(name="course")
@NamedQuery(name="Course.findAll", query="SELECT c FROM Course c")
public class Course implements Serializable, Persistable<Integer>  {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="course_id", unique=true, nullable=false)
	private int courseId;

	
	@Column(name="course_name_in_english", nullable=false)
	private String courseNameInEnglish;

	
	@Column(name="course_name_in_regional", nullable=false)
	private String courseNameInRegional;

	@Column(name="is_course_active", nullable=false)
	private boolean isCourseActive;

	@Column(name="number_of_practice_papers_in_this_course", nullable=false)
	private boolean numberOfPracticePapersInThisCourse;


	@Transient
	private boolean isNew = false;
	
	public Course() {
	}

	public int getCourseId() {
		return this.courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseNameInEnglish() {
		return this.courseNameInEnglish;
	}

	public void setCourseNameInEnglish(String courseNameInEnglish) {
		this.courseNameInEnglish = courseNameInEnglish;
	}

	public String getCourseNameInRegional() {
		return this.courseNameInRegional;
	}

	public void setCourseNameInRegional(String courseNameInRegional) {
		this.courseNameInRegional = courseNameInRegional;
	}

	public boolean getIsCourseActive() {
		return this.isCourseActive;
	}

	public void setIsCourseActive(boolean isCourseActive) {
		this.isCourseActive = isCourseActive;
	}

	public boolean getNumberOfPracticePapersInThisCourse() {
		return this.numberOfPracticePapersInThisCourse;
	}

	public void setNumberOfPracticePapersInThisCourse(boolean numberOfPracticePapersInThisCourse) {
		this.numberOfPracticePapersInThisCourse = numberOfPracticePapersInThisCourse;
	}

	@Override
	public Integer getId() {
		return this.courseId;
	}

	@Override
	public boolean isNew() {
		return this.isNew;
	}

	public void setCourseActive(boolean isCourseActive) {
		this.isCourseActive = isCourseActive;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

}