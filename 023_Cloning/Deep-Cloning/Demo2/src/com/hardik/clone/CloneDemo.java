package com.hardik.clone;

/**
 * Clone Demo Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CloneDemo {

	public static void main(String[] args) {
		Department dept = new Department(1, "Computer");
		Employee employee = new Employee(25, "Hardik", dept);

		// Lets create a clone of original object
		Employee clonedObj = (Employee) employee.clone();
		// Let verify using employee id, if cloning actually workded
		System.out.println(clonedObj.getEmpName());

		// Verify JDK's rules

		// Must be true and objects must have different memory addresses
		System.out.println(employee != clonedObj);

		// As we are returning same class; so it should be true
		System.out.println(employee.getClass());
		System.out.println(clonedObj.getClass());
		System.out.println(employee.getClass() == clonedObj.getClass());

		// Default equals method checks for refernces so it should be false. If
		// we want to make it true,
		// we need to override equals method in Employee class.
		System.out.println(employee.equals(clonedObj));
	}

}
