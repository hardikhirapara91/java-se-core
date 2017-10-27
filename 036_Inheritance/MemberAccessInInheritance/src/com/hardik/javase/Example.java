package com.hardik.javase;

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Example extends Student {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Print Student Data method
	 */
	public void printStudentData() {
		System.out.println("Roll No.: " + super.getRlno());
		System.out.println("Name: " + super.getName());
		System.out.println("City: " + this.getCity());
	}
}
