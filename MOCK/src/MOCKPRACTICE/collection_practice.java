package MOCKPRACTICE;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import javax.lang.model.element.Element;

public class collection_practice {
	
	public static final int a=10;
	
public static void main(String[] args) {
	                                                             
	
																				//METHODS OF COLLECTION INTERFACE
	
	
	ArrayList<Object> obj=new ArrayList<Object>();
	obj.add("one");
	obj.add("two");
	obj.add("three");
	obj.add("four");
	obj.add("five");
	obj.add("six");
	System.out.println(obj);
	
	ArrayList<Object> obj1=new ArrayList<Object>();
	obj1.add("one");
	obj1.add("two");
	obj1.add("three");
	obj1.add("four");
	obj1.add("five");
	obj1.add("obj1");
	System.out.println(obj1);
	
	obj.addAll(obj1);
	System.out.println(obj);
	
	System.out.println(obj.contains("six")+" contains");
	
	System.out.println(obj.containsAll(obj1)+" contains all");
	
	System.out.println(obj.size()+" size");
	
	obj.toArray();
	System.out.println(obj+" to array");
	
	obj.remove(5);
	System.out.println(obj+" remove");
	
	obj.retainAll(obj1);
	System.out.println(obj+" retain all");
	
	obj1.clear();
	System.out.println(obj1+" clear");
	
	System.out.println(obj1.isEmpty()+" is empty");

}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class list{
	
																				//METHODS OF LIST interface
	
	public static void main(String[] args) {
		

		
		
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("four");
		obj.add("five");
		obj.add("six");
		obj.add(null);
		System.out.println(obj);
		
		
		System.out.println(obj.get(2)+"get");   // tya index la kon aahe
	
		obj.set(1, "hello");
		System.out.println(obj+" set");							//value replace karto paricular index chi
		
		System.out.println(obj.indexOf("five")+" index of");  //get the index value of object
		
		System.out.println(obj.lastIndexOf("five-")+" last index of");   //get last index of object
		
		Iterator test=obj.iterator();
		System.out.println("BY USING ITERATOR METHOD");        // WHILE LOOP NE AAPN SAGLE ITERATE KELE OBJECT 
		while(test.hasNext()) {
			System.out.print(test.next()+" ");
		}
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class link_list{
	
											//METHOD OF ARRAYLIST CLASS ARE NOT PRESENT IT USES ALL METHOD OF LIST AND COLLECTION
	
	
																					//METHODS OF LINKEDLIST CLASS
	
	public static void main(String[] args) {
		
		LinkedList<String> obj=new LinkedList<String>();
			obj.add("one");
			obj.add("two");
			obj.add("three");
			obj.add("four");
			obj.add("five");
			obj.add("six");
			System.out.println(obj);
			
			obj.addFirst("FIRST");
			System.out.println(obj+" add first");								//first add
			
			obj.addLast("LAST");									
			System.out.println(obj+" add last");								//last add		
				
			obj.removeFirst();
			System.out.println(obj+" remove first");						//first remove
			
			obj.removeLast();
			System.out.println(obj+" remove last");        				//last remove
			
			System.out.println(obj.getFirst()+" get first"); 				//first get
			
			System.out.println(obj.getLast()+" get last"); 				//last get
	}
}

class vector{    
																			//METHODS OF LINKEDLIST CLASS
	public static void main(String[] args) {
		Vector<Object> obj=new Vector<Object>();
	//VECTOR IS SYNCRONIZE SO IT IS THREAD SAFE.
		obj.addElement("eleven");
		obj.addElement("twelve");
		obj.addElement("thirteen");
		obj.addElement("fourteen");
		obj.addElement("fifteen");
		obj.addElement("sixteen");
		System.out.println(obj);
	
		
		obj.removeElement(("thirteen")+" remove element");			//remove object with objwct name
		obj.remove(4+" remove index") ; 											//remove object with index
		System.out.println(obj);
		
		System.out.println(obj.elementAt(2)+" element at ");          //get object at index
		
		System.out.println(obj.firstElement()+" first element");		//get object at first place
		
		System.out.println(obj.lastElement()+" last element ");       //get object at last place
		
		System.out.println(obj.capacity()+" capacity of obj collection ");   //capacity of collection
		
		Enumeration<Object> gp=obj.elements();
		while(gp.hasMoreElements()) {
			System.out.print(gp.nextElement()+" ");
		}
		System.out.println();
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////");
		Stack <Object> obj2=new Stack<Object>();
		
		obj2.push("hello");
		obj2.push("hell");
		obj2.push("hel");
		obj2.push("he");
		obj2.push("h");
		obj2.push(null);
		System.out.println(obj2+" push ");    //add karto
		
		obj2.pop();
		System.out.println(obj2+" pop ");
		obj2.pop();
		System.out.println(obj2+" pop ");          //delete karto
		
		System.out.println(obj2.empty()+" empty ");        //empty aahe ki nahi
		
		
	}
}

 class  map_set{
	public static void main(String[] args) {
		
		HashMap<Integer, String> obj=new HashMap<Integer, String>();
		    obj.put(3, "three");
			obj.put(0, "one");
			obj.put(2, "two");
		   
			obj.put(4, "four");
			obj.put(5, "five");
			obj.put(6, "six");
			obj.put(7, "seven");
			obj.put(8, "eight");
			
			System.out.println(obj);
			
			obj.putIfAbsent(9, "nine");
			System.out.println(obj);
			
			obj.remove(9);
			System.out.println(obj);
			
			TreeSet<String> obj1=new TreeSet<String>();
			obj1.add("gaurav");
			obj1.add("gaur");
			obj1.add("g");
			obj1.add("3");
			obj1.add( "1");
			obj1.add( "2");
		//	System.out.println(obj1);
		//	System.out.println(obj1.first());
		//	System.out.println(obj1.ceiling("2"));
		//	System.out.println(obj1.floor("5"));

		//	System.out.println(obj1.descendingSet());
			System.out.println(obj1.floor("4"));
			
			TreeSet<Object> obj9=new TreeSet<Object>();
			//obj9.add("one");
			//obj9.add("two");
		obj9.add(3);
		obj9.add(200);
		obj9.add(33);
			System.out.println(obj9);
		
			
			
		}
	
	
}



