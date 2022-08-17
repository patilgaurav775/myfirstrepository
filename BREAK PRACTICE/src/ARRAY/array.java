package ARRAY;

import java.util.Arrays;

public class array {
	public static int[] rollno= {1,2,3,4,5,6,7,8,9,10};
	
	static int b[];
	public static  int[] marks= {1,2,3,4,5,6,7,8,9,10};
	
	static int percentage[];
	public static void main(String[] args) {
		//array obj=new array();
		System.out.println("compare arrays ; "+Arrays.compare(rollno, marks));   //return 1 if mathches and 0 if not
		System.out.println("search array "+Arrays.binarySearch(marks, 8));  //return index of 8
		System.out.println(marks[4]);
		rollno=new int[100];
		
		for(int i=0;i<100;i++) {
			rollno[i]=i+1;
		}
		System.out.println("first student"+rollno[0]);
		System.out.println("last student"+rollno[99]);
	
		percentage=new int[50];
		for(int j=0;j<10;j++) {		//default no printing
			System.out.println("he"+marks[j]);
		}
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(marks));
		
		marks=new int[100];
		for(int i=0;i<100;i++) {
			marks[i]=i+1;
		}
		for(int i:marks) {
			System.out.println(i);
		}
	}

}
