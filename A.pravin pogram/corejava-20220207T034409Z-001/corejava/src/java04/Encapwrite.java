package java04;

//write only method
class call {
	private int year;

	public void setyear1(int year1) {
		this.year = year1;
	}
}

public class Encapwrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		call c1 = new call();
		c1.setyear1(2016);
		c1.setyear1(2021);
		System.out.println("-------");
	}

}
