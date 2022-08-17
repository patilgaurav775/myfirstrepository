package java03;

public class primitivecasting {

	public static void main(String[] args) {

		long age = 200l;
		System.out.println("original age value: " + age);

		// explicit widening
		double age1 = (double) age;
		System.out.println("explicit widening age: " + age1);

		// implicit widening
		double age2 = age;
		System.out.println("implicit widening age: " + age2);

		// explicit narrowing
		int age3 = (int) age;
		System.out.println("implicit widening age: " + age3);

		// explicit narrowing
		byte age4 = (byte) age;
		System.out.println("implicit widening age: " + age4);
	}

}
