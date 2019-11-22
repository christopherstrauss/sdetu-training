package basics;

public class Factorial {

	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "! = " + fact(i));
		}
	}
	
	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

}
