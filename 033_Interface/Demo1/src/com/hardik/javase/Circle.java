package com.hardik.javase;

/**
 * Circle Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle is drawing...");

	}

	@Override
	public double getArea() {
		return Math.PI * (radius * radius);
	}
}
