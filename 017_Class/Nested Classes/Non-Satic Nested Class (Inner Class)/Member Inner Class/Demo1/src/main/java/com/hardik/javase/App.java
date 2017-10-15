package com.hardik.javase;

/**
 * Outer Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class OuterClass {

	private String name = "Testing";

	/**
	 * Inner Class
	 * 
	 * @author HARDIK HIRAPARA
	 *
	 */
	class InnerClass {
		/**
		 * Print Name
		 */
		public void printName() {
			System.out.println("Name: " + name);
		}
	}

}

/**
 * Java Member Inner Class Example
 * 
 * @author HARDIK HIRAPARA
 */
public class App {
	/**
	 * App Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();

		inner.printName();
	}

}
