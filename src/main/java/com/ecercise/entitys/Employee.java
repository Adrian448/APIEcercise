package com.ecercise.entitys;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String firstName;
	private String lastName;
	private Date birthDate;
	private String birthPlace;
	private String gender;
	private String maritalStatus;
	private String confession;
	private String adress;
	private String residence;
	private String postCode;

	public Employee(long id, String firstName, String lastName, Date birthDate, String birthPlace, String gender, String maritalStatus, String confession,
			String adress, String residence, String postCode) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.birthPlace = birthPlace;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.confession = confession;
		this.adress = adress;
		this.residence = residence;
		this.postCode = postCode;
		
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getConfession() {
		return confession;
	}

	public void setConfession(String confession) {
		this.confession = confession;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public long getId() {
		return id;
	}
	

	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", birthPlace=" + birthPlace + ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+ ", confession=" + confession + ", adress=" + adress + ", residence=" + residence + ", postCode="
				+ postCode + "]";
	}
}
