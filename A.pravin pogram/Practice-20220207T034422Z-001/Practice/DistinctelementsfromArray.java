package Practice;

import java.util.HashMap;
import java.util.HashSet;

public class DistinctelementsfromArray {

	public static void printdistinct1(int arr[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void printdistinct2(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		System.out.println(map.keySet() + " ");
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 4, 5, 6 };

	printdistinct1(a);
	printdistinct2(a);
	}

}
