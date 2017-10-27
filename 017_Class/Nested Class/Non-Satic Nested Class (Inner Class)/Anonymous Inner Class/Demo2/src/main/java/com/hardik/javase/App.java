package com.hardik.javase;

/**
 * Interface Person
 * 
 * @author HARDIK HIRAPARA
 *
 */
interface Person {
	public void eat();
}

/**
 * Java anonymous inner class example using interface
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
