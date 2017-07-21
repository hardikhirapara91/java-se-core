package com.hardik.javase;

/**
 * Boss Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Boss implements Callable {

	public Boss() {

		Worker worker = new Worker();
		worker.doSomework(this);
	}

	/**
	 * Direct Method
	 */
	public void directMethod() {
		System.out.println("This is direct method from Boss class.");
	}

	/**
	 * CallBack Method
	 */
	@Override
	public void callBackMethod() {
		System.out.println("This is callBackMethod from Boss class.");
	}
}
