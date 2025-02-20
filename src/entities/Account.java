package entities;

import person.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
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

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		amount += balance;
	}
	public void withdraw(Double amount) throws DomainException {
		if(balance == null) {
			throw new DomainException ("There is no balance in the account!"); 
		}
		if(amount > withdrawLimit) {
			throw new  DomainException("withdrawal cannot exceed the limit!");			
		}
		balance -= amount;
	}
}
