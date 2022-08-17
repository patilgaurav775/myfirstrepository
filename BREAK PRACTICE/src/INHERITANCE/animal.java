package INHERITANCE;

public class animal {
	
	public int a;
	animal(){
	this.a=99;                  //this differenciate karto local ani instance 
	System.out.println("i am from animal constructor");
	System.out.println(("print a"));
	this.m1();
	
}


	public static void main(String[] args) {
		animal name = new animal();

	}
	public void m1() {
		System.out.println("jjjjjjjjjjj");
	}

}
