package com.hardik.javase;

/**
 * Animal Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Animal {

	public void eat() {
		System.out.println("Animal.eat() method.");
	}
}

/**
 * Dog Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("Dog.eat() method.");
	}
}

/**
 * BabyDog Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class BabyDog extends Dog {
	@Override
	public void eat() {
		System.out.println("BabyDog.eat() method.");
	}

}

/**
 * BigDog Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class BigDog extends Dog {

}

/**
 * Java Runtime Polymorphism with Multilevel Class
 * 
 * @author HARDIK HIRAPARA
 */
public class App {

	public static void main(String[] args) {
		Animal animal;

		// Animal class reference
		animal = new Animal();
		animal.eat();

		// Dog class reference
		animal = new Dog();
		animal.eat();

		// BabyDog class reference
		animal = new BabyDog();
		animal.eat();

		// BigDog class reference
		animal = new BigDog();
		animal.eat(); // Refers to it's parent class eat() method
	}
}
