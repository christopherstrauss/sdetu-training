package oop;

class SuperClass {
	private String name;
	private int count;
	
	// Setters and getters
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	void setCount(int count) {
		this.count = count;
	}
	int getCount() {
		return this.count;
	}
}
class SubClass extends SuperClass {
	SubClass(String nm, int cnt) {
		setName(nm);
		setCount(cnt);
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		SubClass sub = new SubClass("Chris Strauss", 100);
		System.out.println("Name: " + sub.getName() + " Count: " + sub.getCount());

	}

}
