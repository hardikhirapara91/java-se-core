package com.hardik.javase;

/**
 * Private Access Modifier
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class PrivateVariable {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.setRlno(25);
		s1.setName("Hardik Hirapara");

		System.out.println("Roll No.: " + s1.getRlno());
		System.out.println("Name: " + s1.getName());
		System.out.println(s1);

	}

}
