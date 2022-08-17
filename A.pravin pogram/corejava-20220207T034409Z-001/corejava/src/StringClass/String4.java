package StringClass;

public class String4 {

	public static void main(String[] args) {

		String a = "WelcomeToPune";
		
		// sub string
		System.out.println(" string a is : " + a);
		System.out.println("substring of string a is: " + a.substring(3));
		System.out.println("substring of string a is: " + a.substring(3,9));
		System.out.println("substring of string a is: " + a.subSequence(9, 12));

		//concatenate
		String b = " Null";
		String c = " Krishna";
		String d;
		System.out.println("concate of string b & c is: " +( d = b.concat(c)));
		
		//Index Of character
		String e = "Javastring";
		System.out.println("Index of a is: "+e.indexOf('a'));
		System.out.println("Index of t is: "+e.indexOf('t'));
		System.out.println("Index of a after 2nd posotion is: "+e.indexOf('a', 2));
		
		//last index of character
		String f = " learn & earn earn & learn ";
		System.out.println(f.lastIndexOf('e'));
		System.out.println(f.lastIndexOf("earn", 15));
		System.out.println(f.lastIndexOf('e',10));
		System.out.println(f.replace('e', 'E'));
		System.out.println(f.replace('l', 'L'));
		
		//Replace character or string 
		String g = "Software Testing";
		System.out.println(g.replace('w', 'v'));
		System.out.println(g.replace("Software", "Manual"));
		System.out.println(g.replace(g, d));
		
	}
}