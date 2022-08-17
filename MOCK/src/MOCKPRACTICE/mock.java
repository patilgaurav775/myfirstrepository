package MOCKPRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class mock {
	public static WebDriver driver;

	public static void leapyear() {
		System.out.println("please insert year that you want to find weather it is leap or not");
		Scanner obj = new Scanner(System.in);
		int year = obj.nextInt();
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

	public static void primenumber() {
		System.out.println("please enter number to find weather it is prime or not");
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		boolean flag = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(number + " is not a prime number ");
		} else {
			System.out.println(number + " is a prime number ");
		}
	}

	public static void prime100() {
		int count = 0;
		int sum = 0;
		for (int i = 2; i <= 100; i++) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;

					break;

				}
			}
			if (!flag) {
				System.out.println(i + "prime number");
				count++;
				sum = sum + i;

			} 
		}
		System.out.println("Addition of all prime number from 1 to 100 is " + sum);
		System.out.println("count of numbers from 1 to 100 is " + count);
	}

	public static void primereverse100() {
		int count = 0;
		int sum = 0;
		for (int i = 100; i >= 2; i--) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(i + "prime number");
				count++;
				sum = sum + i;
			} else {
			}
		}
		System.out.println("Addition of all prime number from 1 to 100 is " + sum);
		System.out.println("count of numbers from 1 to 100 is " + count);
	}

	public static void febonacci() {
		int a = 0;
		int b = 1;
		int c;

		for (; a >= 0;) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;

		}
	}

	public static void swap() {
		int a = 12;
		int b = 24;
		int c;

		System.out.println("before swap a is " + a + " and b is " + b);

		/*
		 * a=a+b; 
		 * b=a-b; 
		 * a=a-b;
		 */

		c = a;
		a = b;
		b = c;

		System.out.println("before swap a is " + a + " and b is " + b);
	}

	public static void reversestring() {
		System.out.println("plese enter sentence to reverse");
		Scanner obj = new Scanner(System.in);
		String gaurav = obj.nextLine();
		String a[] = gaurav.split(" ");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

	public static void reversenumber() {
		System.out.println("please enter number you want to reverse");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int reverse = 0;
		int remainder;
		for (; a > 0;) {
			remainder = a % 10;
			reverse = reverse * 10 + remainder;
			a = a / 10;

		}
		System.out.println(reverse);
	}

	public static void ascendingarraysort() {
		int gaurav[] = { 12, 32, 45, 6, 5, 8, 4, 9, 87, 5, 4 };
		Arrays.sort(gaurav);
		for (int i = 0; i < gaurav.length; i++) {
			System.out.print(gaurav[i] + " ");
		}
		System.out.println();
		System.out.println("second highest number is" + gaurav[gaurav.length - 2]);
	}

	public static void ascendingarray() {
		int gaurav[] = { 12, 32, 45, 6, 5, 8, 4, 9, 87, 5, 4 };
		int patil;

		for (int i = 0; i < gaurav.length; i++) {
			for (int j = i; j < gaurav.length; j++) {

				if (gaurav[i] > gaurav[j]) {
					patil = gaurav[i];
					gaurav[i] = gaurav[j];
					gaurav[j] = patil;
				}
			}
			System.out.println(gaurav[i]);
		}

	}

	public static void decendingarray() {
		int gaurav[] = { 12, 32, 45, 6, 5, 8, 4, 9, 87, 5, 4 };
		int patil;
		for (int i = 0; i < gaurav.length; i++) {
			for (int j = i; j < gaurav.length; j++) {

				if (gaurav[i] < gaurav[j]) {
					patil = gaurav[i];
					gaurav[i] = gaurav[j];
					gaurav[j] = patil;
				}
			}
			System.out.print(gaurav[i] + " ");

		}
		System.out.println();
		System.out.println("second lowest number is " + gaurav[gaurav.length - 2]);
	}

	public static void decendingarraysort() {
		int gaurav[] = { 12, 32, 45, 6, 5, 8, 4, 9, 87, 5, 4 };
		Arrays.sort(gaurav);
		for (int i = gaurav.length - 1; i >= 0; i--) {
			System.out.print(gaurav[i] + " ");
		}
		System.out.println();
		System.out.println("second highest number is" + gaurav[1]);
	}

	public static void palindromstring() {

		System.out.println("please enter string");
		Scanner obj = new Scanner(System.in);
		String gaurav = obj.nextLine();
		String reverse = "";
		for (int i = gaurav.length() - 1; i >= 0; i--) {
			reverse = reverse + gaurav.charAt(i);
		}
		if (reverse.equalsIgnoreCase(gaurav)) {
			System.out.println("string is palindrom");
		} else {
			System.out.println("string is not palindrom");
		}
	}

	public static void palindromnumber() {
		System.out.println("please enter number");
		Scanner obj = new Scanner(System.in);
		int gaurav = obj.nextInt();
		int patil = gaurav;
		int reverse = 0;
		int remainder;
		for (; gaurav > 0;) {
			remainder = gaurav % 10;
			reverse = reverse * 10 + remainder;
			gaurav = gaurav / 10;
		}
		if (patil == reverse) {
			System.out.println("number is palindrom");
		} else {
			System.out.println("number is not palindrom");
		}
	}

	public static void removewhitespaces() {
		String gaurav = "i am shivaji the boss";
		System.out.println(gaurav.replaceAll(" ", ""));

	}

	public static void uniquechar() {
		System.out.println("please enter string");
		Scanner obj = new Scanner(System.in);
		String gaurav = obj.nextLine();
		char[] a = gaurav.toCharArray();
		for (int i = 0; i < gaurav.length(); i++) {
			boolean flag = false;
			for (int j = i; j < gaurav.length(); j++) {
				if (a[i] == a[j] & i != j) {
					flag = true;
					a[j] = '0';

				}
			}
			if (flag && a[i] != '0') {
				System.out.print(gaurav.charAt(i) + " ");
			}
		}
	}

	public static void uniquenum() {

		int[] gaurav = { 12, 65, 78, 99, 88, 99, 88, 99, 77, 8 };
		for (int i = 0; i < gaurav.length; i++) {
			boolean flag = false;
			for (int j = i ; j < gaurav.length; j++) {
				if (gaurav[i] == gaurav[j] & i != j) {
					flag = true;
					gaurav[j] = 0;

				}
			}
			if (!flag && gaurav[i] != 0) {
				System.out.print(gaurav[i] + " ");
			}
		}
	}

	public static void sumarray() {
		int a[] = { 12, 65, 98, 5, 46, 56, 2, 5, 566 };
		int b[] = { 12, 65, 98, 5, 46, 56, 2, 5, 566 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		for (int j = 0; j < b.length; j++) {
			sum = sum + a[j];
		}
		System.out.println("sum of two arrays are" + sum);
		System.out.println("avg of two array is" + sum / (a.length + b.length));

	}

	public static void mergedarray() {
		int a[] = { 12, 65, 98, 5, 46, 56, 2, 5, 566 };
		int b[] = { 12, 65, 98, 5, 46, 56, 2, 5, 566 };
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		Arrays.sort(c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		System.out.println("second highest number is " + c[c.length - 2]);
	}

	public static void copyarray() {
		int a[] = { 12, 65, 98, 5, 46, 56, 2, 5, 566 };
		int b[] = Arrays.copyOf(a, 5);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static void comparearray() {
		int a[] = { 12, 65, 98, 5, 46, 56, 2, 5, 566 };
		int b[] = { 12, 65, 98, 5, 46, 56, 2, 5 };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println("arrays are same" + b[j]);
				}
			}
		}
	}

	static public void duplicate_array() {
		int[] a = { 1, 2, 3, 4, 5, 6, 10 };
		int[] b = { 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = true;
				}
			}
			if (flag) {
				System.out.println(a[i]);
			}
		}

	}

	static public void unique_array() {
		int[] a = { 1, 2, 3, 4, 5, 6, 10 };
		int[] b = { 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println(a[i]);
				
			}

		}

	}

	public static void String_count(String sentence) {

		/*
		String[] a=sentence.split(" "); 
		 System.out.println(a.length);
		 */

		int count = 1;
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);

	}

	static public void distinct_using_collection_hashset(int arr[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
				
		}
		System.out.println(set);

	}

	static public void distinct_using_collection_hashmap(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], null);

		}
		System.out.println(map.entrySet());
	}

	static public void febonacci_limited_print() {
		int a = 0;
		int b = 1;
		int c;

		for (; a <= 10;) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}

	static public void febonacci_limited_print_with_i() {
		int a = 0;
		int b = 1;
		int c;

		for (int i = 1; i <= 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}
	}
	
	static public void frequency_hardcode(String a) {
		
		
		int total_length=a.length();
		
		int length=a.replace("a", "").length();
		
		int frequency=total_length-length;
		
		System.out.println("frequency of a is : "+ frequency);
	
	}
	
	static public void frequency_using_collection(String a) {
		
		String[] b=a.split("");
		
		List<String> list=new ArrayList<String>(Arrays.asList(b));
		Set<String> set=new HashSet<String>(list);
		Iterator<String> itr=set.iterator();
		for(int i=0;set.size()>i;i++) {
			String name=itr.next();
			
			System.out.println(name+"    -    "+Collections.frequency(list, name));
			
		}
		
		
	}
	
	static public void frequency_using_collection_with_word(String a) {
		
		String[] b=a.split(" ");
		
		List<String> list=new ArrayList<String>(Arrays.asList(b));
		
		
		Set<String> set=new HashSet<String>(list); 
		
		Iterator<String> itr=set.iterator();
			
		for(int i=0;i<set.size();i++) {
			String name=itr.next().toString();
			System.out.println(name+"    -     "+Collections.frequency(list, name));
		}
		
	}

	public static void swapping_string() {
	
		String a="gaurav";
		String b="pati";
		
		System.out.println("Before swap = "+a+"   "+b);
		
		a=a+b;                         								   //6+5=11
		b=a.substring(0, (a.length()-b.length()));    //11-5=6
		a=a.substring(b.length());
		
		System.out.println("after swap = "+a+"   "+b);
		
	}
	
	public static void highest_array() {
		
		int[] array= {10,20,30,40,50,60,70,80,90,100};
		int highest=Integer.MIN_VALUE;
		
		for(int i=0;i<array.length;i++) {
			if (array[i]>highest) {
				highest=array[i];
			}
		}
		System.out.println("maximum value is"+highest);
		
		for(int element:array) {
			if (element>highest) {
				highest=element;
			}
		}
		System.out.println("maximum value is"+highest);
			
	}
	
	public static void lowest_array() {
		int[] array= {10,20,30,40,50,60,70,80,90,100};
		int lowest=Integer.MAX_VALUE;
		
		for(int element:array) {
			if (element<lowest) {
				lowest=element;
			}
		}
		System.out.println("minimum value is"+lowest);
		
		for(int i=0;i<array.length;i++) {
			if (array[i]<lowest) {
				lowest=array[i];
			}
		}
		System.out.println("minimum value is"+lowest);
	}
	
	public static void UPPER_LOWER() {
	String a="GauRav";
	String Lower="";
	String Upper="";
	for(int i=0;i<a.length();i++){
		for(char L='a';L<'z';L++) {
			if (a.charAt(i)==L) {
				Lower=Lower+a.charAt(i);
			}
		}
	}
	System.out.println(Lower);
	
	for(int i=0;i<a.length();i++){
		for(char U='A';U<'Z';U++) {
			if (a.charAt(i)==U) {
				Upper=Upper+a.charAt(i);
			}
		}
	}
	System.out.println(Upper);
	String a1=Lower+Upper;
	System.out.println(a1);
	}
	
	
	public static void remove_char_from_String() {
		System.out.println("please enter string");
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
	
	char[] b=a.toCharArray();
	
	
	for(int i=0;i<b.length;i++) {
		if (b[i]=='b') {
			for(int j=i;j<b.length-1;j++) {
			b[j]=b[j+1];
		}
		
	}
	
}
	for(int i=0;i<b.length-1;i++) {
		System.out.print(b[i]+" ");
	}
	}
	
	public static void alternate_array() {
		
		int[] a= {1,2,3};
		int[] b= {10,20,30};
		int c[]=new int[a.length+b.length];
		
		int i=0, j=0, k=0;
		
		while(i<a.length&&j<b.length) {
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		System.out.println(c.toString());
	}
	public static void main(String[] args) {
		 leapyear();
		// primenumber();
		// prime100();
		// primereverse100();
		 //febonacci();
		// swap();
		// reversestring();
		// reversenumber();
		//ascendingarraysort();
		//ascendingarray();
		// decendingarray();
		// decendingarraysort();
		// palindromstring();
		// palindromnumber();
		// removewhitespaces();
	    //	 uniquechar();
		// uniquenum();
		// sumarray();
		// mergedarray();
		// copyarray();
		// comparearray();
		// duplicate_array();
		 //unique_array();
		//String_count("i am an indian");
		
		// int[] a= {1,2,3,4,5,5,4,3,8,8,8,8,8}; 
		// distinct_using_collection_hashset(a);
		 
		 //int[] a= {1,2,3,4,5,5,4,3}; 
		  //distinct_using_collection_hashmap(a);
		 
		// febonacci_limited_print();
		// febonacci_limited_print_with_i();
		//frequency_hardcode("i am gaurav patil and i am from pachora");
		//frequency_using_collection("my name is gaurav");
		//frequency_using_collection_with_word("my name is gaurav my town name is pachora");
		 //swapping_string();
		//highest_array();
		//lowest_array();
		//UPPER_LOWER();
		//remove_char_from_String();
		//alternate_array();
		
	}
}
