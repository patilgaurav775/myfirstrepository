package java01;

class fruitA {
	int fruitAge1;

	fruitA() {
		System.out.println("fruitA class cons..");
		fruitAge1 = 7;
	}

	public void taste1() {
		System.out.println("Fruits are sweet");
	}
}

class mango extends fruitA {
	int fruitAge1;

	mango() {
		// super(); //java compiler will write default super()
		System.out.println("mango class Cons..");
		fruitAge1 = 5;
	}

	public void taste1() {
		super.taste1();
		System.out.println("Mango are Tart in taste");
	}

	public void shape1() {
		System.out.println("mango is round");
	}
}

public class Inheritance6 {
	public static void main(String[] args) {
		mango m1 = new mango();
		m1.shape1();
		m1.taste1();
		System.out.println(m1.fruitAge1);
		System.out.println("----------------");
		fruitA f1 = new fruitA();
		f1.taste1();
		System.out.println(f1.fruitAge1);
		System.out.println("---------------");
		fruitA g1 = new mango();
		g1.taste1();
		System.out.println(g1.fruitAge1);
		System.out.println("---------------");
	}
}
