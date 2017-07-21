package com.hardik.javase;

/**
 * Test Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
class Test {

	int a, b;

	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Equal To
	 * 
	 * @param obj
	 * @return
	 */
	public boolean equalTo(Test obj) {
		if (obj.a == this.a && obj.b == this.b) {
			return true;
		} else {
			return false;
		}
	}
}

/**
 * Object as Parameter
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class ObjectParameter {

	public static void main(String[] args) {

		Test t1 = new Test(100, 200);
		Test t2 = new Test(100, 20);

		System.out.println("T1 == T2 : " + t2.equalTo(t1));
	}
}
