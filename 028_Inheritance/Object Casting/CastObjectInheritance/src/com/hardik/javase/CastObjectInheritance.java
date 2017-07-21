package com.hardik.javase;

/**
 * First Class
 **/
class First {
	public void firstMethod() {
		System.out.println("firstMethod from First Class.");
	}
}

/**
 * Second Class
 **/
class Second extends First {
	public void secondMethod() {
		System.out.println("secondMethod from Second Class.");
	}
}

/**
 * Cast Object Inheritance Main Class
 **/
public class CastObjectInheritance {

	public static void main(String[] args) {

		First first = new Second();
		first.firstMethod();

		// Convert first object to second class
		((Second) first).secondMethod();

		// First first2 = new First();
		// ((Second) first2).secondMethod(); // ClassCastException
	}
}