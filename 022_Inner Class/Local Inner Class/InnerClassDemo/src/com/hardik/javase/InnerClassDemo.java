package com.hardik.javase;

/**
 * Outer
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Outer {

	int outer = 100;

	/**
	 * Method of outer class
	 */
	public void outerMethod() {
		Inner in = new Inner();
		in.innerMethod();
	}

	/**
	 * Inner
	 * 
	 * @author HARDIK HIRAPARA
	 *
	 */
	class Inner {

		int inner = 200;

		/**
		 * Method of inner class
		 */
		public void innerMethod() {
			System.out.println("inner: " + inner);
			System.out.println("outer: " + outer);
		}
	}

}

/**
 * Inner Class Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class InnerClassDemo {

	public static void main(String[] args) {

		Outer out = new Outer();
		out.outerMethod();
	}
}
