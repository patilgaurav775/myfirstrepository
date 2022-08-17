package array;

import java.util.Arrays;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int e[] = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("original array numbers");
		System.out.print(Arrays.toString(e));

		System.out.println();

		System.out.println("reverse array numbers");
		for (int i = e.length - 1; i >= 0; i--) {
			System.out.print(e[i] + " ");

		}
	}
}
