package STRING;

import java.util.Scanner;

public class SCANNERCLASS {
int a;
int number;
String gaurav;
static boolean nature;
	public static void main(String[] args) {
		 System.out.println();         //system is class and out is static variable
		 Scanner obj=new Scanner(System.in);
		 SCANNERCLASS name = new SCANNERCLASS();
	
	 System.out.println("enter your string value with nextline");
	 String naav=obj.nextLine();
	 System.out.println("your name is "+naav);
	 
	 
		 System.out.println("enter year weather it is leap or not");
		 int patil=obj.nextInt();
		 if (patil%4==0 && (patil%400==0 || patil%100!=0)) {
			 System.out.println(patil+" is a leap year");
		 }
		 else {
			System.out.println(patil+"  is not a leap year");
		}
		 
		 System.out.println("enter year weather it is leap or not");
		 int gaurav=obj.nextInt();
		 if(gaurav%4==0 && (gaurav%400==0 || gaurav%100 != 0)) {
			 System.out.println(gaurav+"is a leap year");
		 }
		 else {
			System.out.println(gaurav+"is not a leap year");
		}
		 
		
		System.out.println("enter number whose table you want");
		 int i=obj.nextInt();
				 for(i=15;i<=150;i+=15) {
					 System.out.print(/*"table of 15 is"*/+i+"  ");
				 }
		 
		 
		 System.out.println("plese enter your number to find out weather it is even or odd");
		 name.number=obj.nextInt();
		 if(name.number%2==0) {
			 System.out.println("number you have entered is even");
		 }
		 else {
			 System.out.println("number you have entered is odd");
		}
		
		 System.out.println("please enter value of your boolean");
		 nature=obj.nextBoolean();
		 System.out.println("your value of boolean is"+nature);
	}
	
}


