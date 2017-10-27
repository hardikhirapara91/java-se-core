package com.hardik.javase;

/**
 * Test Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Test {
	// Private variable
	private String name = "Hardik Hirapara";

	/**
	 * Private print method
	 */
	private void print() {
		System.out.println("Name: " + name);
	}
}

/**
 * Class Foo
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Foo {
	/**
	 * Private Constructor
	 * 
	 * If you make any class constructor private, you cannot create the instance
	 * of that class
	 */
	private Foo() {
		System.out.println("Private Constructor.");
	}
}

/**
 * Application Main Class
 *
 * A class cannot be private or protected except nested class.
 */
public class App {
	public static void main(String[] args) {

		Test test = new Test();
		System.out.println(test.name); // The field Test.name is not visible

		Foo foo = new Foo(); // Constructor Foo is not visible
	}
}
