package SUHAS;

public class projectemployee {
	public final static String company="L&T";
	public projectemployee(String name,int id,double salary) {
		System.out.println("COMPANY = "+company);
		System.out.println("name "+name+" id"+id +" salary"+salary);
	}

	public static void main(String[] args) {
		projectemployee name = new projectemployee("gaurav", 5000, 90000);
		projectemployee ame1 = new projectemployee(" dnaynu", 5001, 92000);
		projectemployee me = new projectemployee(" prashant", 5001, 92000);
	}

}
