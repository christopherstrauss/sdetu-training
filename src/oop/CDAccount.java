package oop;

public class CDAccount extends BankAccount implements IRate {
	double interestRate;
	
	CDAccount() {
		accountType = "CD Account";
	}
	
    void compound () {
    	System.out.println("Compounding interest");
    }
}
