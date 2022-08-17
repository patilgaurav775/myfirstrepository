package java04;

interface inputs {
	void demo(int x, int y);
}

class addition implements inputs {

	public void demo(int a, int b) {
		int sum = a + b;
		System.out.println("a = " + a + "\nb = " + b);
		System.out.println("sum = " + sum);
	}
}

class product implements inputs {
	public void demo(int c, int d) {
		int pro = c * d;
		System.out.println("c = " + c + "\nd = " + d);
		System.out.println("product = " + pro);
	}
}

public class Inter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		product p = new product();
		p.demo(20, 5);
		System.out.println("-----------");
		addition a = new addition();
		a.demo(25, 25);
		System.out.println("-----------");

		inputs i = new addition();
		i.demo(10, 20);
		System.out.println("-----------");
		inputs j = new product();
		j.demo(10, 20);
		System.out.println("-----------");
	}

}
