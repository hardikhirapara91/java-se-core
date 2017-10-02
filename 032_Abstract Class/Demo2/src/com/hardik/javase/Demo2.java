package com.hardik.javase;

/**
 * Figure Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
abstract class Figure {

	int dim1, dim2;

	public Figure(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	abstract public void area();
}

/**
 * Rectangle Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Rectangle extends Figure {

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle: " + (dim1 * dim2));

	}

}

/**
 * Triangle Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Triangle extends Figure {

	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public void area() {
		System.out.println("Area of Trangle: " + (dim1 * dim2) / 2);
	}

}

/**
 * Demo 2 main class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(12, 23);
		Triangle triangle = new Triangle(22, 55);

		Figure figure;

		figure = rectangle;
		figure.area();

		figure = triangle;
		figure.area();
	}
}
