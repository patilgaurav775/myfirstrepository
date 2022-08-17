package operator;

public class relational {

	public static void main(String[] args) {
		relational obj=new relational();
		obj.greaterthan(55, 10);
		obj.lessthan(95, 65);
		obj.equalto(5, 5);
		obj.notequalto(55, 55);
		obj.greaterthanequalto(55, 54);
		obj.lessthanequalto(45, 65);
		
	}
	public void greaterthan(int a,int b) {
		System.out.println("a is greater than b? "+ (a>b));
	}
	public void lessthan(int a,int b) {
		System.out.println("a is less than b? "+(a<b));
	}
	public void equalto(int a,int b) {
		System.out.println("a is equal than b? "+(a==b));
	}
	public static void notequalto(int a,int b) {
		System.out.println("a is not equal than b? "+(a!=b));
	}
	public void greaterthanequalto(int a,int b) {
		System.out.println("a is greaterthan equal to than b? "+(a>=b));
	}
	public void lessthanequalto(int a,int b) {
		System.out.println("a is less than equal to than b? "+(a<=b));
	}
}


