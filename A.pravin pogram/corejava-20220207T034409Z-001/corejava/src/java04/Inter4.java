package java04;

interface input5 {
	void addition(int x, int y);

	void product(int p, int q);
}

class input6 implements input5 {

	public void addition(int a, int b) {
		int sum = a + b;
		System.out.println("a = " + a + "\nb = " + b);
		System.out.println("sum = " + sum);
	}

	public void product(int i, int j) {
		int pro = i * j;
		System.out.println("i = " + i + "\nj = " + j);
		System.out.println("product = " + pro);
	}
}

public class Inter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input6 m = new input6();
		m.addition(100, 100);
		System.out.println("-----------");
		m.product(10, 10);
		System.out.println("-----------");

		input5 n = new input6();
		n.addition(25, 25);
		System.out.println("-----------");
		n.product(2, 10);
		System.out.println("-----------");

	}

}
