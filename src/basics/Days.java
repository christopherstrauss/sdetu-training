package basics;

public class Days {

	public static void main(String[] args) {
		// Execute different block of code based on the value of a condition
		
		String dayOfWeek= "Tuesday";
		
		switch(dayOfWeek) {
			case "Monday" : 
				System.out.println("Day of week is Monday");
				break;
			case "Tuesday" : 
				System.out.println("Day of week is Tuesday");
				break;
			case "Wednesday" : 
				System.out.println("Day of week is Wednesday");
				break;
			case "Thursday" : 
				System.out.println("Day of week is Thursday");
				break;
			case "Friday" : 
				System.out.println("Day of week is Friday");
				break;
		}
	}

}
