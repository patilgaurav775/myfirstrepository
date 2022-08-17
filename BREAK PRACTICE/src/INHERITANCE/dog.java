package INHERITANCE;

import ABSTRACTION.anotherinterfacewithdefault;
import ABSTRACTION.firstinterface;

public class dog extends animal {    //animal cha constructor pn print hoto animal=parent class and dog=child class
	
	public int b;
	dog(){
		this(55,45);
		int g=20;
		super.a=g;                            // super is use to diierentiate parent and child class same name variable
		System.out.println("i am from dog constructor");
	}
	dog(int b,int c){
		super();   //first statement lach lihu shakto super this sarakh super is use to call constructor of another class
		this.b=10;
		System.out.println("hello");    
	}
	public static void main(String[] args) {
		dog obj = new dog();
		obj.a=45;
		System.out.println(obj.a);

	}


}
