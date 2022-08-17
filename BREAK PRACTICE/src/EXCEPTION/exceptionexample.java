package EXCEPTION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionexample {
	public static void name() {  //CALLER METHOD
		name1();
		System.out.println("i am from name");
	}
	
	public static void name1() {
		exceptionexample name = new exceptionexample();
		
		System.out.println("i am from m1");
		//System.out.println(10/0);    //UNCHECK  EXCEPTION----->unwanted event which terminate normal flow of execution 
		try {
			System.out.println(10/0);
			System.out.println("this is within try after exception");     //he print nahi honar 
		} 
	
		catch (ArithmeticException A) {
			
			//A.printStackTrace();   //METHOD AAHE FACT CATCH MADHE LIHITA YETE EXCEPTION DETAILS SATHI LIHITO HI METHOD name of exception : discription:location of exception
			
			//System.out.println(A.toString());           //name of exception : discription
			
			//System.out.println(A.getMessage());		//discription
		
			System.out.println("WE CANT CREATE OPERATION");
		}
		finally {
			name=null;      //memory release keli obj ne ghetleli
			System.out.println("forfully run by finally block");              //finally block nehmi run honar exception aso ki naso
			System.out.println("forfully run by finally block");
		}
	}
	
	public static void login(String username,String password)  {
		
		try {
			if(password.isEmpty()) {
				throw new NullPointerException() ;
		
				
			}
			
		} catch (NullPointerException a) {
			System.out.println("password feild cant be empty");
		}
		catch(ArithmeticException b) {
			System.out.println("sorry");
		}
	}
	
	public static void method() throws FileNotFoundException{       //throws aapn initial la pn lihu shakto
		FileInputStream file=new FileInputStream(" ");
		
		
	}
	public static void main(String[] args) {
			exceptionexample name = new exceptionexample();
			System.out.println("i am from main");
			//name();
			login("gaurav@123", "");
			//FileReader test=new FileReader(null);
			
		
				try {
					System.out.println("i am from method try");
					method();
				} catch (FileNotFoundException e) {
					System.out.println("method exception handler");
				}
				
			

					
	}



}
