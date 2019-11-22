package basics;

public class Cities {

	public static void main(String[] args) {
		/*
		String[] cities = {"New York","San Francisco","Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		*/
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i = 0;
		do {
			System.out.println(i + " " + states[i++]);
		} while (i < states.length);
		
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			if (states[n++] == "Texas") {
				System.out.println("State found!");
				stateFound = true;
			}
		}
		
		for(int x = 0; x < states.length; x++) {
			System.out.println(x + " " + states[x]);
		}
	}

}
