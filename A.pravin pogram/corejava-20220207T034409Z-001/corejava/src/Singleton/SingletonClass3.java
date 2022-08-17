package Singleton;

class Singleton {

	private static Singleton single_instance = new Singleton();

	public String s;

	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	public static Singleton getInstanceOfSingleton() {

		return single_instance;
	}
}

public class SingletonClass3 {

	public static void main(String args[]) {

		Singleton x = Singleton.getInstanceOfSingleton();
		System.out.println("String from x is: " + x.s);

		Singleton y = Singleton.getInstanceOfSingleton();
		System.out.println("String from y is: " + y.s);

		Singleton z = Singleton.getInstanceOfSingleton();
		System.out.println("String from z is: " + z.s);

		System.out.println("**********After converting to upper case*********");
		x.s = (x.s).toUpperCase();

		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
		System.out.println("\n");

		System.out.println("**********After converting to lower case*********");
		z.s = (z.s).toLowerCase();
		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
	}
}
