package com.hardik.javase;

/**
 * Super Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class SuperClass {
	public String name = "Hello";

	/**
	 * Display method
	 */
	public void display() {
		System.out.println("This is display method from SuperClass.");
	}
}

/**
 * Sub Class
 * 
 * @author HARDIK HRIAPARA
 *
 */
class SubClass extends SuperClass {
	public String name = "World";

	/**
	 * Show information method
	 */
	public void show() {
		System.out.println("Super Class Name: " + super.name);
		System.out.println("Sub Class Name: " + this.name);
	}

	/**
	 * Display method in SubClass
	 */
	@Override
	public void display() {
		super.display();
		System.out.println("This is display method from SubClass.");
	}
}

/**
 * Super Class Demo
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class SuperDemo {

	public static void main(String[] args) {
		new SubClass().show();
		new SubClass().display();
	}

}
