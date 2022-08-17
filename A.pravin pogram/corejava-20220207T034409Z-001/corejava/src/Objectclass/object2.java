package Objectclass;

class test {
	int age;

	void display() {
		System.out.println(" display method of class test");
	}
}

public class object2 extends test {

	void display() {
		System.out.println(" display method of class object2");
	}

	
	public int hashcode() {
		int age = 20;
		System.out.print(" my age is : ");
		return age;
	}
	public int hashcode(int age) {
		System.out.print(" my age is : ");
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		object2 o = new object2();
		System.out.println(o.hashcode());
		System.out.println("-------------");
		System.out.println(o.hashcode(40));
		System.out.println("-------------");
		System.out.println(o.hashCode());
		System.out.println("-------------");

		test t = new test();
		System.out.println(t.hashCode());
		System.out.println("-------------");
		System.out.println(t.toString());

	}

}
