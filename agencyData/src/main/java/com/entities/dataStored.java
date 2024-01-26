package com.entities;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AgencyDetails")
public class dataStored {
	@Id
	private int id;
	private String name;
	private String email;
	private String message;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public dataStored(String name, String email, String message) {
		super();
		this.id = new Random().nextInt(100000);
		this.name = name;
		this.email = email;
		this.message = message;
	}
	public dataStored() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
