package StringClass;

public class String2 {

	public static void main(String[] args) {

		String p = new String("manual");
		String q = "automation";//lower case
		String r = new String("MaNuAl");
		String s = "AUTOMATION"; //upper case
		String t = "automation";
		System.out.println(s);
		//or
		System.out.println("string s is: " + s.toString());
		// or
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println("\nchar at index 5 of s is :" + s.charAt(5));

		System.out.println("comparing same sequence of chars in s & q: " + s.contains(q));
		System.out.println("comparing same sequence of chars in q & t: " + q.contains(t));

		System.out.println("compare s & q based on value: " + s.equals(q));
		System.out.println("compare s & q based on address: " + (s == q));
		System.out.println("comapre non case sensitive s & q : " + s.equalsIgnoreCase(q));

		System.out.println("compare q & t based on value: " + q.equals(t));
		System.out.println("compare q & t based on address: " + (q == t));

		System.out.println("number of characters in s: " + s.length());

		System.out.println("convert upper to lower case of s: " + s.toLowerCase());
		System.out.println("convert lower to upper case of q: " + q.toUpperCase());
		
		System.out.println("comapre p & r : " + p.equals(r));
		System.out.println("compare p & r based on address: " + (p == r));
		System.out.println("comapre non case sensitive p & r : " + p.equalsIgnoreCase(r));

		if(s.compareTo(t)==0) {
			System.out.println("s & t are equal strings");
		}else
			System.out.println("s & t are not equal strings");
	}
}
