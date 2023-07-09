package com.m.m.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="menulist")
public class menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String desciption;
	@Column
	private double price;
	@Column
	private String url;
	public menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public menu(int id, String name, String desciption, double price, String url) {
		super();
		this.id = id;
		this.name = name;
		this.desciption = desciption;
		this.price = price;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "menu [id=" + id + ", name=" + name + ", desciption=" + desciption + ", price=" + price + ", url=" + url
				+ "]";
	}
	
    
}
