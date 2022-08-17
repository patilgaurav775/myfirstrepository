package array;

public class arrayevenposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int f[] = { 1, 11, 21, 31, 41, 51, 61, 71, 81 };
		System.out.println("arrays elements");
		for (int ab : f) {
			System.out.print(ab + " ");
		}

		// System.out.println();
		System.out.println("\narrays elements at even position");
		for (int i = 1; i < f.length; i = i + 2) {
			System.out.print(f[i] + " ");
		}
		// System.out.println();
		System.out.println("\narrays elements at odd position");
		for (int i = 0; i < f.length; i = i + 2) {
			System.out.print(f[i] + " ");
		}
		// System.out.println();
		System.out.println("\narrays elements at every third position");
		for (int i = 2; i < f.length; i = i + 3) {
			System.out.print(f[i] + " ");
		}
	}
}