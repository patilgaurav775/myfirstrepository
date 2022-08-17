package EXCEPTION;
import java.util.Scanner;

class gauravexception extends RuntimeException{
	public gauravexception(String msg) {
		super(msg);
	}
}

public class island_of_isolation {

	public static void main(String[] args)    {
		voting();
	}
	
	public static void voting() {
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter your age below");
		age=obj.nextInt();
		try {
			if (age<18) {
				throw new gauravexception("you are not eligible for the voting");
			} 
			else {
				System.out.println("you are eligiible");
			}
		} catch (gauravexception e) {
			
		
		e.printStackTrace();
		}
			
		
	System.out.println("programme is written successfully");
	}
}
