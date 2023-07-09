package com.orderentity.orderentity.entity;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OE")
public class orderEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
   private int id;
   private String customerName;
   private String customerEmail;
   private double totalPrice;
   private Timestamp orderDate;
   private int orderItems;
public orderEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public orderEntity(int id, String customerName, String customerEmail, double totalPrice, Timestamp orderDate,
		int orderItems) {
	super();
	this.id = id;
	this.customerName = customerName;
	this.customerEmail = customerEmail;
	this.totalPrice = totalPrice;
	this.orderDate = orderDate;
	this.orderItems = orderItems;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public Timestamp getOrderDate() {
	return orderDate;
}
public void setOrderDate(Timestamp orderDate) {
	this.orderDate = orderDate;
}
public int getOrderItems() {
	return orderItems;
}
public void setOrderItems(int orderItems) {
	this.orderItems = orderItems;
}
@Override
public String toString() {
	return "orderEntity [id=" + id + ", customerName=" + customerName + ", customerEmail=" + customerEmail
			+ ", totalPrice=" + totalPrice + ", orderDate=" + orderDate + ", orderItems=" + orderItems + "]";
}
   
   
   
}
