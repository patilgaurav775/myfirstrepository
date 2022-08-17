package STRING;

public class stringdeclaration {
	static String name="i am gaurav";        //string ha class aahe mahnun highlight nahi zala
	int gp=45;												// 45 is a literal

	/*string variable initilization done in two ways
	 * 
	 * A. by using literals
	 * 		String var="abc";
	 * 
	 * B. by using object name or new keyword
	 * 		String var=new String("gaurav patil");               ........look in 20 line
	 */
	
	
	
	
	public static void main(String[] args) {
		String var=new String("gaurav  "+"sanjay");
		
		//System.out.println(var);
		String p=var.concat("  patil");          //...............yethe p karavach lagel because once you reate string you cant modify it
		System.out.println(p);
		//string is immutable once you create then you cant modify
		
		String naav=name.concat(" i am from pachora");
		System.out.println(naav);
		
		long a=900;
		byte b=(byte) a;
		System.out.println(b);
		
		
	}

}
