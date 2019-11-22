package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 1
		// fib(3) = fib(2) + fib(1) = 2
		// fib(4) = fib(3) + fib(2) = 3
		// fib(5) = fib(4) + fib(3) = 5
		// fib(6) = fib(5) + fib(4) = 8
		for (int i = 0; i < 10; i++) {
			System.out.println("fib(" + i + ") = " + fib(i));
		}
	}
	
	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return (fib(n - 1) + fib(n - 2));
	}

}
