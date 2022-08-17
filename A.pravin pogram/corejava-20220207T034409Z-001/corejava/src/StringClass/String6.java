package StringClass;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// difference between String & StringBuffer & StringBuilder
		
		String aa = new String("I am from "); 
		aa.concat("Pune");
		System.out.println(aa);

		
		StringBuffer bb = new StringBuffer("I am an ");
		bb.append("Engineer");
		System.out.println(bb);
		
		
		StringBuilder cc = new StringBuilder("I am a ");
		cc.append("Tester");
		System.out.println(cc);
	}

}
