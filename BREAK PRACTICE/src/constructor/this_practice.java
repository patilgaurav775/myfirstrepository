package constructor;

public class this_practice {
	int a=10;
	int b=20;
	
	
	
	
public this_practice() {
	this(10);
	System.out.println("i am from default constructor");
	this.a=50;
	System.out.println(this.a);
	
}

public this_practice(int b) {
	System.out.println("i am from parameterized constructor");
	System.out.println(a+this.b);
}


	public static void main(String[] args) {
		
this_practice name = new this_practice();

	}

}
