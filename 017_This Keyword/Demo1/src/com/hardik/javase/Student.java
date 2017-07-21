package com.hardik.javase;

/**
 * Student Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Student {

	private int rlno;
	private String name;

	public Student(int rlno, String name) {
		this.rlno = rlno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rlno=" + this.rlno + ", name=" + this.name + "]";
	}
}
