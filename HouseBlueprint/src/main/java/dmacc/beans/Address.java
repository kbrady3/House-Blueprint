package dmacc.beans;

public class Address {
	private int houseNum;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address() {
		super();
	}
	
	public Address(int houseNum, String street, String city, String state, int zip) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}
