package com.myproject.FirstSpringMVC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.PropertySource;
@PropertySource("classpath:messages.properties")
@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	//@NotEmpty(message="Name can't be empty!")
	private String userName;
	//@NotEmpty(message="Password can't be empty!")
	private String userPass;
	//@NumberFormat(style=Style.NUMBER)
	private String userPhoneNo;
	/*@NotEmpty(message="Email can't be empty!")
	@Email(message="Enter valid email!")*/
	private String userEmailId;
	private String userAddress;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserPhoneNo() {
		return userPhoneNo;
	}

	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}
