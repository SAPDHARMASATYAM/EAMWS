package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="practice_paper")
public class PracticePaper {
	@Id
	@Column(name="paperId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer paperId;
	private String paperNameInEnglish;
	private String paperNameInRegional;
	private Integer duration;
	private Integer courseId;
	private Boolean active;
	/**
	 * 
	 */
	public PracticePaper() {
	}
	/**
	 * @param paperId
	 * @param paperNameInEnglish
	 * @param paperNameInRegional
	 * @param duration
	 * @param courseId
	 * @param active
	 */
	public PracticePaper(Integer paperId, String paperNameInEnglish, String paperNameInRegional, Integer duration,
			Integer courseId, Boolean active) {
		this.paperId = paperId;
		this.paperNameInEnglish = paperNameInEnglish;
		this.paperNameInRegional = paperNameInRegional;
		this.duration = duration;
		this.courseId = courseId;
		this.active = active;
	}
	/**
	 * @return the paperId
	 */
	public Integer getPaperId() {
		return paperId;
	}
	/**
	 * @param paperId the paperId to set
	 */
	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}
	/**
	 * @return the paperNameInEnglish
	 */
	public String getPaperNameInEnglish() {
		return paperNameInEnglish;
	}
	/**
	 * @param paperNameInEnglish the paperNameInEnglish to set
	 */
	public void setPaperNameInEnglish(String paperNameInEnglish) {
		this.paperNameInEnglish = paperNameInEnglish;
	}
	/**
	 * @return the paperNameInRegional
	 */
	public String getPaperNameInRegional() {
		return paperNameInRegional;
	}
	/**
	 * @param paperNameInRegional the paperNameInRegional to set
	 */
	public void setPaperNameInRegional(String paperNameInRegional) {
		this.paperNameInRegional = paperNameInRegional;
	}
	/**
	 * @return the duration
	 */
	public Integer getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	/**
	 * @return the courseId
	 */
	public Integer getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticePaper [paperId=" + paperId + ", paperNameInEnglish=" + paperNameInEnglish
				+ ", paperNameInRegional=" + paperNameInRegional + ", duration=" + duration + ", courseId=" + courseId
				+ ", active=" + active + "]";
	}
	
}
