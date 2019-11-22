package basics;

public class MinAveMax {

	public static void main(String[] args) {
		int[] numList = {4,1,7,9,5,11,6,0,52,0,39};
		System.out.println(max(numList));
		System.out.println(min(numList));
		System.out.println(ave(numList));
	}
	public static int max(int[] x) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	public static int min(int[] x) {
		int min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) {
				min = x[i];
			}
		}
		return min;
	}
	public static double ave(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		//System.out.println(sum + " " + x.length + " " + (sum / x.length));
		return ((double)sum / x.length);
	}
}
