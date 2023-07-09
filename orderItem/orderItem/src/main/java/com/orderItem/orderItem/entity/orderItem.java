package com.orderItem.orderItem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class orderItem {
	
	private int id;
	private int menuItem;
	private int quantity;
	public orderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orderItem(int id, int menuItem, int quantity) {
		super();
		this.id = id;
		this.menuItem = menuItem;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(int menuItem) {
		this.menuItem = menuItem;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "orderItem [id=" + id + ", menuItem=" + menuItem + ", quantity=" + quantity + "]";
	}
	public orderItem save(orderItem ot) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
