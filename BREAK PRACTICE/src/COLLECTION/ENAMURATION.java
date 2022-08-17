package COLLECTION;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class ENAMURATION {

	public static void main(String[] args) {
		
		
		Stack<Object> obj=new Stack<Object>();
			obj.add("first object");
			obj.add(1, "second");
			obj.addElement("third object");
			
			Enumeration<Object> o=obj.elements();         //Enumeration ha interface aahe  element method vector chi ahe tyacha return type Enumeration aahe.
			while(o.hasMoreElements()) {
				System.out.println(o.nextElement());
			}
System.out.println("................................................................................");
				Iterator<Object>  abc=obj.iterator();				//
				while(abc.hasNext()) {
					System.out.println(abc.next());
					abc.remove();                                      //remove method aste extra as compare to Enumeration
				}
				System.out.println("..........................................................................");
				System.out.println(obj);
	}

}
