package java01;
// single inheritance
class A1 {
	int a, b;

	void input() {
		System.out.println("first number is " + a);
		System.out.println("last number is " + b);
	}

	A1(int x, int y) {
		a = x;
		b = y;
	}
}

class B1 extends A1 {
	void output() {
		System.out.println("Addition of two numbers is " + (a + b));
	}

	B1() {
		super(10, 20);
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1();
		obj.input();
		obj.output();
	}

}
