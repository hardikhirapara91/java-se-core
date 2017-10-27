package com.hardik.javase;

/**
 * Test Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Test {
	/**
	 * Show method in test class
	 */
	public void show() {
		System.out.println("This show method from Test class.");
	}

}

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Example extends Test {

	/**
	 * Show method in example class
	 */
	@Override
	public void show() {
		System.out.println("This is show method from Example class.");
	}

	/**
	 * Display information
	 */
	public void displayMethods() {
		super.show(); // Call super class method
		this.show(); // Call current class method
	}
}

/**
 * Super Class Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SuperDemo3 {

	public static void main(String[] args) {
		new Example().displayMethods();
	}

}
