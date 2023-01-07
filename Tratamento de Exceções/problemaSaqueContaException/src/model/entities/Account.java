package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number; 
	private String holder;
	private double balance;
	private double withdrawLimit; 
	
	public Account () {
		
	}
	public Account (Integer number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	public void withdrawLimit (double amount) {
		if (balance < amount) {
			  throw new DomainException ("Not enough balance"); 
		}
		else if (amount > withdrawLimit) {
			throw new DomainException ("The amount exceeds withdraw limit");
		}
		else {
			balance -= amount;
		}
	}
	
}
