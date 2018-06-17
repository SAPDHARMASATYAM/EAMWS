package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="section")
public class Section {
	
	@Id
	@Column(name="sectionId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer sectionId;
	private String nameInEnglish;
	private String nameInRegional;
	private Integer numberOfQuestions;
	private Boolean active;
	private Integer practicePaperId;
	/**
	 * 
	 */
	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param sectionId
	 * @param nameInEnglish
	 * @param nameInRegional
	 * @param numberOfQuestions
	 * @param active
	 * @param practicePaperId
	 */
	public Section(Integer sectionId, String nameInEnglish, String nameInRegional, Integer numberOfQuestions,
			Boolean active, Integer practicePaperId) {
		this.sectionId = sectionId;
		this.nameInEnglish = nameInEnglish;
		this.nameInRegional = nameInRegional;
		this.numberOfQuestions = numberOfQuestions;
		this.active = active;
		this.practicePaperId = practicePaperId;
	}
	/**
	 * @return the sectionId
	 */
	public Integer getSectionId() {
		return sectionId;
	}
	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}
	/**
	 * @return the nameInEnglish
	 */
	public String getNameInEnglish() {
		return nameInEnglish;
	}
	/**
	 * @param nameInEnglish the nameInEnglish to set
	 */
	public void setNameInEnglish(String nameInEnglish) {
		this.nameInEnglish = nameInEnglish;
	}
	/**
	 * @return the nameInRegional
	 */
	public String getNameInRegional() {
		return nameInRegional;
	}
	/**
	 * @param nameInRegional the nameInRegional to set
	 */
	public void setNameInRegional(String nameInRegional) {
		this.nameInRegional = nameInRegional;
	}
	/**
	 * @return the numberOfQuestions
	 */
	public Integer getNumberOfQuestions() {
		return numberOfQuestions;
	}
	/**
	 * @param numberOfQuestions the numberOfQuestions to set
	 */
	public void setNumberOfQuestions(Integer numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
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
	/**
	 * @return the practicePaperId
	 */
	public Integer getPracticePaperId() {
		return practicePaperId;
	}
	/**
	 * @param practicePaperId the practicePaperId to set
	 */
	public void setPracticePaperId(Integer practicePaperId) {
		this.practicePaperId = practicePaperId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", nameInEnglish=" + nameInEnglish + ", nameInRegional="
				+ nameInRegional + ", numberOfQuestions=" + numberOfQuestions + ", active=" + active
				+ ", practicePaperId=" + practicePaperId + "]";
	}

}
