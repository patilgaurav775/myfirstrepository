package Practice;

public class ArrayDuplicate {

	static void fetchduplicatearray1() {
		int[] a =  { 1,1, 2, 3, 1, 3, 4, 5 ,8};
		for (int i = 0; i < a.length; i++) {
			boolean flag=false;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j]=0;
					flag=true;
				}
			}
			if (flag&&a[i]!=0) {
				System.out.println(a[i]);
			}
		}

	}

	static void fetchdulpicatearray2() {
		int[] a =  { 1, 2, 3, 4, 5, 6,10 };
		int[] b =  { 4, 5, 6, 7, 8, 9 ,10};
		int[] c;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					 c = a;
					System.out.println(c[i]+" ");
				}
				
			}
		}

	}
	
	

	public static void main(String[] args) {
		//fetchduplicatearray1();
		System.out.println("---------");
		fetchdulpicatearray2();
	}

}
