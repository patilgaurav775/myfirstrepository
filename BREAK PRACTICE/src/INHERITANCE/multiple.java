package INHERITANCE;

class vehicle{
	public void speed() {
		System.out.println("i am from vehicle class");
		
	}
}
class car{
	public void speed() {
		System.out.println("i am from car class");
	}
}

public class multiple extends vehicle {
	public void cartype() {
		System.out.println("i am cartype");
	}
	public static void main(String[] args) {
	multiple obj= new multiple();
	vehicle obj2=new vehicle();
	obj2.speed();
	obj.speed();
	obj.cartype();
	

	}

}
