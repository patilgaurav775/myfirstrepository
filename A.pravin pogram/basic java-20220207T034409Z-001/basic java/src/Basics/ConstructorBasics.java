package Basics;

public class ConstructorBasics {
	int a;
	static long b;
	boolean c;
	static char d;

	public void Samplemethod(int a, long b, boolean c, char d) {
		System.out.println("I am Samplemethod...");
	}

	ConstructorBasics(int a, long b, boolean c, char d) {
		System.out.println("I am Constrcutor...");
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public static void main(String[] args) {

		ConstructorBasics cb1 = new ConstructorBasics(10, 1000, true, 'A');

		ConstructorBasics cb2 = new ConstructorBasics(5, 200, false, 'Z');

		System.out.println(cb1.a + " " + cb1.b + " " + cb1.c + " " + cb1.d);

	}

}
