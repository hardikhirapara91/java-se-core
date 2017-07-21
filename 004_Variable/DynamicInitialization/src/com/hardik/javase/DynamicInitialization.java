package com.hardik.javase;

/**
 * Dynamic Initialization
 * 
 * Pythagoras Theorem
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class DynamicInitialization {

	public static void main(String[] args) {

		float a = 10f, b = 20f;

		// Variable c is dynamic initialization
		float c = (float) Math.sqrt((a * a) + (b * b));

		System.out.println("Hypotenous: " + c);
	}

}
