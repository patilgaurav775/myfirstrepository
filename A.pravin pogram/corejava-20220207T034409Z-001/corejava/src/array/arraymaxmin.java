package array;

public class arraymaxmin {
	static int h[] = { 1, 81, 21, 71, 31, 61, 51, 41 };
	static int g[] = { 2, 82, 22, 72, 32, 62, 52, 42 };

	static int largest(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	static int smallest(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < min)
				min = arr[i];
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("largest element in arrow is " + largest(h));
		System.out.println("smallest element in arrow is " + smallest(h));
		System.out.println("largest element in arrow is " + largest(g));
		System.out.println("smallest element in arrow is " + smallest(g));
	}

}
