package com.hardik.javase;

/**
 * Outer Class
 * 
 * @author HARDIK HIRAPARA
 */
class Outer {

	/**
	 * Show method for Outer class
	 */
	public void show() {

		System.out.println("This is show method in Outer Class.");

		/**
		 * Inner Class
		 * 
		 * @author HARDIK HIRAPARA
		 *
		 */
		class Inner {

			/**
			 * Show method for Inner class
			 */
			public void show() {
				System.out.println("This is show method from Inner Class.");
			}
		}

		Inner inner = new Inner();
		inner.show();

	}
}

/**
 * Local Inner Class Example
 * 
 * @author silent
 */
public class InnerClassDemo3 {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		new Outer().show();
	}

}
