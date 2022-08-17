package array;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[] = { 1, 2, 2 };
		System.out.println(Arrays.toString(d));
		System.out.println("duplicate elements in arrays are");
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] == d[j])
					System.out.print(d[j] + " ");
			}
		}
	}
}
	