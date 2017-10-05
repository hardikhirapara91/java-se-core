package com.hardik.javase;

/**
 * Abstract class Interface Example
 * 
 * The abstract class can also be used to provide some implementation of the
 * interface. In such case, the end user may not be forced to override all the
 * methods of the interface.
 * 
 * In following App class not implemented third() method of Foo interface
 * because of it's already provided implementation on Test class
 *
 */
public class App implements FirstTest, SecondTest {

	public static void main(String[] args) {
		App app = new App();
		app.printFirstTest();
		app.printSecondTest();
	}

	@Override
	public void printSecondTest() {
		System.out.println("This is first test method");
	}

	@Override
	public void printFirstTest() {
		System.out.println("This is second test method.");
	}
}
