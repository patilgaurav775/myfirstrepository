package operator;

public class if_elese_if {

	public static void main(String[] args) {
		if_elese_if obb=new if_elese_if();
		obb.m1(500);
				}
	public void m1(int num1) {
		if (num1>10) {
			System.out.println("num1 is greater than 10");
		}
		else if (num1<10 && num1>5) {
			System.out.println("num1 is less than 10 and greater than 5");
		}
		else {
			System.out.println("i am invalid case");
		}
	}
	}
