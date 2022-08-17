package array;

public class multiarraybasic1 {
	
	static void matrix() {
int pqr[][] = new int[3][4];
		pqr[0][0] = 1;
		pqr[0][1] = 4;
		pqr[0][2] = 9;
		pqr[0][3] = 16;
		pqr[1][0] = 25;
		pqr[1][1] = 36;
		pqr[1][2] = 49;
		pqr[1][3] = 64;
		pqr[2][0] = 81;
		pqr[2][1] = 100;
		pqr[2][2] = 121;
		pqr[2][3] = 144;
		for(int i = 0; i < pqr.length; i++) {
			for(int j = 0; j < pqr[i].length;j++) {
				System.out.print(pqr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		matrix();
		System.out.println("--------------------------");
		int xyz[][] = new int[2][3];
		xyz[0][0] = 11;
		xyz[0][1] = 22;
		xyz[0][2] = 33;
		xyz[1][0] = 44;
		xyz[1][1] = 55;
		xyz[1][2] = 66;
		for(int i = 0; i < xyz.length; i++) {
			for(int j = 0; j < xyz[i].length;j++) {
				System.out.print(xyz[i][j] + " ");
			}
			System.out.println();
		}	
	}
}