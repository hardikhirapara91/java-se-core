package com.hardik.javase;

/**
 * AAA Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class AAA {
	/**
	 * Show method
	 * 
	 * @return
	 */
	public AAA show() {
		return this;
	}
}

/**
 * BBB Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class BBB extends AAA {
	/**
	 * Show method
	 */
	@Override
	public BBB show() {
		return this;
	}

	/**
	 * Display information
	 */
	public void display() {
		System.out.println("This is display method from BBB class.");
	}
}

/**
 * Covariant Return Type
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CovariantReturnType {

	public static void main(String[] args) {
		new BBB().show().display();
	}

}
