package com.hardik.hirapara;

/**
 * Outer
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Outer {

	/**
	 * Outer class method
	 */
	public void outerMethod() {

		for (int i = 0; i < 5; i++) {

			/**
			 * Inner class in method
			 * 
			 * @author HARDIK HIRAPARA
			 *
			 */
			class Inner {
				/**
				 * Inner class method
				 */
				public void innerMethod() {
					System.out.println("This is inner class method.");
				}
			}

			Inner in = new Inner();
			in.innerMethod();
		}
	}
}

/**
 * Inner Class Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.outerMethod();
	}
}
