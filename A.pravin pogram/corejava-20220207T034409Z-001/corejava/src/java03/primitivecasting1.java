package java03;

public class primitivecasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float pi = 3.142857f;
		System.out.println("original value of pi is:" + pi);

		// explicit widening
		double pi1 = (double) pi;
		System.out.println("explicit widening age: " + pi1);

		// implicit widening
		double pi2 = pi;
		System.out.println("implicit widening age: " + pi2);

		// explicit narrowing
		int pi3 = (int) pi;
		System.out.println("implicit widening age: " + pi3);

	}

}
