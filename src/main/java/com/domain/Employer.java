package com.domain;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employer")
public class Employer {

	@Id
	@Column(name = "employer_id")
	private int employer_id;

	@Column(name = "employer_firstName")
	private String firstName;

	@Column(name = "employer_lastName")
	private String lastName;

	@Column(name = "employer_email")
	private String email;

	@Column(name = "employer_phoneNumber")
	private BigInteger phoneNumber;

	public Employer() {
		super();
	}

	public Employer(int id, String firstName, String lastName, String email, BigInteger phoneNumber) {
		super();
		this.employer_id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return employer_id;
	}

	public void setId(int id) {
		this.employer_id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
}