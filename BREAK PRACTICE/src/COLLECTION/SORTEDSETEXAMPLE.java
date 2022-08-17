package COLLECTION;

import java.util.Iterator;
import java.util.TreeSet;

public class SORTEDSETEXAMPLE {

	public static void main(String[] args) {
		// SORTED SET IS INTERFACE SO WE CANT CREATE OBJECT BUT IT IS IMNPLEMENTED BY TREE SET 
		
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(20);
		obj.add(15);
		System.out.println(obj);     //sorted hoil ha data 2 ,3
		
		System.out.println(obj.first());  // first element
		
		System.out.println(obj.last()); 		//last
		
		System.out.println(obj.headSet(3));   // 3 chya less print hotil
		
		System.out.println(obj.tailSet(3));    // 3 pesha jast kiwa equal to
		
		System.out.println(obj.subSet(2, 15));     // 2,3 deil means 2 pasn start ani 15-1 paryant search karel 15 ghenar nahiu
		
		//decending iterator method of navigable set
		
		Iterator<Integer> oo= obj.descendingIterator();   // output decending madhe ektra print hoto
		while(oo.hasNext()) {
			System.out.print(oo.next());
		}
		
		System.out.println(obj.descendingSet());  //output ek ek karun decending madhe
		
		System.out.println(obj.headSet(3));   // 3 peksha kami
		
		System.out.println(obj.ceiling(3));     // 3 aahe ka aahe mag 3 print karel 16 takl tr 16 nahi aahe tithe mag tyacha peksha jast 20 print hoil
		
		System.out.println(obj.floor(14));       // 14 ahe ka te baghel nahi tr tyacha peksha kami no print karel
		
		System.out.println(obj.higher(3)+"hello");       //3 nahi yenar 3 peksha jast next value only
		
		System.out.println(obj.lower(3));       //3 nahi yenar 3 peksha kami next value only
		
		System.out.println(obj.pollFirst());  	 //it will retrive  and delete first element from collection 2 udun jail aani 2 pn dakhvel
		System.out.println(obj);
		
		System.out.println(obj.pollLast()); 	//it will retrive  and delete last element from collection 20 udun jail aani 20 pn dakhvel
		System.out.print(obj);
		
		
		
	}

}
