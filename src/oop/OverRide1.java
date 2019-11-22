package oop;

class Animal {
	void diet() {
		System.out.println("Animals may eat plants or animals.");
	}
}
class Carnivore extends Animal {
	void diet() {
		System.out.println("Carnivores eat only animals.");
	}
}
class Herbivore extends Animal {
	void diet() {
		System.out.println("Herbivores eat only plants.");			
	}
}

class OverRide1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal c = new Carnivore();
		Animal h = new Herbivore();
		a.diet();
		c.diet();
		h.diet();
	}

}
