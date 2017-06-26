package com.hardik.javase;

/**
 * Student Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Student {

	private int rlno;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRlno() {
		return rlno;
	}

	public void setRlno(int rlno) {
		this.rlno = rlno;
	}

	@Override
	public String toString() {
		return "Student [rlno=" + this.getRlno() + ", name=" + this.getName() + "]";
	}
}
