package org.hcl;

public class SavingsAccount extends Account {

	protected Double minimunBalance;

	public SavingsAccount() {

	}

	SavingsAccount(Double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}

	public Double getMinimunBalance() {
		return minimunBalance;
	}

	public void setMinimunBalance(Double minimunBalance) {
		this.minimunBalance = minimunBalance;
	}

}
