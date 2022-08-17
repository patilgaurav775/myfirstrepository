package COLLECTION;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class hashtableexample {

	public static void main(String[] args) {                                          //hashtable la null nahi deu shakat and  sincronized
		// TODO Auto-generated method stub
		Hashtable<String , String> oo=new Hashtable<String, String>();
		//oo.put("gaurav", null);
	
		
		IdentityHashMap<Integer , String> oo1=new IdentityHashMap<Integer, String>();   //hashmap la null chalto and non sincronized
		oo1.put(2,"gaurav");
		oo1.put(3, "Sanjay");
		oo1.put(1, "patil");
		System.out.println(oo1);
		
		

		
		
	}

}
