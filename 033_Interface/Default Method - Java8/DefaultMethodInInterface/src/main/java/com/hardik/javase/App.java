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
public class App implements Test {
	
	@Override
	public void print() {
		System.out.println("This is print method in App class.");
	}

	public static void main(String[] args) {
		App app = new App();
		app.display();
		app.print();
	}

	
}
