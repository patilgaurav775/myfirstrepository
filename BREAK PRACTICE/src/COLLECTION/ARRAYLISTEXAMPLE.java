package COLLECTION;

import java.util.ArrayList;

public class ARRAYLISTEXAMPLE {
	int b = 1;

	public static void main(String[] args) {

		ArrayList<Object> obj = new ArrayList<Object>();

		obj.add("String"); // we add string>>>>>string ha object madhe convert hoto
		obj.add(3); // we add integer >>>> 3 ha obj madhe convert hoto collection madhe
		obj.add(3);
		obj.add(45);
		System.out.println(obj);
		obj.set(3, 500);
		System.out.println(obj.get(2)); // >>>>> 0>>string 1>>3 2>>45
		obj.add(2, 344); // >>>>>>> adding object at specific postion
		System.out.println(obj); // >>>>>>> sagle print karnyasathi

		// collection support hetrogenous object so we can add string as well as int
		// collection is nothing but group of objects

		System.out.println(obj.toString());
		obj.add(2, "pushpa");
		System.out.println(obj);
		System.out.println(obj.set(3, "pushparaj"));
		System.out.println(obj.get(2));
		

	}

}
