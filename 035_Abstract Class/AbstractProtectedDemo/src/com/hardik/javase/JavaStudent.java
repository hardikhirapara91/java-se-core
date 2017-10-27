package com.hardik.javase;

/**
 * Java Student
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class JavaStudent extends Student {

	protected int labMarks;

	public JavaStudent(String name, String mobile, int labMarks) {
		super(name, mobile);
		this.labMarks = labMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Lab Marks: " + this.labMarks);
	}

	@Override
	public int getMarks() {
		return this.labMarks;
	}

}
