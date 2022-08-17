package StringClass;

import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = new String();  //1
		//String name1 = "tester";  //2
		int age;
		String address = new String();
		String graduation = new String();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		//name = sc.nextLine();
		name = sc.next();
		System.out.println("Enter your Address: ");
		address = sc.next();
		
		System.out.println("Enter your graduation: ");
		graduation = sc.next();
		System.out.println("Enter your age : ");
		age = sc.nextInt();
		sc.close();
		System.out.println("your name is "+name+", your address is: "+address+ ", your age is: "+age+ ", your gradution is: "+graduation);
		
	}

}
