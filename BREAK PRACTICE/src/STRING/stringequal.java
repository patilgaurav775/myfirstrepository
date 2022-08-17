package STRING;

public class stringequal {
	public static String var="A";
	public static String var1="A";
	public static void main(String[] args) {
		
		String var2=new String("A");
		String var3=new String("a");
		System.out.println(var==var1);    //TRUE//== ha object la baghun boolean return type deto var=heap  ,,,var1==heap
		System.out.println(var==var2);		 //FALSE//== ha object la baghun boolean return type deto var=heap  ,,,var2==SCP

		System.out.println(var.equals(var1));  //TRUE //equal to string la baghto ani boolean return type deto ,,,,,var==A
		System.out.println(var.equals(var2));  //TRUE //equal to string la baghto ani boolean return type deto ,,,,,var==A
		
		System.out.println(var.compareTo(var1));  //0  //compare to ha same work karto equal to sarkha pn return int yeto
		System.out.println(var.compareTo(var2));  //0  //compare to ha same work karto equal to sarkha pn return int yeto
		System.out.println(var.compareTo(var3));  //-32 // ASCII VALUE OF A=65			65-97=32
																						 // ASCII VALUE OF a=97
	
	
	}
	

}
