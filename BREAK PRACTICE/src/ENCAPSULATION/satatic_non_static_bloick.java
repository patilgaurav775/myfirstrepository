package ENCAPSULATION;

public class satatic_non_static_bloick {

	static {
		System.out.println("i am from static");
	}
	{
		System.out.println("i am from non_static");
	}
	public static void main(String[] args) {
		satatic_non_static_bloick name = new satatic_non_static_bloick();
		System.out.println("i am main");
	}
	

	{
	System.out.println("non static");
	}

}
