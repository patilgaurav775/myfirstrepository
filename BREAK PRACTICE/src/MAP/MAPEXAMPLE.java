package MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MAPEXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			HashMap<Integer, String> obj=new HashMap<Integer, String>();
			obj.put(1, "one");     	 //put method in place of add one is key and another is value.
			obj.put(2, "two");		
			obj.put(2, "three");		//duplicate key dili tr new value override karte means [1 one ] and [2 three] yeil [2 two] chya jagi
			obj.put(4, "simbha");
			System.out.println(obj);
			
			System.out.println("////////////////////////////////");

			obj.putIfAbsent(2, "six");
			System.out.println(obj);       //jar 2 navachi key nasel tr value tithe taak nahi tr overide nahi karat jasa ahe map tasach thevat.

			
			System.out.println("////////////////////////////////");			
			obj.remove(4);                     //key takli ki ti key remove hoil
			System.out.println(obj);

			
			System.out.println("////////////////////////////////");
			obj.remove(2, "three");		 //key ani remove takli ki ti key remove hoil  key ani value vagli asel tr operation perform honar nahi
			System.out.println(obj);
			
			
			System.out.println("////////////////////////////////");
			
			HashSet<String> obj1=new HashSet<String>();
			obj1.add( "one");
			obj1.add("two");
			System.out.println(obj1);
			
			
			HashMap<Integer, String> obj5=new HashMap<Integer, String>();
			obj5.put(1, "one");      //put method in place of add one is key and another is value.
			obj5.put(2, "two");		
			obj5.put(2, "three");		//duplicate key dili tr new value override karte means [1 one ] and [2 three] yeil [2 two] chya jagi
			obj5.put(4, "simbha");
			
			
			
			System.out.println(obj5);
			
			System.out.println(obj5.values());   // to search values
			
			System.out.println(obj5.keySet());
			
			Iterator t=obj5.keySet().iterator();
			while(t.hasNext()) {
				System.out.print(t.next()+" ");
			}
			System.out.println();
			System.out.println(obj5.entrySet());
			
	}

}
