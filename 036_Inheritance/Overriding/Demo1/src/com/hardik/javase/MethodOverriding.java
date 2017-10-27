package com.hardik.javase;

/**
 * Vehicle Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Vehicle {
	/**
	 * Run method for Vehicle class
	 */
	public void run() {
		System.out.println("Run method in Vehicle class.");
	}
}

/**
 * Car Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Car extends Vehicle {
	/**
	 * Override run method for Car class
	 */
	@Override
	public void run() {
		System.out.println("Run method in Car class.");
	}
}

/**
 * Method Overriding
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MethodOverriding {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Car().run();
	}
}
