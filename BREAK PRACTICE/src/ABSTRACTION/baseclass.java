package ABSTRACTION;

public class baseclass implements interfacewithdefaultmethod,anotherinterfacewithdefault{
public  final int aaa;

{
	aaa=10;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseclass name = new baseclass();
		
		name.defaultmerhod();
	}

	public void defaultmerhod() {
		anotherinterfacewithdefault.super.defaultmerhod();
	}



	

}




