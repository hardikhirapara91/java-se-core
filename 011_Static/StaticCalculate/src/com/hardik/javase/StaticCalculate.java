package com.hardik.javase;

/**
 * Static Method
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class StaticCalculate {

	/**
	 * Static Cube Method
	 * 
	 * @param i
	 * @return int
	 */
	public static int cube(int i) {
		return (i * i * i);
	}

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Cube of 5: " + StaticCalculate.cube(5));
		System.out.println("Cube of 10: " + cube(10));
	}
}
