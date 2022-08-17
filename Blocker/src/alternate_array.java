import java.util.Arrays;

public class alternate_array {
	
	

	public static void main(String[] args) {
		alternate_array();

	}
public static void alternate_array() {
		
		int[] a= {1,2,3};
		int[] b= {10,20,30};
		int c[]=new int[a.length+b.length];
		
		int i=0, j=0, k=0;
		
		while(i<a.length&&j<b.length) {
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		System.out.println(Arrays.toString(c));
	}
}
