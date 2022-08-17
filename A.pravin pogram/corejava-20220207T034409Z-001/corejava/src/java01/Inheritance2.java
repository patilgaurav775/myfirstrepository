package java01;
// Multilevel inheritance 
class A2 {
	int a;
	A2(int x) {
		a = x;
	}
	void input() {
		System.out.println("first number is " + a);
	}
}
class B2 extends A2 {
	int b;
	B2(int y) {
		super(10);
		b = y;
	}
	void input1() {
		System.out.println("last number is " + b);
	}
}
class C2 extends B2 {
	C2() {
		super(20);
	}
	void output() {
		super.input();
		super.input1();
		System.out.println("addition is " + (a + b));
	}
}
public class Inheritance2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 obj2 = new C2();
		//obj2.input();
		//obj2.input1();
		obj2.output();
		System.out.println("------");
		B2 obj3 = new C2();
		obj3.input();
		obj3.input1();
		System.out.println("------");
		A2 obj4 = new C2();
		obj4.input();
		System.out.println("------");
		A2 obj5 = new B2(5);
		obj5.input();
		
	
	}

}
