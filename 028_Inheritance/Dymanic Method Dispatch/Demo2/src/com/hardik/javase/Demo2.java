package com.hardik.javase;

/**
 * Figure Class
 * @author HARDIK HIRAPARA
 *
 */
class Figure {

	int i, j;
	
	public Figure(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public void area() {
		System.out.println("Area of figure is not possible.");
	}
}

/**
 * Rectangle Class
 * @author HARDIK HIRAPARA
 *
 */
class Rectangle extends Figure {
	
	public Rectangle(int i, int j) {
		super(i, j);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle: " + (i * j));
	}
}

/**
 * Triangle Class
 * @author HARDIK HIRAPARA
 *
 */
class Triangle extends Figure {
	
	public Triangle(int i, int j) {
		super(i, j);
	}
	
	@Override
	public void area() {
		System.out.println("Area of Triangle: " + (i*j)/2);
	}
}

/**
 * Dynamic Method Dispatch
 * @author HARDIK HIRAPARA
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		
		Figure figure = new Figure(10, 10);
		Rectangle rectangle = new Rectangle(123, 234);
		Triangle triangle = new Triangle(111, 222);
		
		Figure f;
		
		f = figure;
		f.area();
		
		f = rectangle;
		f.area();
		
		f = triangle;
		f.area();
	}
}
