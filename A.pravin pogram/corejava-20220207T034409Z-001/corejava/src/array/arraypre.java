package array;

import java.util.Arrays;

public class arraypre {
	public static void main(String args[]) {
		int arr[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("Printing clone of the array:");
		int carr[] = arr.clone();
		for (int i : carr) {
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("Are both equal?");
		System.out.println(Arrays.equals(arr, carr));
		System.out.println("----------------");
		System.out.println("copy all the elements from arr to copyArr:");
		int copyArr[]=Arrays.copyOf(arr, arr.length);
		for (int i : copyArr){
			System.out.println(i);
		}
		System.out.println("----------------");
		System.out.println("copy elements with range from arr to copyArr:");
		int copyArrs[]=Arrays.copyOfRange(arr, 0, 3);
		for (int i : copyArrs){
			System.out.println(i);
		}
		System.out.println("-----------------");
		Arrays.sort(arr);
		System.out.println("After sorting original array:");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		System.out.println("hashcode for array arr");
			System.out.println(Arrays.hashCode(arr));
			System.out.println("-----------------");
		
	}

}
