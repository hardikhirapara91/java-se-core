package com.hardik.javase;

import com.hardik.javase.model.User;

/**
 * Real Use of Object.toString() Method
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		User user = new User();
		user.setUserId(101);
		user.setUserName("test");
		user.setFirstName("Test");
		user.setLastName("User");

		System.out.println(user); // It will print data instead of hash-code
	}

}
