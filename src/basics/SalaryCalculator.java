package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's create a variable to define our career
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = rate * hoursPerWeek * weeksPerYear;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + "per hour is $" + salary + " per year");
	}
}
