package SUHAS;

import java.util.Arrays;

import MOCKPRACTICE.arrayaccending;

public class suhasassignment {
	public static void swapwiththird() {
		// Write a Java Program to swap two numbers using the third variable.
		
		int a=12;
		int b=24;
		int c;
		
		System.out.println("before swap a"+"="+a);
		System.out.println("before swap b"+"="+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("after swap a"+"="+a);
		System.out.println("after swap b"+"="+b);
	}
	
	public static void swapwithoutthird() {
		//Write a Java Program to swap two numbers without using the third variable.
		int a=12;
		int b=24;
		System.out.println("before swap a"+"="+a);
		System.out.println("before swap b"+"="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap a"+"="+a);
		System.out.println("after swap b"+"="+b);
	}
	
	public static void primenumber(int number) {
	//Write a Java Program to find whether a number is prime or not.
		boolean pass=false;
		int total;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				pass=true;
				break;
			}
			
		}
		
		if (!pass) {
		
			System.out.println(number+"is a prime number");
		} else {
			System.out.println(number+"is not a prime number");
		}
		
	}
	
	public static void palindromenum() {
		//Write a Java Program to find whether a  number is palindrome or not.
		
		int num=1232;
		int c=num;
		int remainder;
		int reverse=0;
		
		for(;num>0;) {
			
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
			
		}
		if (c==reverse) {
			System.out.println(c+"is a palindrome number");
		} else {
			System.out.println(c+"is not a palindrome number");

		}
	}
	public static void palindromestring() {
		//Write a Java Program to find whether a  string is palindrome or not.
		
		String gaurav="boob";
		String reverse="";
		
		for(int i=gaurav.length()-1;i>=0;i--) {
			reverse=reverse+gaurav.charAt(i);
		}
		
		if (reverse==gaurav) {
			System.out.println(gaurav+" is a palindrome string");
		} 
		else {
			System.out.println(gaurav+" is not a palindrome string");
		}
	}
	
	public static void Fibonacci() {
		//Write a Java Program for the Fibonacci series.
		
		int a=0;
		int b=1;
		int c;
		
		for(;a>=0;) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		
		}
	
	}
	

	public static void secondhighest() {
		int[] gaurav= {1,2,3,4,5,65,89,77,898};
		int patil;
		System.out.println("DECENDING ORDER IS");
		for(int i=0;i<gaurav.length;i++) {
			for(int j=i;j<gaurav.length;j++) {
				
				if(gaurav[i]<gaurav[j]) {
					patil=gaurav[i];
					gaurav[i]=gaurav[j];
					gaurav[j]=patil;
							
				}
			}
			System.out.print(gaurav[i]+" ");
		}
		System.out.println();
		System.out.print("second highest number is"+gaurav[1]);
		
	}
	
	public static void removespace(String sentence) {
		
		System.out.println(sentence.replace(" ", ""));
	}
	
	
	public static void uniquechar(String str) {
		 
	     for (int i = 0; i < str.length(); i++) {
	         boolean flag = false;
	         for (int j = 0; j < str.length(); j++) {
	             // checking if two characters are equal
	             if (str.charAt(i) == str.charAt(j) && i != j)   {  
	           
	                 flag = true;
	                 break;
	             }
	         }
	         if (!flag) {
	             System.out.print(str.charAt(i));
	         }
	     }
	}
	
	public static void duplicatechar() {
	
				String s="pushpa pushparaj";
				  int count;
				  
				  char String []= s.toCharArray();// this is use for string convert to char
				                                                     // like m y n a m e 
				
				  System.out.print(" Duplicate character in a string:");
				  
				  for( int i =0; i<String.length; i++) {
				   count=1;
				   for(int j=i+1; j<String.length; j++) {
				    if(String[i]==String[j] && String [i]!=' '){
				      count++;
				      String[j]='0';// 0 replace cuplicate character like my na0e
				    }                //boz netx time this m is not count
				   }
				   if (count>1 && String[i]!='0') {
				    System.out.print(String[i]);
				   }
				  }
				 }
	
public static void sumoftwoarray() {
		
		int[] array={5,6,7,8,9,10};
		int[] array1={5,6,7,8,9,10};
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		for(int i=0;i<array1.length;i++) {
			sum=sum+array[i];
		}
		
		System.out.println("SUM OF TWO ARRAYS IS"+sum);
		
	}

public static void avrageoftwoarray() {
	
	int[] array={5,6,7,8,9,10};
	int[] array1={5,6,7,8,9,10};
	int sum=0;
	
	
	
	for(int i=0;i<array.length;i++) {
		sum=sum+array[i];
	}
	for(int i=0;i<array1.length;i++) {
		sum=sum+array[i];
	}
	int average=sum/array.length;
		System.out.println("average is"+average);
	
}

	
	public static void main(String[] args) {
		
		//swapwiththird();
		//swapwithoutthird();
		//primenumber(23);
		//palindromenum();
		//palindromestring();
		//Fibonacci();
		//secondhighest();
		//removespace("i am a good boy");
		//uniquechar("you are a such a fellow");
		//duplicatechar();
		//sumoftwoarray();
		//avrageoftwoarray();
		
	
	}
}


