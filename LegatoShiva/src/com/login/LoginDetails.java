package com.login;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class LoginDetails {
	@Id
	private int userId;
	private String passw;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassword(String passw) {
		this.passw = passw;
	}
	
	
}
