package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("333445555", 1500);
		BankAccount acc2 = new BankAccount("433445556", 10000);
		BankAccount acc3 = new BankAccount("533445557", 500);
		
		acc1.setName("Jim Smith");
		System.out.println(acc1.getName());
		acc1.payBill(600);
		acc1.payBill(500);
		acc1.makeDeposit(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest {
	private static int ID = 1000;	// Internal ID - static: belongs to the class not each object
	private String accountNumber;	// ID + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "123456789";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN, double initBalance) {
		this.SSN = SSN;
		balance = initBalance;
		ID++;
		setAccountNumber();
	}
	
	// accountNumber is internally generated, we do not want the client to set it, hence the setter is private
	private void setAccountNumber() {
		int randomNum = (int)(Math.random() * ((99 - 10) + 1)) + 10;
		accountNumber = ID + "" + randomNum + SSN.substring(0, 2);
		System.out.println("Your account number: " + accountNumber + " Initial deposit is: $" + balance);
	}
	
	// get and set functions for encapsulation
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// methods
	public void payBill(double amount) {
		System.out.println("Account #: " + accountNumber + " paying: $" + amount);
		balance = balance - amount;
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Account #: " + accountNumber + " depositing: $" + amount);
		balance = balance + amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Account #: " + accountNumber + " balance: $" + balance);
	}

	@Override
	public void accrue() {
		System.out.println("Accruing interest");
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Account Number: " + accountNumber + ". Name: " + name + ". Routing Number: " + routingNumber + ". Balance: " + balance + "]";
	}
}
