package ENCAPSULATION;

public class newclass {

	public static void main(String[] args) {
		datahiding obj=new datahiding();
		
		int a=obj.getbalance(123);
		System.out.println("balance is"+a);
		obj.setbalance(10000);
		
		int b=obj.getbalance(123);
		System.out.println("balance is updated is"+b);
		
		int c=obj.getwithdrawl();
		System.out.println("withdrawl is"+c);	
		
	}

}
