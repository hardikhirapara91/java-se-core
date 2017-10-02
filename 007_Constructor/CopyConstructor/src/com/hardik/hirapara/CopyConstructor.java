package com.hardik.hirapara;

/**
 * Java Copy Constructor
 * @author HARDIK HIRAPARA
 *
 */
public class CopyConstructor {

	public static void main(String[] args) {
		
		Student s1 = new Student(125, "Hardik");
		Student s2 = new Student(s1);
		Student s3 = s1;
		Student s4 = new Student();
		
		s4.id = s1.id;
		s4.name = s1.name;
				
		s1.printStudentData();
		s2.printStudentData();
		s3.printStudentData();
		
		s1 = null;
		// s1.printStudentData();	// Exception: java.lang.NullPointerException	
		s3.printStudentData();
		
		s4.printStudentData();
	}
}
