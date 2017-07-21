package com.hardik.javase;

/**
 * Rectangle Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Rectangle implements Shape {

	private double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle Drawing...");
	}

	@Override
	public double getArea() {
		return (this.height * this.width);
	}

}
