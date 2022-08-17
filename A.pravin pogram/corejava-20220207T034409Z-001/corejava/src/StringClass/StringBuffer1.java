package StringClass;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer dd = new StringBuffer("I am manual tester ");
		System.out.println("Initial string dd : "+dd);
		System.out.println(dd.capacity());
		
		dd.append("automation tester");
		System.out.println("modified string dd : "+dd);
		System.out.println(dd.capacity());
		
		System.out.println("Index of automation string is: "+dd.indexOf("automation"));
		System.out.println("Index of tester string after 20th index is: "+dd.indexOf("tester",20));
		
		System.out.println("Character at index 21 is: "+dd.charAt(21));
		System.out.println(dd.insert(19, "and "));
		System.out.println(dd.capacity());
		
		System.out.println(dd.append("so we cannot use equals method directly"));
		System.out.println(dd.capacity());
		System.out.println(dd.append("equals method so we cannot use equals method directly"));
		System.out.println(dd.capacity());
		
		System.out.println(dd.isEmpty());
		System.out.println(dd.substring(19));
		System.out.println(dd.length());
		System.out.println(dd.deleteCharAt(2));
		System.out.println(dd.delete(40, 131));
		System.out.println(dd.replace(18, 21, "&"));
		System.out.println(dd.reverse());
	}
	

}
