package java01;

class Reversenumber {
	int n;
	int rev;

	Reversenumber() {
		n = 12321;
		System.out.println("the number to reverse it is " + n);
	}

	void Reverse() {
		for (; n != 0;) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("the reverse number is " + rev);
	}
}

class Palindrome extends Reversenumber {
	int p;

	Palindrome() {
		p = n;
	}

	void Pal() {
		super.Reverse();
		if (rev == p) {
			System.out.println("given number is palendrome number");
		} else {
			System.out.println("given number is not palendrome number");
		}
	}
}

public class Inheritance7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversenumber obj1 = new Reversenumber();
		obj1.Reverse();
		System.out.println("------------------------");
		Palindrome obj2 = new Palindrome();
		obj2.Pal();
	}

}
