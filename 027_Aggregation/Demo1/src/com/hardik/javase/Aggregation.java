package com.hardik.javase;

public class Aggregation {

	public static void main(String[] args) {
		
		Address address = new Address("Mumbai", "MH", "IND");
		Employee emp = new Employee(001, "Hardik Hirapara", "Computer", address);
		
		emp.printEmpData();
	}
}
