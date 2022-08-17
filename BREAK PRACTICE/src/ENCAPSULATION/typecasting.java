package ENCAPSULATION;


import constructor.final_keyword.*;


public class typecasting {

	public static void main(String[] args) {
		
		constructor.final_keyword obj=new constructor.final_keyword();
		
		
		byte a=45;
		
		int b= a;   //implicit casting /upcasting/broadcasting
		
		
		int c=260;
		
		byte d= (byte)c;		//explecit casting or manual casting or downcaasting./narrowcasting
		System.out.println(d);     //2^8=128  ==== 2^9=256-260=4 aal aahe print la
		
	}

}
