package ARRAY;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		
		int[] ashu= {500,200,10,20,30,40,50,60,70,80,90,100};
		
		Arrays.sort(ashu);
		
		for(int i=0;i<ashu.length;i++) {
			System.out.print(ashu[i]+" ");
		}
		System.out.println();
		
		for(int i=ashu.length-1;i>=0;i--) {
			System.out.print(ashu[i]+" ");
		}
		System.out.println();
		
		int a;
		for(int i=0;i<ashu.length;i++) {
			for(int j=i;j<ashu.length;j++) {
				if(ashu[i]>=ashu[j]) {
					a=ashu[i];
					ashu[i]=ashu[j];
					ashu[j]=a;
				}
			}
			System.out.print(ashu[i]+" ");
			}
	}

}
