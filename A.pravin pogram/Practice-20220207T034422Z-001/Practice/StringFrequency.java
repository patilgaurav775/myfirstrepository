package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StringFrequency {

	static void characteroccurence1() {
		String s = "I am from pune and I am an engineer";
		int totallength = s.length();
		int length = s.replace("a", "").length();
		int frequency = totallength - length;
		System.out.println("frequency of char a is : " + frequency);
	}

	static void characteroccurence2() {
		String s = "I am from pune and I am an engineer";
		
		String[] q = s.split(" ");
		
		List<String> list = new ArrayList<String>(Arrays.asList(q));
		
		Set<String> set = new HashSet<String>(list);
		
		Iterator<String> itr = set.iterator();
	
		for (int i = 0; i < set.size(); i++) {
			String name = itr.next();
			System.out.println(name + ":  " + Collections.frequency(list, name));
		}
	}

	static void characteroccurence3() {
		String s = "I am from pune and I am an engineer";
		
		String[] q = s.split("");
		
		List<String> list = new ArrayList<String>(Arrays.asList(q));
		
		Set<String> set = new HashSet<String>(list);
		Iterator<String> itr = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			String name = itr.next();
			System.out.println(name + ":  " + Collections.frequency(list, name));
		}
	}

	public static void main(String[] args) {

		characteroccurence1();
		System.out.println("---------");
		characteroccurence2();
		System.out.println("---------");
		characteroccurence3();
	}

}
