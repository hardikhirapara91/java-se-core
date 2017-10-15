package com.hardik.javase;

/**
 * Class Test
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Outer {

	private static String name = "Hardik Hirapara";

	/**
	 * Static Inner Class
	 * 
	 * @author HARDIK HIRAPARA
	 *
	 */
	static class Innter {
		public void display() {
			System.out.println("Display method of InnerClass:" + name);
		}

		static void print() {
			System.out.println("Print Method of InnerClass");
		}
	}
}

/**
 * Java Static Nested Class Example
 * 
 * A static class i.e. created inside a class is called static nested class in
 * java. It cannot access non-static data members and methods. It can be
 * accessed by outer class name.
 * 
 * It can access static data members of outer class including private.
 * 
 * Static nested class cannot access non-static (instance) data member or
 * method.
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
		Outer.Innter innter = new Outer.Innter();
		innter.display();

		Outer.Innter.print();
	}

}
