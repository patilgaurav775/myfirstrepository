 package constructor;

public class final_keyword {
	public static final float pi=3.14f;           ////ithe final ha non acces modifier lavla aahe
	public final int gp;
	public static int sp;		////ithe static aaahe to ithech inilize hoil kiwa static block madhe 11 no la bagha
	public final_keyword() {
		gp=45;			///fact constructor madhe final initilize hot ani jithe declare kel tithe pn karu shakto
	}
	
	static {
		final_keyword.sp=455;      ////ithe pn karu shakto static inilize static block madhe 
	System.out.println("ia am block");
	}
	static {
		System.out.println("i am block2 "+sp);
	}
	public static void main(String[] args) {
		final_keyword obj= new final_keyword();
		
		System.out.println(final_keyword.pi);
	}

}
