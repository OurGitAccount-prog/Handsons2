package org.hcl;

public class Account {

	protected String accountNumber;
	protected Double balance;
	protected String accountHolderName;

	public Account() {

	}

	Account(String accountNumber, Double balance, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
}
