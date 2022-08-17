package java03;
class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class poly {
	public static void main(String args[]) {
		Animal A = new Animal();
		Animal h = new herbivores(); // up casting
		Animal o = new omnivores(); // up casting
		Animal c = new carnivores(); // up casting
		
		A.eat(); //Animals Eat
		h.eat(); //Herbivore Eat Plants
		o.eat(); //Omnivore Eat Plants and meat
		c.eat(); //Carnivore Eat meat
	}
}

