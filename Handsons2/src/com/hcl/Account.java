package com.hcl;

public class Account {

	private String accName;
	private String accNo;
	private String bankName;

	public Account() {

	}

	public Account(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void display() {
		System.out.println(accName);
		System.out.println(accNo);
		System.out.println(bankName);
	}
}

class CurrentAccount extends Account {
	private String accName;
	private String accNo;
	private String bankName;
	private String tinNumber;

	public CurrentAccount() {

	}

	CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
		this.tinNumber = tinNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}

	public void display1() {

		System.out.println("enter account details");
		System.out.println("enter account name:" + getAccName());
		System.out.println("enter account no:" + getAccNo());
		System.out.println("enter  bank name:" + getBankName());
		System.out.println("enter tin name:" + getTinNumber());
	}

}

class SavingsAccount extends CurrentAccount {
	private String accName;
	private String accNo;
	private String bankName;
	private String orgName;

	SavingsAccount() {

	}

	SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;

		this.orgName = orgName;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void display2() {
		System.out.println("enter account details");
		System.out.println("enter account name:" + getAccName());
		System.out.println("enter account no:" + getAccNo());
		System.out.println("enter  bank name:" + getBankName());
		System.out.println("enter org name:" + getOrgName());

	}
}