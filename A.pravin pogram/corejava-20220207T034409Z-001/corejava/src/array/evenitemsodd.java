package array;

public class evenitemsodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int even[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(" all the elements in array");
		for (int num : even)
			System.out.print(num + " ");
	
		System.out.println("\n even elements in array");
		for (int i = 0; i < even.length; i++) {
			if (even[i] % 2 == 0) {
				System.out.print(even[i] + " ");
			}
		}
		System.out.println("\n odd elements in array");
		for (int i = 0; i < even.length; i++) {
			if (even[i] % 2 != 0) {
				System.out.print(even[i] + " ");
			}
		}
		System.out.println();
	}
}
