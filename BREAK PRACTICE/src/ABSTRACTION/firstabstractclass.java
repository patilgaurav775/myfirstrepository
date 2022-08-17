package ABSTRACTION;

public abstract  class firstabstractclass {   //when you add abstract as non acces modifier it becomes abstract class
	
	public int a=20;
	public static int b=22;
	
	public firstabstractclass() {          //constructor
		System.out.println("parent hello");
	}
	
	public abstract void m2() ;  //method having only declaration or not implimented then it is mandetory to make method as abstract
														//if we dont want to right method body then it is abstract method
														//abstract methods we can write in abstract class only
														//normal method we can write in abstract class also.
	public abstract void m3() ;
	public static void m1() {
		System.out.println("THIS IS NORMAL METHGOD M1");
	}
	
	// private abstract void m4();              //private abstract madhe lihita yet nahi
	public static void main(String[] args) {
		//firstabstractclass name = new firstabstractclass();   //you can not create object of abstract class
		m1();
	}
}