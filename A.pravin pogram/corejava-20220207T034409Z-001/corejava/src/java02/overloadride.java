package java02;
// by pravin shinde
class mock {
	void test() {
		System.out.println("test method of mock class");
	}
	void test(int i) {          // overloading
		System.out.println("test method of mock class " +i);
	}
}
class interview extends mock{
	void test() {           // overriding
		System.out.println("test method of interview class");
	}
}
public class overloadride {

	public static void main(String[] args) {
		interview obj = new interview();
		obj.test();
		obj.test(5);
	}
}
