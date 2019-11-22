package labs;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student stu1 = new Student("Chris","Strauss","388991234");
		stu1.setPhone("2484445678");
		stu1.setCity("Richmond");
		stu1.setState("VA");
		String[] courseWrk = {"Physics","Agebra","History","Spanish"};
		stu1.enroll(courseWrk);
		stu1.showCourses();
		stu1.checkBalance();
		stu1.pay(180.99);
		stu1.checkBalance();
        System.out.println(stu1.toString());
		Student stu2 = new Student("John","Smith","388999999");
		stu2.setPhone("2485551234");
		stu2.setCity("New York");
		stu2.setState("NY");
        System.out.println(stu2.toString());
		Student stu3 = new Student("Cindy","Jones","388994444");
		stu3.setPhone("5555155555");
		stu3.setCity("Detroit");
		stu3.setState("MI");
        System.out.println(stu3.toString());
	}

}

class Student {
	private String firstName;
	private String lastName;
	private String email;
	private String ssn;
	private static int id = 1000;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private String[] courseList = new String[10];
	private double balance;
	private static final double courseCost = 400.00;
	
	public Student(String fname, String lname, String ssn) {
		this.firstName = fname;
		this.lastName = lname;
		this.ssn = ssn;
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@example.com";
		userID = getUserId();
	}
	
	private String getUserId() {
		final int min = 1000;
		final int  max = 9000;
		int rand4;

		//rand4 = (int)(Math.random() * ((max - min) + 1)) + min;
		rand4 = (int)(Math.random() * (max - min)) + min;
		//System.out.println("Random between 1000 and 9000: " + rand4);
		//return String.valueOf(id++) + String.valueOf(rand4) + ssn.substring(ssn.length() - 4);
		return id++ + "" + rand4 + ssn.substring(ssn.length() - 4);
	}
	
	public void enroll(String[] courses) {
		for (int i = 0; i < courses.length; i++) {
			courseList[i] = courses[i];
		}
		balance = balance + (courseCost * courses.length);
		//System.out.println(courses.length + " " + balance);
	}
	
	public void pay(double payAmt) {
		balance = balance - payAmt;
	}
	
	public void checkBalance() {
		System.out.println("Account balance: " + balance);
	}
	
	public void showCourses() {
		for (int i = 0; i < courseList.length; i++) {
			if (courseList[i] == null) {
				break;
			}
			System.out.print(courseList[i] + ". ");
		}
		System.out.print("\n");
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "[First Name: " + firstName + ". Last Name: " + lastName + ". Email Address: " + email + ". User ID: " + userID  + 
			   ". Phone: " + phone + ". City: " + city + ". State: " + state + "]";
	}
}