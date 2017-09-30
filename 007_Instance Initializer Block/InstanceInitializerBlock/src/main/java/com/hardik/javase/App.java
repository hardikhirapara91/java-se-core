package com.hardik.javase;

/**
 * First Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class First {

	{
		System.out.println("First class instance initializer block.");
	}

	public First() {
		System.out.println("First class constructor.");
	}
}

/**
 * Class Second
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Second extends First {
	{
		System.out.println("Second class instance initializer block.");
	}

	public Second() {
		System.out.println("Second class constructor.");
	}
}

/**
 * Application Main Class
 *
 */
public class App {
	public static void main(String[] args) {
		new Second();
	}
}
