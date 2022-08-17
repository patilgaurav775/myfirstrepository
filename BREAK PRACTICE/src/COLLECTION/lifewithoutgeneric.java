package COLLECTION;

import java.util.ArrayList;

public class lifewithoutgeneric {

	public static void main(String[] args) {
			
		ArrayList<Object> obj=new ArrayList<Object>();
		
		obj.add(1);
		obj.add("string");
		System.out.println(obj);
		
		Integer p=(Integer) obj.get(0);
		System.out.println(p);
		
		

	}

}
