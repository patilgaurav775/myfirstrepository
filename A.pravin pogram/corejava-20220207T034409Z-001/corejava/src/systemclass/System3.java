package systemclass;

import java.util.Scanner;

public class System3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value ");
		x = sc.nextInt();
		System.out.println("enter second value ");
		y = sc.nextInt();
		sc.close();
	
		
		int sum = x + y;
		System.out.print("addition of two numbers is : " + sum);
	}

}
