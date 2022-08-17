package ARRAY;

import java.util.Arrays;

public class sort {
    public static int[] gaurav= {1,0,3,0,1,0,4,5};
    
    public static void main(String[] args) {
		Arrays.sort(gaurav);
		
		for(int i=gaurav.length-1;i>=0;i--) {
			System.out.print(gaurav[i]+" ");
		}
		System.out.println();
		for(int i=0;i<gaurav.length;i++) {
			System.out.print(gaurav[i]+" ");
		}
		System.out.println();
	//	Arrays.binarySearch(gaurav, 2);                              //index sathi
		System.out.println("index is "+Arrays.binarySearch(gaurav, 5));
		
		System.out.print(" "+Arrays.toString(gaurav));

		
		
		
	}
}
