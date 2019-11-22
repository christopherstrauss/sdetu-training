package labs;

public class wrk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1000;
		int max = 9000;
		System.out.println("Generating a series of random numbers between " + min + " and " + max + ":");
		for(int i = 1; i <= 20; i++) {
			int randnum = (int)(Math.random() * ((max - min) + 1)) + min;
			System.out.println(i + ": " + randnum);
			
		}
	}

}
