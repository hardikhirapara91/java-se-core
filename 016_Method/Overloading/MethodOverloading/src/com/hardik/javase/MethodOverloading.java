package com.hardik.javase;

/**
 * Method Overloading
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class MethodOverloading {

	public static void main(String[] args) {

		Calculate cal = new Calculate();

		cal.sum(12, 34);
		cal.sum(67, 90, 900);
		cal.sum(12.34, 56.78);

	}
}
