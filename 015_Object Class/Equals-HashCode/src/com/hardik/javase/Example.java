package com.hardik.javase;

/**
 * Example Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Example {

	public static void main(String[] args) {

		Point p1 = new Point(1, 2);
		Point p2 = new Point(1, 2);
		Point p3 = new Point(4, 5);
		Point p4 = p1;

		System.out.println("p1 == p1: " + (p1 == p1));
		System.out.println("p1.equals(p1): " + (p1.equals(p1)));
		System.out.println("p1 == p2: " + (p1 == p2));
		System.out.println("p1.equals(p2): " + (p1.equals(p2)));
		System.out.println("p1 == p3: " + (p1 == p3));
		System.out.println("p1.equals(p3): " + (p1.equals(p3)));
		System.out.println("p1 == p4: " + (p1 == p4));
		System.out.println("p1.equals(p4): " + (p1.equals(p4)));
	}
}
