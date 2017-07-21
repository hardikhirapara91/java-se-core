package com.hardik.javase;

/**
 * Abstract class Bank
 * 
 * @author HARDIK HIRAPARA
 *
 */
abstract class Bank {
	abstract public void rateOfInterest();

	public void display() {
		System.out.println("Bank Details:");
	}
}

/**
 * Class BOB
 * 
 * @author HARDIK HIRAPARA
 *
 */
class BOB extends Bank {

	private double rate;

	public BOB(double rate) {
		this.rate = rate;
	}

	@Override
	public void rateOfInterest() {
		System.out.println("BOB Bank: " + this.rate);
	}
}

/**
 * Class SBI
 * 
 * @author HARDIK HIRAPARA
 *
 */
class SBI extends Bank {

	private double rate;

	public SBI(double rate) {
		this.rate = rate;
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Rate of Interest: " + this.rate);
	}
}

/**
 * Abstract Class
 * 
 * @author HARDIK HIRAPARA
 *
 */
public class AbstractClass {

	public static void main(String[] args) {
		BOB bob = new BOB(12.00);
		SBI sbi = new SBI(10.00);

		Bank bank;

		bank = bob;
		bank.display();
		bank.rateOfInterest();

		bank = sbi;
		bank.display();
		bank.rateOfInterest();
	}
}
