package com.hardik.javase.model;

/**
 * PERSON CLASS
 * 
 * @author HARDIK HIRAPARA
 *
 */
abstract public class Person {

	public String name;
	public String email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void printPersonInfo() {
		System.out.println("Person [name=" + name + ", email=" + email + "]");
	}

	public abstract String getOccupation();
}
