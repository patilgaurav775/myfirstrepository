package pankaj;

public class sumoftwoarrayelement {

	public static void main(String[] args) {
		int[] b= {1,65,98,75,79};
		int[] a= {11,66,94,78,78};
		int sum=0;
		int sum1=0;
		
		int[] c;
		c=new int[5];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				if (i==j) {
					c[i]=a[i]+b[i];
					System.out.print(c[i]+" ");
				}
				
			}
		}
		
		
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		for(int j=0;j<a.length;j++) {
			sum=sum+a[j];
		}
		System.out.println();
		System.out.print("sum value is ");
		System.out.println(sum);
		
		
		

		
		
		
	
		
		
		

	}

}
