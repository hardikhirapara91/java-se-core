package com.hardik.javase;

/**
 * Outer Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Outer {
	/**
	 * Static Inner Class
	 * 
	 * @author HARDIK HIRAPARA
	 *
	 */
	static class Inner {
		/**
		 * Show method from static inner class
		 */
		public void show() {
			System.out.println("This is show method from static inner class.");
		}
	}
}

/**
 * Static Inner Class
 * 
 * @author HARDIK HIRAPARA
 */
public class StaticInnerClass {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.show();
	}

}
