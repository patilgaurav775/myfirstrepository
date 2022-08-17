package array;

public class promatrixdiv {
	static int aa[][] = { { 2, 3, 1 }, { 4, 2, 1 }, { 1, 6, 2 } };
	static int bb[][] = { { 3, 4, 2 }, { 1, 6, 1 }, { 3, 2, 1 } };
	static int cc[][] = new int[3][3];

	static void product() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cc[i][j] = 0;
				for (int k = 0; k < 3; k++)
					cc[i][j] = cc[i][j] + aa[i][k] * bb[k][j];
				System.out.print(cc[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(aa[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(bb[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
		product();
	}
}
