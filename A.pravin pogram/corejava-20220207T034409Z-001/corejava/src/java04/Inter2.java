package java04;

interface input3 {
	void subs();
}

interface input4 extends input3 {
	void substraction();
}

public class Inter2 implements input3, input4 {
	int x = 50;
	int y = 20;

	public void subs() {
		System.out.println("x = " + x + "\ny = " + y);
	}

	public void substraction() {
		int sub = x - y;
		System.out.println("sub = " + sub);
	}

	public static void main(String[] args) {

		Inter2 obj = new Inter2();
		obj.subs();
		obj.substraction();
		System.out.println("-----------");
		input3 i = new Inter2();
		i.subs();
		System.out.println("-----------");
		input4 j = new Inter2();
		j.subs();
		j.substraction();
		System.out.println("-----------");

	}
}
