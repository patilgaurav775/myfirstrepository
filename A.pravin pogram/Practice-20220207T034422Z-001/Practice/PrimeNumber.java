package Practice;

public class PrimeNumber {

	static void checkprime1(int n) {
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is NOT prime");
		}
	}

	static void checkprime2(int n) {
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is NOT prime");
		}
	}

	public static void main(String[] args) {

		checkprime1(10);
		checkprime1(11);
		checkprime2(10);
		checkprime2(11);
	}
}
