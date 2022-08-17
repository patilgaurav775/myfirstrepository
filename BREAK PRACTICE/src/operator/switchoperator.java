
package operator;

public class switchoperator {

	public static void main(String[] args) {
		int var=3;       
		switch(var) {     //SWITCH LA INT VALUE LAGTE SWITCH MADHE FACT EITHER CONSTANT OR LITERAL
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
		break;
		default:
			System.out.println("please give valid input");
		}
		
		 
		int var1=3;
		switch (var1) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wenesday");
			break;

		default:
			System.out.println("pls enter valid input");
			break;
		}
		int var2=3;
		switch (var2) {
		case 1:
			System.out.println("gaurav");
			break;
		case 2:
			System.out.println("sanjay");
			break;
		case 3:
			System.out.println("patil");
			break;

		default:
			System.out.println("GAURAV SANJAY PATIL");
			break;
		}
		int XYZ=2;
		switch (XYZ) {
		case 1:
			System.out.println("number is odd");
			break;
		case 2:
			System.out.println("number is even");
			break;
		case 3:
			System.out.println("number is odd");
			break;
		case 4:
			System.out.println("number is even");
			break;
		default:
			System.out.println("please inter valid input");
			break;
		}
		
		int abc=14;
		switch (abc%2) {
		case 0: 
			System.out.println("num is even");
			break;
	
		default:
			System.out.println("num is odd");
			
		}
	
	}
}
