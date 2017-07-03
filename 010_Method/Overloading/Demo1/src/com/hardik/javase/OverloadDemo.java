package com.hardik.javase;

class Overload {
	/**
	 * Test method with no-parameter
	 */
	public void test() {
		System.out.println("Without Parameter");
	}

	/**
	 * Test method with one integer parameter
	 * 
	 * @param i
	 */
	public void test(int i) {
		System.out.println("One Parameter: " + i);
	}

	/**
	 * Test method with two integer parameter
	 * 
	 * @param a
	 * @param b
	 */
	public void test(int a, int b) {
		System.out.println("Two Parameter (sum): " + (a + b));
	}

	/**
	 * Test method with one double parameter
	 * 
	 * @param d
	 * @return double
	 */
	public double test(double d) {
		return d * d;
	}

}

/**
 * Overload Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class OverloadDemo {

	public static void main(String[] args) {

		Overload od = new Overload();
		od.test();
		od.test(10);
		od.test(11, 22);
		System.out.println("Double Parameter: " + od.test(50.90));
	}
}
