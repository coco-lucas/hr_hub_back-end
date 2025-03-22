package com.lucas.hr_hub.backend.domain.entities;

public class Address {
	private Long id;
	private User user;
	private String ZIPcode;
	private int houseNum;
	private String street;
	private String city;
	private String state;
	private String country;

	public Address(Long id, User user, String ZIPcode, int houseNum, String street,
			String city, String state, String country) {
		this.id = id;
		this.user = user;
		this.ZIPcode = ZIPcode;
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Address() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getZIPcode() {
		return ZIPcode;
	}

	public void setZIPcode(String zIPcode) {
		ZIPcode = zIPcode;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}