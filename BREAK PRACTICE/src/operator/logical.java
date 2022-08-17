package operator;

public class logical {

	public static void main(String[] args) {
		//AND operator
		System.out.println("AND operator test"+ (5<6 && 6>5));   //both true ==true
		System.out.println("AND operator test"+ (5<6 && 6>9));   //one true one false==false
		System.out.println("AND operator test"+ (9<6 && 6>5));   //one true one false==false
		System.out.println("AND operator test"+ (5>6 && 6<5));   //both false==false
		//OR operator
		System.out.println("OR operator test"+ (5<6 || 6>9)); 		//both true ==true
		System.out.println("OR operator test"+ (8<6 || 6>9));  		//one true one false==true
		System.out.println("OR operator test"+ (5<6 || 3>9)); 		//one true one false==true
		System.out.println("OR operator test"+ (5<6 || 6>9)); 		//both false==false

	}

}
