package array;

// copy all element of one array to another array

public class arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[] = new int[] { 2, 4, 6, 8, 10, 12, 14, 16 };

		int c1[] = c;

		int c2[] = c.clone();

		for (int i : c1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : c) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int j : c2)
			System.out.print(j + " ");
	}

}
