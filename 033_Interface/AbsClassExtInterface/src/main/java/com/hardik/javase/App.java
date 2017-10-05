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
public class App extends Test {
	@Override
	public void first() {
		System.out.println("This is first method.");
	}

	@Override
	public void second() {
		System.out.println("This is second method.");
	}

	@Override
	public void forth() {
		System.out.println("This is fourth method.");
	}

	public static void main(String[] args) {
		Test test = new App();
		test.first();
		test.second();
		test.third();
		test.forth();
	}
}
