package MOCKPRACTICE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class mock_1    {
	

	public static void main(String[] args) throws IOException {
		
	//calculation(10, 20, '+');

	//odd_even(26);
	
	//blood_donation(25, 45);
	
	//leap();
		
		//prime_number();
	
		//febonacci();
		
		//frequency();

		palidrom_number_and_string();
	}
	
	public static void calculation(int a,int b,char c) {
		
		switch(c) {
		case '+':
			 System.out.println(a+b);
		break;
		
		case '-':
			 System.out.println(a-b);
		break;
		
		case '*':
			 System.out.println(a*b);
		break;
		
		case '/':
			 System.out.println(a/b);
		break;
		
		default:
			System.out.println("please enter valid input");
			break;
		}
		
	}
	
	public static void odd_even(int a) {
		
		switch(a%2) {
		case 0:
		System.out.println("even number");
		break;
		case 1:
			System.out.println("odd number");
		break;
		default:
			System.out.println("valid input de");
		break;
		}
	}
	
	public static void blood_donation(int age , int weight) {
		if (age>18) {
			if (weight>50) {
			System.out.println("eligible for blood donation");
			}
			else {
				System.out.println("not eligible due to less weight");
			}
		} else {
				System.out.println("you can donate blood due to under age");
		}
	}
	
	public static void leap() {
		Scanner obj=new Scanner(System.in);
		int year=obj.nextInt();
		
		if (year%4==0&(year%100!=0||year%400==0)) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}
	
	public static void prime_number() {
		int count=0;
		for(int i=2;i<=100;i++) {
			boolean flag=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if (!flag) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
	
	
	public static void febonacci() {
		int a=0;
		int b=1;
		int c;
		
		for(; a>0;) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static void frequency() {
		
		System.out.println();
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		
		String[] b=a.split("");
		List<String> lst=new LinkedList<String>(Arrays.asList(b));
		
		Set<String> set=new LinkedHashSet<String>(lst);
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext()) {
			String d=itr.next();
			System.out.println(d+"        "+Collections.frequency(lst, d));
		
		}
	
	}
	
	public static void palidrom_number_and_string() {
		System.out.println("please enter one number");
		
		int remainder=0;
		int rev=0;
		Scanner scr=new Scanner(System.in);
		int a=scr.nextInt();
		int b=a;
		while(a>0) {
			remainder=a%10;
			rev=rev*10+remainder;
			a=a/10;
		}
		
		if (rev==b) {
			System.out.println("palidrom number");
		}
		else {
			System.out.println("mot palindrom");
		}
	}
	
	
	
	
	
}
	

	
	
		
		
		
