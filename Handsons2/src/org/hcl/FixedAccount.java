package org.hcl;

public class FixedAccount extends SavingsAccount {

	private int lockingPeriod;

	public FixedAccount() {

	}

	FixedAccount(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}

}
