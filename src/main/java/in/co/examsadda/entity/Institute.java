package in.co.examsadda.entity;

public class Institute {
	private Integer instituteId;
	private String nameInEnglish;
	private String nameInRegional;
	private Integer addressId;
	private Boolean active;
	/**
	 * 
	 */
	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param instituteId
	 * @param nameInEnglish
	 * @param nameInRegional
	 * @param addressId
	 * @param active
	 */
	public Institute(Integer instituteId, String nameInEnglish, String nameInRegional, Integer addressId,
			Boolean active) {
		this.instituteId = instituteId;
		this.nameInEnglish = nameInEnglish;
		this.nameInRegional = nameInRegional;
		this.addressId = addressId;
		this.active = active;
	}
	/**
	 * @return the instituteId
	 */
	public Integer getInstituteId() {
		return instituteId;
	}
	/**
	 * @param instituteId the instituteId to set
	 */
	public void setInstituteId(Integer instituteId) {
		this.instituteId = instituteId;
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
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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
		return "Institute [instituteId=" + instituteId + ", nameInEnglish=" + nameInEnglish + ", nameInRegional="
				+ nameInRegional + ", addressId=" + addressId + ", active=" + active + "]";
	}
	
}
