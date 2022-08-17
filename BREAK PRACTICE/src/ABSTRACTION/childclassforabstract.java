package ABSTRACTION;

public  class childclassforabstract extends firstabstractclass{
public childclassforabstract(){
	System.out.println("hello");       //yamadhe parent class cha adhi constructor run zala
}
	
	public void m2() {                     //ji unimplimented method hoti ti add keli only diclare wali
		System.out.println("M2 METHOD I AM");
		
	}

	
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("M3 METHOD I AM");
	}
	public static void main(String[] args) {
		firstabstractclass  XYZ = new childclassforabstract();
		
		
	
		XYZ.m1();       //non abstract method
		XYZ.m2();       //abstract method
		XYZ.m3();       //abstract method
	}
}
