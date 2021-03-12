package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
public class House {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private int numWindows;
	private Boolean geothermal;
	private int squareFeet;
	
	@Autowired
	private Address address;
	
	public House() {
		super();
	}
	
	public House(String type, int numWindows, Boolean geothermal, int squareFeet) {
		super();
		this.type = type;
		this.numWindows = numWindows;
		this.geothermal = geothermal;
		this.squareFeet = squareFeet;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumWindows() {
		return numWindows;
	}

	public void setNumWindows(int numWindows) {
		this.numWindows = numWindows;
	}

	public Boolean getGeothermal() {
		return geothermal;
	}

	public void setGeothermal(Boolean geothermal) {
		this.geothermal = geothermal;
	}

	public int getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
