package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acct1 = new BankAccount("Checking", 10000);
		acct1.accountNumber = "01689453";
		// name is now private
		//acct1.name = "Roger Hue";
		System.out.println(acct1.toString());
		acct1.setName("Roger Hue");
		System.out.println("Name set to " + acct1.getName());
		acct1.setSsn("388991234");
		System.out.println("SSN: " + acct1.getSsn());
		System.out.println(acct1.toString());
		acct1.setRate();
		acct1.increaseRate();
		
		acct1.deposit(1500);
		// Polymorphism through overriding
		System.out.println(acct1.toString());
		
		// Polymorphism through overloading
		BankAccount acct2 = new BankAccount("Checking");
		acct2.accountNumber = "01689454";
		//System.out.println(acct2.toString());				
		BankAccount acct3 = new BankAccount("Savings", 1000);
		acct3.accountNumber = "01689455";
		
		/*
		acct3.checkBalance();
		System.out.println(acct3.toString());
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = 4.5;
		cd1.name = "Juan Hernandez";
		cd1.accountType = "CD Account";
	    System.out.println(cd1.toString());
	    cd1.compound();
		*/
	}

}
