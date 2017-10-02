package com.hardik.javase;

/**
 * Interface Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class InterfaceDemo {

	public static void main(String[] args) {

		// Circle
		Shape circle = new Circle(12.34);
		circle.draw();
		System.out.println("Area of Circle: " + circle.getArea());

		// Rectangle
		Shape rectangle = new Rectangle(12.22, 34.55);
		rectangle.draw();
		System.out.println("Area of Rectangle: " + rectangle.getArea());
	}

}
