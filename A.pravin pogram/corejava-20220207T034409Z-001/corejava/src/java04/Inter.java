package java04;

//multiple inheritance
interface input1 {
	void print();
}

interface input2 {
	int display();
}

public class Inter implements input1, input2 {
	int a = 10;
	int b = 20;

	public void print() {
		System.out.println("a = " + a + "\nb = " + b);
	}

	public int display() {
		int sum;

		return (sum = a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inter obj = new Inter();
		obj.print();
		System.out.println("sum = " + obj.display());
		System.out.println("-----------");
		input1 obj1 = new Inter();
		obj1.print();
		System.out.println("-----------");
		input2 obj2 = new Inter();
		System.out.println("sum = " + obj2.display());
		System.out.println("-----------");
	}

}
