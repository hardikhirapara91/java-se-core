package com.hardik.javase;

/**
 * Inheritance Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MemberAccessInInheritance {

	public static void main(String[] args) {

		Example e = new Example();

		e.setRlno(25);
		e.setName("Hardik Hirapara");
		e.setCity("Mumbai");

		e.printStudentData();
	}
}
