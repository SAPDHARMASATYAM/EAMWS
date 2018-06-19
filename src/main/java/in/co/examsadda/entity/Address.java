package in.co.examsadda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@Column(name = "addressId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer addressId;
	private String doorNumber;
	private String street;
	private String locality;
	private String city;
	private String town;
	private String state;
	private String country;
	private String pinCode;

	/**
	 * 
	 */
	public Address() {
	}

	/**
	 * @param addressId
	 * @param doorNumber
	 * @param street
	 * @param locality
	 * @param city
	 * @param town
	 * @param state
	 * @param country
	 * @param pinCode
	 */
	public Address(Integer addressId, String doorNumber, String street, String locality, String city, String town,
			String state, String country, String pinCode) {
		this.addressId = addressId;
		this.doorNumber = doorNumber;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.town = town;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId
	 *            the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the doorNumber
	 */
	public String getDoorNumber() {
		return doorNumber;
	}

	/**
	 * @param doorNumber
	 *            the doorNumber to set
	 */
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * @param locality
	 *            the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town
	 *            the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the pinCode
	 */
	public String getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode
	 *            the pinCode to set
	 */
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", doorNumber=" + doorNumber + ", street=" + street + ", locality="
				+ locality + ", city=" + city + ", town=" + town + ", state=" + state + ", country=" + country
				+ ", pinCode=" + pinCode + "]";
	}

}
