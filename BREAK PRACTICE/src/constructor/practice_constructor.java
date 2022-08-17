package constructor;
public class practice_constructor {
	int a;
	int b;
	boolean c;
	public static final int d;
	static{
		d=20;
		
	
	}
	
		public practice_constructor() {
		this(25);
		System.out.println("i am a no parameter constructor");
		a=100;
		b=200;
		c=true;
		System.out.println("this id     "+this);
	}
	
	public practice_constructor(int b) {
		System.out.println("i am single parameter constructor");
	
		System.out.println((a+5)+"is the "
				+ "on");
		a=25;
		System.out.println("value a is " +a);
	}
	
	public static void main(String[] args) {
		practice_constructor obj = new practice_constructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println("obj id"+obj);
	
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		practice_constructor name = new practice_constructor(10);
		System.out.println(name.a);
		System.out.println(name.b);
		System.out.println(name.c);
		System.out.println("obj id"+name);
		
	
		
}
}
