package COLLECTION;

import java.util.TreeSet;

public class TREESET_EXAMPLE {
				//tree set dont allow hetrogenous data
				//if you add hetrogenous data then their is no compiler error but it shows eror on runtime.
	public static void main(String[] args) {
		TreeSet<Integer> obj=new TreeSet<Integer>();
		
		//obj.add("hello");
		obj.add(1);
		obj.add(20);
		obj.add(2);
		
		System.out.println(obj);  //from java 7 if you add value null then null point exception shown at runtime
		//all methgods are frm nevigable and sorted set
		
	}

}
