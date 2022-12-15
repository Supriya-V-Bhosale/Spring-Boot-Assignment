package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Integer custNo;
	private String custName;
	private String address;
	//Default Constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized constructor
	
	public Customer(Integer custNo, String custName, String address) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.address = address;
	}
	
	
	//Setters And Getters

	public Integer getCustNo() {
		return custNo;
	}

	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	

}
