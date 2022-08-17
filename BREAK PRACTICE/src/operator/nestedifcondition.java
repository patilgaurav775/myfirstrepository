package operator;

public class nestedifcondition {

	public static void main(String[] args) {
		nestedifcondition obj = new nestedifcondition();
		obj.m1(18, 50);
}
	public void m1(int age,int weight) {
		
		
		if (age>=18) {
			
			if (weight>=50) {
				System.out.println("you can donate blood");
			}
			else {
				System.out.println("you are under weight");
			}
		}
		else {
				System.out.println("you are under 18");
		}

	}
	
	
}