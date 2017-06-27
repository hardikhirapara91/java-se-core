package com.hardik.hirapara;

/**
 * Student Class
 * @author HARDIK HIRAPARA
 *
 */
public class Student {
	
	private int rlno;
	private String firstName;
	private String lastName;
	private String city;
	private static String collage;
	
	// Default Constructor is initialize collage.
	public Student() {
		System.out.println("Default Constructor is Invocked.");
		Student.collage = "IIT-B";
	}
	
	// This constructor is initialized city. 
	public Student(String city) {
		this();
		this.city = city;
	}
	
	// This constructor is initialized firstName & LastName
	public Student(String firstName, String lastName, String city) {
		this(city);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(int rlno, String firstName, String lastName, String city) {
		this(firstName, lastName, city);
		this.rlno = rlno;
	}
	
	@Override
	public String toString() {
		return "Student [rlno="+this.rlno+", firstName="+this.firstName+", lastName="+this.lastName+", city="+this.city+", collage="+Student.collage+"]";
	}

}
