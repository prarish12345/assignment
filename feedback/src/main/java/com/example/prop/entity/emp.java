package com.example.prop.entity;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t")
public class emp {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private int rating;
	private String comments;
	private Timestamp createdat;
	private Timestamp updatedat;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int id, String name, String email, int rating, String comments, Timestamp createdat,
			Timestamp updatedat) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rating = rating;
		this.comments = comments;
		this.createdat = createdat;
		this.updatedat = updatedat;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Timestamp getCreatedat() {
		return createdat;
	}
	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
	}
	public Timestamp getUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(Timestamp updatedat) {
		this.updatedat = updatedat;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", email=" + email + ", rating=" + rating + ", comments=" + comments
				+ ", createdat=" + createdat + ", updatedat=" + updatedat + "]";
	}
	public emp orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}



	
	











	


}
