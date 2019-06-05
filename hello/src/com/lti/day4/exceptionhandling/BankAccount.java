package com.lti.day4.exceptionhandling;

public class BankAccount {

	private int accno;
	private String name;
	private double balance;

	public BankAccount(int accno, String name, double balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public double withdraw(double amount) throws Exception {
		if (amount > balance) {
			Exception e = new Exception("Insufficient Balance!");
			throw e;
		} else {
			balance -= amount;
			return balance;
		}
	}
	public static void main(String[] args) {
		BankAccount bankac=new BankAccount(1000,"Syed",5000);
		try {
			double balance=bankac.withdraw(6000);
			System.out.println("The balance is : "+balance);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

 }
