package Singleton;

class Arithmatic {
	static int a, b;
	//Rule 1 : create private constructor
	private Arithmatic() {
		a = 25;
		b = 5;
	}
	//Rule 2 : create static instance of current class
	static Arithmatic A = new Arithmatic();
	
	//Rule 3 : Create static method which returns object of class
	static Arithmatic Addition() {
		int sum = a+b;
		System.out.println("addition of two numbers is: "+sum);
		return A;
	}
	static Arithmatic substraction() {
		int sub = a-b;
		System.out.println("substraction of two numbers is: "+sub);
		return A;
	}
	static Arithmatic product() {
		int pro = a*b;
		System.out.println("product of two numbers is: "+pro);
		return A;
	}
	static Arithmatic division() {
		int div = a/b;
		System.out.println("division of two numbers is: "+div);
		return A;
	}
}

public class SingletonClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmatic a = Arithmatic.Addition();
		a.substraction();
		a.product();
		a.division();
//		Arithmatic s = Arithmatic.substraction();
//		Arithmatic p = Arithmatic.product();
//		Arithmatic d = Arithmatic.division();
		
		
	}

}
