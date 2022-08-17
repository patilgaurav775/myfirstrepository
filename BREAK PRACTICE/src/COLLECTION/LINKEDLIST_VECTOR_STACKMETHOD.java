package COLLECTION;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LINKEDLIST_VECTOR_STACKMETHOD {

public static void main(String[] args) {
	
	
	LinkedList<String> obj = new LinkedList<String>();     //linklist cha object

					obj.addFirst("string first");
					obj.add("testing");
					obj.addLast("checking");
					obj.add("hello");
					obj.addFirst("fiirrsstt"); // ha ek no la jail
					System.out.println(obj);
					System.out.println(obj.getFirst());
				
	Vector<String> obj1=new Vector<String>();				//Vector cha object
					obj1.addElement("gaurav");
					obj1.addElement("sanjay");
					obj1.addElement("patil");
					System.out.println("////////////// vector");
					System.out.println(obj1.capacity()); 		//maximum capacity sangto
					
			
					System.out.println(obj1);
					obj1.removeElementAt(0);
					System.out.println(obj1);
					
					
	
	Stack<Object> obj3=new Stack<Object>();
	System.out.println("////////////// stack");
					
					obj3.push("patil");
					obj3.push("pankaj");           						//push ha add karnyasathi
					obj3.push("barlota");
					obj3.pop();
					System.out.println("***"+obj3.pop());
					System.out.println(obj3.peek());
					System.out.println(obj3);    						//last in first out pop ha delet sathi
					
	}

}
