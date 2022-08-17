package pankaj;

import java.util.Arrays;

public class copyarray {
	

	public static void main(String[] args) {
		int[] a= {1,65,98,78,78};
		//int [] b=new int[6];
		int []b=Arrays.copyOf(a, 10);
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		//copyarray();

	}

}
