package Objectclass;

class test1 {
	void display() {
		System.out.println("I am display()..");
	}
}

public class object1 extends test1 {
	

	public static void main(String args[]) {
		object1 s = new object1();
		// Below two statements are equivalent
		System.out.println(s);
		System.out.println("---------------");
		System.out.println(s.toString());
		System.out.println("---------------");
		System.out.println(s.hashCode());
		System.out.println("---------------");
		
	}
}
