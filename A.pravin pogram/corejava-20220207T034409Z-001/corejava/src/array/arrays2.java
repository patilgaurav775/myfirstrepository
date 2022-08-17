package array;

public class arrays2 {

	 int[] b = new int[5];
	
	public static void main(String[] args) {
		
		arrays2 obj = new arrays2();
		
		//int[] b;
		//b = new int[5];
		obj.b[0] = 1;
		obj.b[1] = 4;
		obj.b[2] = 9;
		obj.b[3] = 25;
		obj.b[4] = 36;

		System.out.println("normal for loop");
		
		System.out.println("-----------------------");
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("value of b for " + i + " index is " + obj.b[i]);
		}
		
		System.out.println("-----------------------");
		
		System.out.println(" for each loop");
		
		System.out.println("-----------------------");
		
		
		for (int i : obj.b) {
			System.out.print(i+ " ");
		}
	}
}
