package entities;

public class Account {

	private static final double TAX = 5.0;
	private int accountNumber;
	private String accountUserName;
	private double accountAmount;

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountUserName() {
		return accountUserName;
	}

	public void setAccountUserName(String accountUserName) {
		this.accountUserName = accountUserName;
	}

	public double getAccountAmount() {
		return accountAmount;
	}

	public Account() {
	}
	
	public Account(int accountNumber, String accountUserName, double accountAmount) {
		this.accountNumber = accountNumber;
		this.accountUserName = accountUserName;
		this.accountAmount = accountAmount;
	}

	public Account(int accountNumber, String accountUserName) {
		this.accountNumber = accountNumber;
		this.accountUserName = accountUserName;
	}

	public void deposit(double depositAmount) {
		accountAmount += depositAmount;
	}

	public void withdrawal(double withdrawalAmount) {
		accountAmount -= (withdrawalAmount + TAX);
	}
	
	public String toString() {
	    return "Account data: " 
	            + "\nNumber: " + accountNumber 
	            + ", Holder: " + accountUserName 
	            + ", Balance: $" + String.format("%.2f", accountAmount);
	}

}
