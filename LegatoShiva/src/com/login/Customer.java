package com.login;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id
	private int userId;
	private String name;
	private String phnno;
	private String gender;
	private String city;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String[] getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}
	private String[] technologies;

	
	
	

}
