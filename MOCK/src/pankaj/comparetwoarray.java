package pankaj;

public class comparetwoarray {
    // COMPARISION BETWEEN TWO ARRAY
	public static void main(String[] args) {
		//int[] a= {78,79,65,1,98};
		int[] a= {1,65,98,78,79};
		int[] b= {1,65,98,78,79};
		int[] c= {1,65,9,8,7};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<c.length;j++) {
				
				if(a[i]==c[j] ) {
					System.out.println("a and b array are same "+a[i]);
				}
			
			}
		}

	}

}
