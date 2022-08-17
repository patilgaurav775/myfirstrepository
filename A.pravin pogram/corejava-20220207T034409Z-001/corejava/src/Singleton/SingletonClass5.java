package Singleton;

class Srtingarrays {
	String s;
	int[] age = {10,20,30,40,50};
	
	private Srtingarrays() {
		s = "I am String s ";
		}
	
	static Srtingarrays sa = new Srtingarrays();
	
	static Srtingarrays string() {
		System.out.println(sa.s.toUpperCase());
		return sa;
	}
	static Srtingarrays arrays() {
		for(int a : sa.age)
			System.out.print(a + " ");
		return sa;
	}
}
public class SingletonClass5 {

	public static void main(String[] args) {
	
		Srtingarrays z = Srtingarrays.string();
		System.out.println("----------------");
		System.out.println(z.s);
		System.out.println("----------------");
		z.s = z.s.toLowerCase();
		System.out.println(z.s);
		System.out.println("----------------");
		z.s = z.s.repeat(5);
		System.out.println(z.s+ " ");
		System.out.println("----------------");
		z.arrays();

	}

}
