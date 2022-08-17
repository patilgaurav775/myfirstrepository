package Objectclass;

public class Object3 extends Object {

	public double tostring(int a) {
		double sqaure = a * a;
		System.out.print("sqaure of number is : ");
		return sqaure;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object3 obj = new Object3();
		System.out.println(obj.tostring(10));
		System.out.println("-------------");
		System.out.println(obj.toString());
		System.out.println("-------------");
		System.out.println(obj);
		System.out.println("-------------");

	}
}
