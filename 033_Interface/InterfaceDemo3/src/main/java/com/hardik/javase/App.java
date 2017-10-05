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
public class App implements C {

	@Override
	public void printA() {
		System.out.println("A");
	}

	@Override
	public void printB() {
		System.out.println("B");
	}

	@Override
	public void printC() {
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		C c1 = new App();
		c1.printA();
		c1.printB();
		c1.printC();
	}
}
