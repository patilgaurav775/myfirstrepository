package LOOP_CONDIETION;

public class constructor_practice {
	public int a=45;
	public int b=100;
	public final int c;
	public static int d;
	
	constructor_practice (){
		this(5);
		int c=9999;
		System.out.println("i am no parameter constructor");
		
		System.out.println(c);
}

	constructor_practice(int a){
		this(15,15);
		System.out.println("i am single parameter constructor");
		System.out.println(this.a*100+"is the multiplication");
	}
	
	constructor_practice(int a,int b){
		System.out.println("i am double parameter constructor");
		System.out.println("multipliction of double parameter constructor is"+(a*b));
		c=465;
		System.out.println(d+"is the value of static d");
	}
	
	static {
		constructor_practice1.d=1000;
	}

	public static void main(String[] args) {
		constructor_practice obj1 = new constructor_practice();

	}

}
