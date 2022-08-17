package java01;
//herarchical inheritance
class A3{
	int a, b;
	A3(int x, int y){
		a=x;
		b=y;
		System.out.println("first number is "+a);
		System.out.println("last number is "+b);
	}
}
class B3 extends A3{
	int sum = a+b;
	B3(){
		super(100,50);
	}
	void Add() {
		System.out.println("addition of two number is "+sum);
	}
}
class C3 extends A3{
	int substraction = a-b;
	C3() {
		super(50,35);
	}
	void sub() {
		System.out.println("substraction of two number is "+substraction);
	}
}
public class Inheritance3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B3 obj1 = new B3();
		obj1.Add();
		C3 obj2 = new C3();
		obj2.sub();
	}
}
