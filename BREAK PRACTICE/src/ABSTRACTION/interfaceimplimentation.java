package ABSTRACTION;
//we can make multiple inheritance such that firstinterface and secondinterface
public class interfaceimplimentation implements firstinterface,secondinterface {   //implements lihava loagto
																												//compiler will throw error to implement abstract method
	public static void main(String[] args) {
		interfaceimplimentation abc = new interfaceimplimentation();
		abc.add();
		abc.substract(5);
		System.out.println(a);
	}

	
	public void add() {
		System.out.println("i am method of interface");
		
	}

	
	public int substract(int a ) {
		System.out.println("i am method of interface");
		return 5;
	}


		
	}


