package pankaj;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reversearray {
	public static int[] patil= {15,30,45,60,75,90,105,120,135,150};
	public static void main(String[] args) {
	
		
		// REverse array
		int gp=0;
		int[] patil= {15,30,45,60,75,90,105,120,135,150};
	/*	for(int i=0;i<=patil.length-1;i++) {
			for(int j=i;j<=patil.length-1;j++) {
				
				if(patil[i]<patil[j]) {
					gp=patil[i];
					patil[i]=patil[j];
					patil[j]=gp;
				}
			}
			
			
		
		System.out.println("second highest number is"+patil[1]);*/
		
		
		for(int i=patil.length-1;i>=0;i--) {
				System.out.print(patil[i]+" ");
		
					
			}
			
			

	}
	

}
