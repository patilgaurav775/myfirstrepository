package COLLECTION;

import java.util.Iterator;
import java.util.Vector;

public class iteratorexample {

	public static void main(String[] args) {
		Vector<String> obj1=new Vector<String>();	
		obj1.add("patil");
		obj1.add("atil");
		obj1.add("til");
		obj1.add("il");
		obj1.add("l");
		
		System.out.println(obj1);
		
		//if i want access of specific object
		
		String var1=obj1.get(1);
		
		System.out.println(var1.toUpperCase());
		
		//when you have do some common operation aacross the collection
		
	Iterator iterator	=obj1.iterator();
		
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
		
	System.out.println("---------------------------------------------------");
		
	for(int i=0;i<obj1.size();i++) {
		System.out.println(obj1.get(i));
	}	
	}

}
