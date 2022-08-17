package method_overiding;
class child{
	public void m1() {
		System.out.println("i am from child class1234");
	}
}


public class parent extends child {
	public void m1() {
		System.out.println("i am from parent class1234");
	}
	public static void main(String[] args) {
		child name = new child();
		name.m1();

	}

}
