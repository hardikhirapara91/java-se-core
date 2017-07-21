package com.hardik.javase;

/**
 * Operation Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Operation {
	/**
	 * Make square to provided number
	 * 
	 * @param no
	 * @return
	 */
	public double square(double no) {
		return (no * no);
	}
}

/**
 * Class Circle
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Circle {

	private double radius;
	private final double PI = 3.14159;
	private Operation op; // Aggregation

	public Circle(double radius) {
		this.radius = radius;
		this.op = new Operation();
	}

	/**
	 * Return area
	 * 
	 * @return
	 */
	public double area() {
		return PI * op.square(this.radius);
	}
}

/**
 * Aggregation Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AggregationDemo {

	public static void main(String[] args) {
		Circle sq = new Circle(12.23);
		System.out.println("Area of circle: " + sq.area());
	}
}
