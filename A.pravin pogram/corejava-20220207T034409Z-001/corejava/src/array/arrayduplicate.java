package array;

public class arrayduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int xx[] = new int[] { 1, 2, 3, 4, 5 };
		int yy[] = new int[] { 4, 5, 6, 7, 8 };

		for (int i = 0; i < xx.length; i++)
		{
			for (int j = 0; j < yy.length; j++) 
			{
				if (xx[i] == yy[j]) 
				{
					int zz[] = xx;
					System.out.print( zz[i] + " ");
					
				}
			}
		}
	}
}
