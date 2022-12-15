package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblProfessor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer professorId;
	private Integer managerID;
	private String firstName;
	private String lastName;
	private Integer deptNo;
	private Long salary;
	private String dateOfJoining;
	private String dateOfBirth;
	private String gender;
	
	
	//Default constructor
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}



	//Parameterized constructor
	public Professor(Integer professorId, Integer managerID, String firstName, String lastName, Integer deptNo,
			Long salary, String dateOfJoining, String dateOfBirth, String gender) {
		super();
		this.professorId = professorId;
		this.managerID = managerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptNo = deptNo;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}


	//Override toString method
	@Override
	public String toString() {
		return "Professor [professorId=" + professorId + ", managerID=" + managerID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", deptNo=" + deptNo + ", salary=" + salary + ", dateOfJoining="
				+ dateOfJoining + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + "]";
	}


	//Setters and Getters
	public Integer getProfessorId() {
		return professorId;
	}



	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}



	public Integer getManagerID() {
		return managerID;
	}



	public void setManagerID(Integer managerID) {
		this.managerID = managerID;
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



	public Integer getDeptNo() {
		return deptNo;
	}



	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}



	public Long getSalary() {
		return salary;
	}



	public void setSalary(Long salary) {
		this.salary = salary;
	}



	public String getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	

}
