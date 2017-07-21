package com.hardik.clone;

/**
 * Department Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Department {

	private int deptId;
	private String deptName;

	public Department(int id, String name) {
		this.deptId = id;
		this.deptName = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
