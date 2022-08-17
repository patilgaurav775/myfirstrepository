package Practice;

public class palindrome {

	public static void main(String[] args) {

		int num = 1231;
		int z = num;
		int rev = 0;

		for (; num != 0;) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == z) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is NOT palindrome");
		}

	}

}
