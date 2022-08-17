package array;

public class arraysumpro {
	int m[] = { 9, 6, 6, 5, -9, 1, 1, -6, 9, 1 };
	int l[] = new int[] { 1, 2, 3, 6, 9, 5, 8 };

	int addition(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		double average = sum/arr.length;
		System.out.println("average of numbers is "+average);
		return sum;
	}

	int product(int arr[]) {
		int pro = 1;
		for (int i = 0; i < arr.length; i++) {
			pro = pro * arr[i];
		}
		return pro;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arraysumpro obj = new arraysumpro();
		System.out.println("addition of elements in array: " + obj.addition(obj.m));
		System.out.println("--------------------------");
		System.out.println("addition of elements in array: " + obj.addition(obj.l));
		System.out.println("--------------------------");
		System.out.println("product of elements in array: " + obj.product(obj.l));
		System.out.println("--------------------------");
		System.out.println("product of elements in array: " + obj.product(obj.m));
		System.out.println("--------------------------");
	}

}
