package oop;

public class BankAccount implements IRate {
	String accountNumber;
	private static final String routingNumber = "012345";
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	BankAccount() {
		System.out.println("New account created!");
	}
	
	BankAccount(String acctType) {
		System.out.println("New account created: " + acctType);
		accountType = acctType;
	}
	
	BankAccount(String acctType, double initDeposit) {
		System.out.print("New account created: " + acctType);
		System.out.println(" with initial deposit: $" + initDeposit);
		String msg = null;
		if (initDeposit < 1000) {
			msg = "ERROR: Minimum deposit must be at least $1,000, inital deposit not accepted.";
		}
		else {
			balance = initDeposit;
			msg = "Thank you for your initial deposit of: $" + initDeposit;
		}
		System.out.println(msg);
		accountType = acctType;
	}
	
	// Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// Potentially do some validation here
		this.name = name;
	}		
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");		
	}
	
	// Define methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit", amount);
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("Withdraw", amount);
	}
	
	private void showActivity(String activity, double amount) {
		System.out.println("Recent Transaction:" +
						   "\n  Account: " + accountType +
	                       "\n  Type: " + activity + 
	                       "\n  Amount: " + amount +
				           "\n  Balance: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + ". Account Type: " + accountType +". Account Number: " + accountNumber + 
			   ". Routing Number: " + routingNumber + ". Balance: $" + balance + " ]";
	}
	
}
