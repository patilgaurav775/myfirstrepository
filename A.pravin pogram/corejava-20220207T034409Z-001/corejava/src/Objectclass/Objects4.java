package Objectclass;

class test2 {
	int age = 25;
	int salary = 25000;

	public int hashcode() {
		return age;
	}

	public int tostring() {
		return salary;
	}

	public boolean equals(Object o) {
		test2 t = (test2) o;
		return (this.age == t.age && this.salary == t.salary);
		//return(25==25 && 25000 == 25000);
	}
}
public class Objects4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first object of test2 class");
		test2 t1 = new test2();
		System.out.println(t1.hashcode());
		System.out.println("-----------------");
		System.out.println("my age is: "+t1.hashcode());
		System.out.println("-----------------");
		System.out.println(t1.tostring());
		System.out.println("-----------------");
		System.out.println(t1.toString());
		System.out.println("-----------------");

		System.out.println("second object of test2 class");
		test2 t2 = new test2();
		System.out.println(t2.hashcode());
		System.out.println("-----------------");
		System.out.println(t2.hashCode());
		System.out.println("-----------------");
		System.out.println(t2.tostring());
		System.out.println("-----------------");
		System.out.println(t2.toString());
		System.out.println("-----------------");

		test2 t3 = new test2();
		System.out.println(t3.equals(t2));
		System.out.println(t1.equals(t2));
	}
}
