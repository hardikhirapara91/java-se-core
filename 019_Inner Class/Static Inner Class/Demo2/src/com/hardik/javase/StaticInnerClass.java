package com.hardik.javase;

/**
 * Outer Class
 * 
 * @author HARDIK HIRAPARA
 */
class Outer {

	Outer.StaticInner staticInner = new Outer.StaticInner();

	/**
	 * Show method in Outer class
	 */
	public void show() {
		System.out.println("Show Method from Outer Class.");
		staticInner.show();
	}

	static class StaticInner {
		/**
		 * Show method from static inner class
		 */
		public void show() {
			System.out.println("Show Method from Static Inner Class");
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

		new Outer().show();

	}

}
