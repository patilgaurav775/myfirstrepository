package EXCEPTION;

public class EXCEPTION {
	

	public static void name() {  //CALLER METHOD
		name1();
		System.out.println("i am from m2");
	}
	
	public static void name1()  {
		System.out.println("i am from m1");
		//System.out.println(10/0);    //UNCHECK  EXCEPTION----->unwanted event which terminate normal flow of execution 
		try {
			System.out.println("hello hello hello");
			System.out.println(10/0);
			System.out.println("hello hello hello");					//he pn print honar nahi because ha exception natr aahe
			System.out.println("this is within try after exception");     //he print nahi honar 
		} 
		catch (ArithmeticException A) {
			
			//A.printStackTrace();   //METHOD AAHE FACT CATCH MADHE LIHITA YETE EXCEPTION DETAILS SATHI LIHITO HI METHOD name of exception : discription:location of exception
			
			//System.out.println(A.toString());           //name of exception : discription
			
			//System.out.println(A.getMessage());		//discription
		
			System.out.println("WE CANT CREATE OPERATION");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("i am from main");
name();
	}

}
