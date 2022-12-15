package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Patient {
	
	//instance
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;
	private Integer patientRegistrationNumber;
	@Column(nullable = true)
	private String patientName;
	private LocalDate dateOfBirth;
	private String gender;
	private String adress;
	@Column(nullable = true)
	private String phoneNumber;
	
	
	//Default constructor
	
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//Parameterized constructor
	public Patient(Integer patientId, Integer patientRegistrationNumber, String patientName, LocalDate dateOfBirth,
			String gender, String adress, String phoneNumber) {
		super();
		this.patientId = patientId;
		this.patientRegistrationNumber = patientRegistrationNumber;
		this.patientName = patientName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
	}
	//Override toString method

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientRegistrationNumber=" + patientRegistrationNumber
				+ ", patientName=" + patientName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", adress="
				+ adress + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	



}
