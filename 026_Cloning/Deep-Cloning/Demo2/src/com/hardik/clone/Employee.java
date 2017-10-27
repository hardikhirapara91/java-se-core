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

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public Object clone() {
		try {
			Employee clonedEmployee = (Employee) super.clone();
			clonedEmployee.setDept((Department) clonedEmployee.getDept().clone());
			return clonedEmployee;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
