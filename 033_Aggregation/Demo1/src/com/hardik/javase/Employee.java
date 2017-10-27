package com.hardik.javase;

/**
 * Employee Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Employee {

	private int empId;
	private String name;
	private String dept;
	private Address address; // Aggregation (Employee has-a Address)

	public Employee(int empId, String name, String dept, Address address) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public void printEmpData() {
		System.out.println("Emp ID: " + this.empId);
		System.out.println("Name: " + this.name);
		System.out.println("Department: " + this.dept);
		System.out.println("Address: " + this.address);
	}
}
