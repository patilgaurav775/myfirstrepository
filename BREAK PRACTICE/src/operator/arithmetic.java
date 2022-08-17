package operator;

public class arithmetic {
//today class is of arithmetic operators
	public static void main(String[] args) {
		arithmetic obj=new arithmetic();
		obj.add(99, 1);
		obj.sub(101, 1);
		obj.multi(10, 10);
		arithmetic.dividion(10000, 100);
		arithmetic.modulus(99);
		
	}
	public void add(int a,int b) {
		System.out.println("addition of two number is"+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("substraction of two number is"+(a-b));
	}
	public void multi(int a,int b) {
		System.out.println("multiplication of two number is"+(a*b));
	}
	public static void dividion(int a,int b) {
		System.out.println("division of two number is"+(a/b));
	}
	public static void modulus(float a) {
		System.out.println("remainder of two number is"+(a%2));
	}
}
