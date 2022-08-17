package java04;

// Read only method 
class college {

	private int year = 2016;

	public int getyear() {
		return year;
	}
}

public class Encapread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		college c = new college();
		System.out.println(c.getyear());
	}

}
