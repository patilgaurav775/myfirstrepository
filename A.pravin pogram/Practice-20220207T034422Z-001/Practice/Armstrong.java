package Practice;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 53;
		int cubesum = 0;
		int z = num;
		int r;
		
		for (; num > 0;) {
			 r = num % 10;
			cubesum = cubesum + (r * r * r);
			num = num / 10;
		}
		if (cubesum == z) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is NOT armstrong");
		}
	}

}
