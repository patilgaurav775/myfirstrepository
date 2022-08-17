package COLLECTION;

import java.util.HashSet;
import java.util.Iterator;

public class SET {

	public static void main(String[] args) {
		HashSet<Object> o=new HashSet<Object>();
		o.add("string first");
		o.add("testing");
		o.add("checking");
		o.add("hello");
		o.add("hello");
		System.out.println(o);
	
		o.remove("testing");
		System.out.println(o);
		
		Iterator<Object> itr=o.iterator();
		while(itr.hasNext()) {
			String a=itr.next().toString();
			if (a.equalsIgnoreCase("hello")) {
				System.out.println(a+"   heeeeeellllloooo");
			}
		}
		
		HashSet<Object> abc=(HashSet<Object>) o.clone();  //clone method copy banvte same abc madhe copy zale objects o madhun
	//  	HashSet abc=(HashSet) o.clone();         as pn lihu shakto jar 8 no line la object asl tr
		System.out.println(abc);
	}

}
