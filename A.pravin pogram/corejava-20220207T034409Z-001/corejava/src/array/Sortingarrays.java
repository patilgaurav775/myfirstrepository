package array;

import java.util.Arrays;

public class Sortingarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ad[] = new int[] { 4, 1, 6, 2, 5, 3 };

		System.out.println("before sorting array: " + Arrays.toString(ad));

		for(int i = 0; i < ad.length-1 ; i++)
		{
			for(int j = 0; j < ad.length-1; j++)
			{
				if(ad[j] > ad[j+1])
				{
					int temp = ad[j];
					ad[j] = ad[j+1];
					ad[j+1] = temp;
				}
			}
		}
		System.out.println("after sorting array in acsending: " + Arrays.toString(ad));

		for(int i = 0; i < ad.length-1 ; i++)
		{
			for(int j = 0; j < ad.length-1; j++)
			{
				if(ad[j] < ad[j+1])
				{
					int temp = ad[j];
					ad[j] = ad[j+1];
					ad[j+1] = temp;
				}
			}
		}
		System.out.println("after sorting array in descending: " + Arrays.toString(ad));
	}

}
