package com.hardik.javase;

/**
 * Class ABC
 * 
 * @author HARDIK HIRAPARA
 *
 */
class ABC {
	/**
	 * Final method show
	 */
	final public void show() {
		System.out.println("Show method in ABC Class.");
	}
}

/**
 * Class DEF
 * 
 * @author HARDIK HIRAPARA
 *
 */
class DEF extends ABC {
	/**
	 * Override method show
	 * 
	 * Exception: Can not override final method from ABC
	 */
	@Override
	public void show() {
		System.out.println("Show method in DEF Class.");
	}
}

/**
 * Final Method Overriding Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class FinalMethodOverriding {

	public static void main(String[] args) {
		new DEF().show();
	}
}
