package java03;

class parent11 {

	void home() {
		System.out.println("home of parent");
	}
}

class child11 extends parent11 {

	void car() {
		System.out.println("car of child");
	}

}

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// implicit or auto up casting
		parent11 p1 = new child11();
		p1.home();
		System.out.println("-----------------");
		// explicit up casting
		child11 c1 = new child11(); // first create child object with child reference
		c1.home();
		c1.car();
		parent11 p2 = c1; // use child object with parent reference
		p2.home();
		System.out.println("-----------------");
		// explicit down casting
		child11 c2 = (child11) p1;
		c2.car();
		c2.home();
	}

}
