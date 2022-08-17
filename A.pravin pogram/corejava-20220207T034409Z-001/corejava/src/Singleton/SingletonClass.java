package Singleton;

/*
 * Rule 1: Create constructor as private
 * Rule 2: create static instance of current class
 * Rule 3: create static method which should returns the object of current class
 */
class java {
	String a;

	// Rule 1:
	private java() {
		a = "Hello I am string of class java ";
	}

	// Rule 2:
	static java j = new java();

	// Rule 3:
	static java display() {
		System.out.println("I am static method of class java ");
		return j;
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		java m = java.display();

		m.display();

		System.out.println(m.a);

		System.out.println(m.display());

		java.display();

		java.j.display();
		
		

	}

}
