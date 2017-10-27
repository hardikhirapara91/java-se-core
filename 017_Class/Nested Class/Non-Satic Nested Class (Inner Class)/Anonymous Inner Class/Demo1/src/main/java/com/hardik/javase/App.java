package com.hardik.javase;

/**
 * Abstract class Person
 * 
 * @author HARDIK HIRAPARA
 *
 */
abstract class Person {
	abstract public void eat();
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

		// Calling anonymous inner class-1
		Person person = new Person() {
			@Override
			public void eat() {
				System.out.println("Person is eating.");
			}
		};
		person.eat();

		// Calling anonymous inner class-2
		new Person() {
			@Override
			public void eat() {
				System.out.println("Person is eating very well.");
			}
		}.eat();
	}

}
