package com.hardik.javase;

/**
 * Singleton Class Account
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class Account {

	private static Account account;

	// Private Constructor
	private Account() {
	}

	/**
	 * Create Only One Instance
	 * 
	 * @return
	 */
	public synchronized static Account getInstance() {
		if (account == null) {
			account = new Account();
			System.out.println("Created account class object.");
		} else {
			System.out.println("Already created account class object.");
		}

		return account;
	}
}
