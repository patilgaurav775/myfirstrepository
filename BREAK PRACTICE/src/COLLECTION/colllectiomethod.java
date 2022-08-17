package COLLECTION;

import java.util.ArrayList;

public class colllectiomethod {

	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<Object>();

		obj.add("bharat mata ki jay"); // >>>> this will add string object
		obj.add(500); // >>>> this will add integer object
		System.out.println(obj);

		ArrayList<Object> obj1 = new ArrayList<Object>();

		obj1.add("jay"); // >>>> this will add string object
		obj1.add(420); // >>>> this will add integer object
		System.out.println(obj1);
		
	

		obj.addAll(obj1); // >>>>>>this will add obj1 cllection to obj collection aani obj1 madhe pn asel tyache tyache object
		System.out.println("after adding obj1 collection to obj is " + obj);
		
		obj.remove(1); //>>>>>tya index cha object remove hoil
		System.out.println("by removing 1st index "+obj);
		
		obj.removeAll(obj1);   //>>>>> remove all ha obj1 navach collection remove karel obj madhun
		System.out.println(obj);
		
		obj.clear();					//>>>>>> clear obj collection madl sagal udvun takel
		System.out.println(obj);
		
		obj.add("bharat mata ki jay"); // >>>> this will add string object
		obj.add(500); // >>>> this will add integer object
		
		System.out.println(obj.contains(500));    //>>>>>aahe ki nahi te check hote
		System.out.println(obj);
		
		
		Integer t=(Integer) obj.get(1);   //typecasting from object class to integer class
		System.out.println(t);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
