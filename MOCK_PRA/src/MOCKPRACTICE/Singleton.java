package MOCKPRACTICE;

public class Singleton {
	public static single name;
	public static single name1;
	public static void main(String[] args) {
		name = single.method_single();
		name1 =single.method_single();
		
		//single name2 =single.method_single();
		System.out.println("name " + name.toString());
		System.out.println("name1 "+name1.toString());
	}	
}

class single{
	
	private single() {
		System.out.println("hello brother");
		 
	}
	
	 static single name4 = new single();
	public static single method_single() {
		return name4;
	}
}
