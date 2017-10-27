package com.hardik.javase.test;

/**
 * Foo Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Foo {

	public static void main(String[] args) {
		Test test = new Test();

		// Default modifier can accessible only same package
		System.out.println(test.no);
		test.display();
	}
}
