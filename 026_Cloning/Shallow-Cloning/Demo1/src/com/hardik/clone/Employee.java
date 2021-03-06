package com.hardik.clone;

/**
 * Employee Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Employee implements Cloneable {

	private int empId;
	private String empName;
	private Department dept;

	public Employee(int id, String name, Department dept) {
		this.empId = id;
		this.empName = name;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Department getDept() {
		return dept;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
