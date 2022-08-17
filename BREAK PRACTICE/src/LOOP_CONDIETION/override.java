package LOOP_CONDIETION;
class ride{
	public static void m1(int a,int b) {
		System.out.println("multipliction of two number from parent class is is"+(a*b));
	}
}


public class override extends ride {
	public static void m1(int a,int b) {
		System.out.println("multipliction of two number from child class is is"+(a*b));
	}
	public static void main(String[] args) {
		ride name = new ride();
		name.m1(150, 150);
		override name2 = new override();
		name2.m1(150, 150);
		ride name3 = new override();     //static aslyamule method hiding zali
		name3.m1(150, 150);
	}

}
