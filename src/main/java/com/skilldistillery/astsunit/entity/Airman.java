package com.skilldistillery.astsunit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airman")
public class Airman {
	
	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="enlistment_date")
	private String enlistmentDate;
	
	@Column(name="separation_date")
	private String separationDate;
	
	@Column(name="flight")
	private String flight;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	public Airman () {
		
	}

	
	// define constructors
	
	public Airman(String firstName, String middleName, String lastName, String enlistmentDate,
			String separationDate, String flight, String phoneNumber, String email) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.enlistmentDate = enlistmentDate;
		this.separationDate = separationDate;
		this.flight = flight;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEnlistmentDate() {
		return enlistmentDate;
	}


	public void setEnlistmentDate(String enlistmentDate) {
		this.enlistmentDate = enlistmentDate;
	}


	public String getSeparationDate() {
		return separationDate;
	}


	public void setSeparationDate(String separationDate) {
		this.separationDate = separationDate;
	}


	public String getFlight() {
		return flight;
	}


	public void setFlight(String flight) {
		this.flight = flight;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Airman [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", enlistmentDate=" + enlistmentDate + ", separationDate=" + separationDate + ", flight=" + flight
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	// define getter/setter
	
	
	
	// define tostring 
	
	

}
