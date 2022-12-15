package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderItem")
public class OrderItem {
	//PK
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer itemId;
	
	
	private Integer orderId;
	//FK
	@JoinColumn(name="orderId",insertable=false,updatable=false)
	@ManyToOne
	private Orders order;
	
	
	private String itemName;
	private Integer quantity;
	
	//Default constructor
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}


	//Parameterized constructor
	public OrderItem(Integer itemId, Integer orderId, Orders order, String itemName, Integer quantity) {
		super();
		this.itemId = itemId;
		this.orderId = orderId;
		this.order = order;
		this.itemName = itemName;
		this.quantity = quantity;
	}

	//Setters and Getters
	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public Orders getOrder() {
		return order;
	}


	public void setOrder(Orders order) {
		this.order = order;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
