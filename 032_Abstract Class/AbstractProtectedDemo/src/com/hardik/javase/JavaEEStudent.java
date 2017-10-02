package com.hardik.javase;

/**
 * JavaEE Student Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class JavaEEStudent extends JavaStudent {

	protected int projectMarks;

	public JavaEEStudent(String name, String mobile, int labMarks, int projectMarks) {
		super(name, mobile, labMarks);
		this.projectMarks = projectMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Project Marks: " + this.projectMarks);
	}

	@Override
	public int getMarks() {
		return (super.getMarks() + this.projectMarks);
	}

}
