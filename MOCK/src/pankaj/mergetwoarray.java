package pankaj;

import java.util.Arrays;

public class mergetwoarray {



	public static void main(String[] args) {
		
		
		int[] a= {1,65,98,78,78,98};
		int[] b= {12,66,97,76,79,101,321};
		
		int d=a.length+b.length;
		int[] c=new int[d];
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		Arrays.sort(b);
		for(int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("second highest number is"+c[c.length-2]);
	
	}

}
