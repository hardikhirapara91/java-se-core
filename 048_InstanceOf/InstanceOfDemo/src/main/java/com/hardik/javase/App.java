package com.hardik.javase;

/**
 * Java InstanceOf Operator Example
 *
 */
public class App {
	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println("t => Test: " + (t instanceof Test));
		
		Dog d = new Dog();
		System.out.println("d => Dog: " + (d instanceof Dog));
		System.out.println("d => Animal:" + (d instanceof Animal));
		
		// instanceof in java with a variable that have null value
		Test t1 = null;
		System.out.println("t1 => null: "+(t1 instanceof Test));
		
		// Downcasting with java instanceof operator
		// When Subclass type refers to the object of Parent class, it is known as downcasting.
		// Dog d1 = new Animal();	// Compilation error
		// Dog d1 = (Dog) new Animal();	// ClassCastException is thrown at runtime
		Animal a1 = new Dog();
		Dog.downcasting(a1);
	}
}
