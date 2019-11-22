package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Lord";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("Title \"" + bookTitle + "\" contains " + wordChoice);
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("CHROME")) {
			System.out.println("Browser is Chrome (or chrome, or CHROME, or ChRoMe, etc.)");
		}

		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "1239419876";
		System.out.println(firstName.substring(0,1) + lastName.substring(0,3) + SSN.substring(SSN.length() - 4));
	}

}
