package com.hardik.javase;

/**
 * Abstract Student Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public abstract class Student {

	protected String name;
	protected String mobile;

	public Student(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}

	public void print() {
		System.out.println("Student [name=" + this.name + ", mobile=" + this.mobile + "]");
	}

	abstract public int getMarks();
}
