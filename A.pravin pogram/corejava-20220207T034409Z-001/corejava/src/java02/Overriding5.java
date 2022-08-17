package java02;
class Parent5 {
	void show() {
		System.out.println("Parent's show()");
	}
}
// Inherited class
class Child5 extends Parent5 {
	// This method overrides show() of Parent
	void show() {
		System.out.println("Child's show()");
	}
}
// Inherited class
class GrandChild extends Child5 {
	// This method overrides show() of Parent
	void show() {
		System.out.println("GrandChild's show()");
	}
}
// Driver class
class Overriding5 {
	public static void main(String[] args) {
		Parent5 obj1 = new GrandChild();
		obj1.show();
		System.out.println("-------------------");
		GrandChild obj2 = new GrandChild();
		obj2.show();
		System.out.println("-------------------");
		Child5 obj3 = new GrandChild();
		obj3.show();
		System.out.println("-------------------");
	}
}


