package com.hardik.javase;

/**
 * Dog Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Dog extends Animal {
	/**
	 * Downcasting using java instanceof operator
	 */
	public static void downcasting(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;	// Downcasting
			System.out.println("Downcasting Performed: " + animal);
		}
	}
}
