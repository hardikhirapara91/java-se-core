package com.hardik.javase;

import com.hardik.javase.model.Person;
import com.hardik.javase.model.Student;
import com.hardik.javase.model.Teacher;

/**
 * Sum of provided numbers
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AppMain {

	public static void main(String[] args) {

		Person p;

		p = new Teacher("Test Teacher", "teacher@example.com", "Maths, English, Hindi");
		p.printPersonInfo(); // runtime polymorphism
		System.out.println(p.getOccupation()); // runtime polymorphism

		p = new Student("Hardik", "hardik@hirapara.com", "Computer Science");
		p.printPersonInfo();
		System.out.println(p.getOccupation()); // runtime polymorphism
	}
}
