package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount ls = new LoanAccount();
		ls.increaseRate();
		ls.setRate();
		ls.setAmortSchedule();
		ls.setTerm(20);
		
		/* Polymorphism by reference - can be used for interfaces, not just superclasses.
		   The only available methods, in this case, are those defined in the interface, but
		   will access the methods defined in the LoadAccount class. */
		IRate acct1 = new LoanAccount();
		acct1.increaseRate();
		acct1.setRate();
	}

}
