package COLLECTION_REAL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class print_duplicates_using_collection {
	

	 public static void main(String[] args) {
	  
	  /*ArrayList<String> list=new ArrayList<String>();
	  list.add("Dnya");
	  list.add("mauli");
	  list.add("tukaram");
	  list.add("Dnya");
	  list.add("raj");
	  list.add("mauli");*/
	
		 
	  ArrayList<String> list=new ArrayList<String>(Arrays.asList("pushpa","want","the","flower","na","pushpa","fire","na"));
	  
	  HashSet<String> set1=new HashSet<String>();
	  HashSet<String> set2=new HashSet<String>();
	  
	  
	  for(int i=0;i<list.size();i++) {
	   if(!set1.add(list.get(i))) {
	    set2.add(list.get(i));
	   }
	   
	  }
	  
	 
	 
	 
	 }

	}
	  
	  
	  

