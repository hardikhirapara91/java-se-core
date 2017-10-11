package com.hardik.javase.model;

import java.io.Serializable;

/**
 * User Model
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userName;
	private String firstName;
	private String lastName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This toString() method is used to Object to String representation
	 */
	@Override
	public String toString() {
		return "User [userId=" + getUserId() + ", userName=" + getUserName() + ", firstName=" + getFirstName()
				+ ", lastName=" + getLastName() + "]";
	}
}
