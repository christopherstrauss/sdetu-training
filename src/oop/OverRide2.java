package oop;

class BigCat {
	void characteristic() {
		System.out.println("Big cats are cool");
	}
}
class Lion extends BigCat {
	void characteristic() {
		System.out.println("Lions are the Kings of the African Plains");
	}
}
class Tiger extends BigCat {
	void characteristic() {
		System.out.println("Tigers are the Kings of the Jungle");
	}
}
class Cheetah extends BigCat {
	void characteristic() {
		System.out.println("Cheetahs are the fastest land animal");
	}
}
public class OverRide2 {
	public static void main(String[] args) {
		BigCat ref;				// Obtain a reference of type BigCat
		ref = new Lion();
		ref.characteristic();	// These references are resolved at run time and depend on the type of object being referred to
								// (not the type of the reference variable) that determines which version of the overridden method
								// will be executed. 
		ref = new Tiger();
		ref.characteristic();
		ref = new Cheetah();
		ref.characteristic();
		ref = new BigCat();
		ref.characteristic();		
	}
}
