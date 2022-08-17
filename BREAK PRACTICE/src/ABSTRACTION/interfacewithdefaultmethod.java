package ABSTRACTION;

public interface interfacewithdefaultmethod {
		default void defaultmerhod() {      //after java 8 we can implement method
			System.out.println("vdvcrcbr");
		}
		
		public default void faultnethopd() {			//default lihun implement karu shakto
			System.out.println("ooooooooo");
		}
         public static void faultpd(int a) {			//static lihun implement karu shakto public FINAL static void faultpd(){}
			System.out.println("i am from faultpd");	//we can call static method of interface by only interface name.
		}																		//we can not override static method 
       

	
}
