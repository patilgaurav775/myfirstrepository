package MOCKPRACTICE;


import java.util.Arrays;

import org.openqa.selenium.WebDriver;

public class v {
	public static WebDriver driver;
	public static void main(String[] args) {
	
	String a="i am a local boy also i am gaurav patil";
	String[] b=a.split(" ");
	boolean flag=false;
	Arrays.sort(b);
	for(int i=0;i<b.length;i++) {
		if (!b[i].equalsIgnoreCase("local")) {
			System.out.println(b[i]);
		}
	}
		 odd_even_count(2, 10);
		 prime_number_finder_reverse(20,10);
		 prime_number_finder(10,20); 
		 factorial(10);
	}
	
	public static void odd_even_count(int L, int R) {
		System.out.println();
		int even=(R-L)/2;
		if (R%2==0 || L%2==0) {
			even++;
			}
		int odd=(R-L+1)-even;
		System.out.println("even "+even);
		System.out.println("odd "+odd);
		
	}
	
	public static void prime_number_finder_reverse(int to ,int from) {
		for(int i=to;i>=from;i--) {
			boolean flag=false;
				for(int j=2;i>j;j++) {
					if (i%j==0) {
						flag=true;
						break;
				}
		}
				if (!flag) {
					System.out.print(i+" ");
				}
	}
		System.out.println();
	}
	
		public static void prime_number_finder(int from ,int to) {
			for(int i=from;i<=to;i++) {
				boolean flag=false;
					for(int j=2;i>j;j++) {
						if (i%j==0) {
							flag=true;
							break;
			}
		  }
					if(!flag) {
						System.out.print(i+" ");
	   }
	 }
			System.out.println();
   }
		
		public static void factorial(int num) {
			int product=1;
			for(int i=0;i<num;i++) {
				product=product*(i+1);
			}
			System.out.println(product);
		}
 }
