package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	//PK
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	
	private Integer custNo;
    @JoinColumn(name="custNo",insertable=false,updatable=false)
	@ManyToOne
	private Customer customer;
	public Orders(Integer orderId, Integer custNo, Customer customer) {
		super();
		this.orderId = orderId;
		this.custNo = custNo;
		this.customer = customer;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getCustNo() {
		return custNo;
	}
	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	} 
    
    
	
	
	
	
	
	

}
