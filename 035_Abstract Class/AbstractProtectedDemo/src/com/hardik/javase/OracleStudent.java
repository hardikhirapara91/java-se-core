package com.hardik.javase;

/**
 * Oracle Student
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class OracleStudent extends Student {

	protected int theoryMarks;

	public OracleStudent(String name, String mobile, int theoryMarks) {
		super(name, mobile);
		this.theoryMarks = theoryMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Theory Marks: " + this.getMarks());
	}

	@Override
	public int getMarks() {
		return this.theoryMarks;
	}
}
