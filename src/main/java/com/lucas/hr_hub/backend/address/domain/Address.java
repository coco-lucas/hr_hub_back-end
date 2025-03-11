package com.lucas.hr_hub.backend.address.domain;

import com.lucas.hr_hub.backend.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "adress")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	private int ZIPcode;
	private int houseNum;
	private String street;
	private String city;
	private String state;
	private String country;

	public Address(Long id, User user, int zIPcode, int houseNum, String street,
			String city, String state, String country) {
		this.id = id;
		this.user = user;
		ZIPcode = zIPcode;
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

	public int getZIPcode() {
		return ZIPcode;
	}

	public void setZIPcode(int zIPcode) {
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