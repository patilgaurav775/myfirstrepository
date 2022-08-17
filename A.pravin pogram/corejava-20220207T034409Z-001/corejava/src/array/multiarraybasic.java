package array;

public class multiarraybasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][] = new int[3][3];

		abc[0][0] = 1;
		abc[0][1] = 2;
		abc[0][2] = 3;
		abc[1][0] = 4;
		abc[1][1] = 5;
		abc[1][2] = 6;
		abc[2][0] = 7;
		abc[2][1] = 8;
		abc[2][2] = 9;

		for (int i = 0; i < abc.length; i++) 
		{
			for (int j = 0; j < abc[i].length; j++) 
			{
				System.out.print(abc[i][j] + " ");
			}
			System.out.println();
		}
	}

}
