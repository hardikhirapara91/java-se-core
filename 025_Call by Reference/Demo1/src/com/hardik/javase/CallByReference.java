package com.hardik.javase;

/**
 * Class Test
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Test {

	public int a, b;

	public Test(int i, int j) {
		this.a = i;
		this.b = j;
	}

	/**
	 * Set Test Object
	 * 
	 * @param obj
	 */
	public void meth(Test obj) {
		obj.a *= 2;
		obj.b /= 2;
	}
}

/**
 * Call By Reference
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class CallByReference {

	public static void main(String[] args) {

		Test t1 = new Test(10, 20);

		System.out.println("Before Call meth Method: " + t1.a + " : " + t1.b);
		t1.meth(t1);
		System.out.println("After Call metho Method: " + t1.a + " : " + t1.b);
	}
}
