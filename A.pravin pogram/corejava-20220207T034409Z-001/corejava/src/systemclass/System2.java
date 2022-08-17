package systemclass;

import java.util.Scanner;

class maths {
	int a, b;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value ");
		a = sc.nextInt();
		System.out.println("enter second value ");
		b = sc.nextInt();
		sc.close();
	}

	void output() {
		int sum = a + b;
		System.out.print("addition of two numbers is : " + sum);
	}
}

public class System2 {

	static maths obj = new maths();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System2.obj.input();
		System2.obj.output();

	}
}
