package array;

import java.util.Arrays;

class TestReturnArray {
	
	static int[] getArray() {
		return new int[] { 10, 30, 50, 90, 60 };
	}
	
		// int[] getArray = new int[] { 10, 30, 50, 90, 60 };

}

public class array4 {
	public static void main(String args[]) {
		// calling method which returns an array
		int arr[] = TestReturnArray.getArray();// { 10, 30, 50, 90, 60 };
		// printing the values of an array
		System.out.println("---------");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");
		System.out.println("---------");
		
		System.out.print(Arrays.toString(arr));
		System.out.println("\n---------");
		
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}
}
