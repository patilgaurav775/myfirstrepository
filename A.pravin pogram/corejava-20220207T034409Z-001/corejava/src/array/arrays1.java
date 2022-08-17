package array;

public class arrays1 {

	public static void main(String[] args) {

		// declaration
		int a[] = new int[5]; // single dimensional arrays

		// initialization
		a[0] = 0001;
		a[1] = 0010;
		a[2] = 0011;
		a[3] = 0100;
		a[4] = 0101;

		System.out.println("---------------------");
		System.out.println("value of a for 0 index " + a[0]);
		System.out.println("value of a for 1 index " + a[1]);
		System.out.println("value of a for 2 index " + a[2]);
		System.out.println("value of a for 3 index " + a[3]);
		System.out.println("value of a for 4 index " + a[4]);

		a[0] = 01;
		a[1] = 10;
		a[2] = 11;
		a[3] = 100;
		a[4] = 101;

		System.out.println("---------------------");
		System.out.println("value of a for 0 index " + a[0]);
		System.out.println("value of a for 1 index " + a[1]);
		System.out.println("value of a for 2 index " + a[2]);
		System.out.println("value of a for 3 index " + a[3]);
		System.out.println("value of a for 4 index " + a[4]);

	}
}
