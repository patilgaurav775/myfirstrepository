package java01;

public class Constructor01 {
	int a, b, p;

	Constructor01(int x, int y) {
		a = x;
		b = y;
	}

	Constructor01(int z) {
		p = z;
	}

	void Add1() {
		int sum = a + b;
		System.out.println("addition of a & b is " + sum);
	}
	void Square1() {	
	int square = p * p;
		System.out.println("square of number is " + square);

	}
	public static void main(String[] args) {
		Constructor01 obj1 = new Constructor01(10, 20);
		obj1.Add1();
		Constructor01 obj2 = new Constructor01(25);
		obj2.Square1();
	}
}