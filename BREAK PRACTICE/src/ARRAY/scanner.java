package ARRAY;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
	name1();
		String a="gaurav";
		String b="gaurav";
		System.out.println(a.equals(b));
		System.out.println(a==b);
		String c=new String("gaurav");
		String d=new String("gaurav");
		System.out.println(a.equals(c));
		System.out.println(a==c);
		System.out.println(a.equals(d));
		System.out.println(c==d);

	}

	public static void name() {
		
		System.out.println("please insert number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("addition of two number "+(a+5000));
		
	}
	
	public static void name1() {
		String a="gaurav";
		String b="aurav";
		System.out.println(a.compareTo(b));
		
	}
}
