package Practice;

public class fibnacciseries {

	static void pintfibonacci1(int n) {
		int a = 0, b = 1, c = 0;

		for (; c <= n;) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;

		}
	}

	static void pintfibonacci2() {
		int a = 0, b = 1, c = 0;

		for (int i = 0; i <= 9; i++) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;

		}
	}

	public static void main(String[] args) {
		pintfibonacci1(10);
		System.out.println("\n-------------");
		pintfibonacci2();

	}

}
