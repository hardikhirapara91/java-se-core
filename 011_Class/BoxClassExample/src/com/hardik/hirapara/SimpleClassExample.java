package com.hardik.hirapara;

/**
 * Simple Class Example
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SimpleClassExample {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		double len;

		Box b1 = new Box();
		Box b2 = new Box();

		b1.width = 12;
		b1.height = 23;
		b1.depth = 45;

		b2.width = 120;
		b2.height = 183;
		b2.depth = 156;

		len = b1.width * b1.height * b1.depth;
		System.out.println("Length of Box (b1): " + len);

		len = b2.width * b2.height * b2.depth;
		System.out.println("Length of Box (b2): " + len);
	}
}
