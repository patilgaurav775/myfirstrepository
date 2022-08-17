package array;

public class addmatrixsum {
	static int aaa[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	static int bbb[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
	static int ccc[][] = new int[3][3];

	static void sum() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ccc[i][j] = aaa[i][j] + bbb[i][j];
				System.out.print(ccc[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void sub() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ccc[i][j] = aaa[i][j] - bbb[i][j];
				System.out.print(ccc[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(aaa[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(bbb[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------");
		sum();
		System.out.println("---------");
		sub();
	}
}
