package method_overiding;

class parentclass{
	
	public void m1() {
		System.out.println("i am from parent class");
	}
	public static void main(String[] args) {
		parentclass name = new parentclass();
		childclass name1 = new childclass();
		parentclass name2=new childclass();        //reference of obj is parentclass and pointing towards childclass then child class is printed that is run time execution call as method hiding
		name.m1();
		name1.m1();
		name2.m1();
	}
}

class childclass extends parentclass{
	public void m1() {
		System.out.println("i am from child class");
	}
}