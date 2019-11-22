package basics;

public class SumOfNumber {

	public static void main(String[] args) {
		for (int j = 0; j < 11; j++) {
			System.out.println(j + ": " + sumOfNumber(j));		
		}
	}
	
	public static int sumOfNumber (int n) {
		if (n <= 1) {
			return n;
		}
		return n + sumOfNumber(--n);
	}
}
