package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		printName();
		int numa = 10;
		int numb = 20;
		System.out.println(addNumbers(numa, numb));
		System.out.println(multiplyNumbers(numa, numb));
	}
	
	static void printName() {
		System.out.println("My name is Tim!");
	}
	
	static int addNumbers(int a, int b) {
		return a + b;
	}
	
	static int multiplyNumbers(int c, int d) {
		return c * d;
	}

}
