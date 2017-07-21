package com.hardik.javase;

/**
 * Outer
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Outer {

	private Inner inner = new Inner();

	/**
	 * Show method in Outer class
	 */
	public void show() {
		System.out.println("This is show method from Outer Class");
		inner.show();
	}

	/**
	 * Inner
	 * 
	 * @author HARDIK HIRAPARA
	 *
	 */
	class Inner {
		/**
		 * Show method in Inner class
		 */
		public void show() {
			System.out.println("This is show method from Inner Class.");
		}
	}
}

/**
 * Java Member Inner Class Example
 * 
 * @author HARDIK HIRAPARA
 */
public class MemberInnerClass {

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.show();

	}

}
