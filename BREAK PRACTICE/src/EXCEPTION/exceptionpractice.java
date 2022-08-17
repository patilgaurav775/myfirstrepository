package EXCEPTION;

public class exceptionpractice {
	public static exceptionpractice name;
	public static int a[]=new int[5] ;
public void m1() {
	m2();
}
public void m2() {
	
	try {
		System.out.println(a[10]);  //sequence ne hoto null point karel ha  13 no ch exception honar nahi 
		System.out.println(10/0);
		
	}
	catch (NullPointerException e) {
		System.out.println("nullpointer");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("outofboundryindex");
	}
	catch (ArithmeticException k) {
		System.out.println("this operation is not permissible");
	}
	catch (Exception k) {				//exception lihu shakto 
		System.out.println("this");
	}
	
	finally {
		
		System.out.println("i am from finally");
		
	}
	
	
	System.out.println("hello hello");
}
@Override
protected void finalize() throws Throwable {
	System.out.println("i am from finalize");
}


	public static void main(String[] args) {
		exceptionpractice name = new exceptionpractice();
		name.m1();
		name.m2();
		name=null;
		System.gc();
	}

}
