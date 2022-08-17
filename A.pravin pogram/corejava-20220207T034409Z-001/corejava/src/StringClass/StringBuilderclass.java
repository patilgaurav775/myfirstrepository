package StringClass;

public class StringBuilderclass {
public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		
		StringBuilder sb1=new StringBuilder("Hello Java");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Hello Java");
		System.out.println(sb2);
		
		System.out.println(sb1.equals(sb2));//address basis comparison
		System.out.println(sb1==sb2);//address basis comparison
		//We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
		//first convert StringBuffer/StringBuilder to String class using toString()
		// dn use equals() of string class
		System.out.println((sb1.toString().equals(sb2.toString())));
		
		if(sb.compareTo(sb2)==0) {
			System.out.println("sb & sb2 are equals");
		}else
			System.out.println("sb & sb2 are not equals");	
		
		if(sb1.compareTo(sb2)==0) {
			System.out.println("sb2 & sb1 are equals");
		}else
			System.out.println("sb2 & sb1 are not equals");	
	}
}

