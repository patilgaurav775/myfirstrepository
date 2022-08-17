package pankaj;

public class sumandaverageofarray {

	public static void main(String[] args) {
		//FIND THE SUM OF ARRAY IN JAVA
		int[] arr= {12,24,36,48,60,72,84,96,108,120};
		int sum=0;
		System.out.println("ingredient of array arr are as follows:-");
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("sum of all ingredient in array arr is :--"+sum);

		double average=sum/arr.length;
		System.out.println("average of arr array is "+average);
		
		
	}

}
