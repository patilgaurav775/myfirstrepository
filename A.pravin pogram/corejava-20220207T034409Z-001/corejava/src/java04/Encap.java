package java04;

class data {
	private int age;
	private String name;
	private int salary;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age1) {
		this.age = age1;
	}
	public String getName() {
		return name;
	}
	public void setName(String nam) {
		this.name = nam;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int sal) {
		this.salary = sal;
	}	
}
public class Encap {

	public static void main(String[] args) {
		data a = new data();
		System.out.println(a.getAge());
		System.out.println(a.getName());
		System.out.println(a.getSalary());
		System.out.println("----------");
		a.setAge(10);;
		a.setName("rahul");
		a.setSalary(25000);
		System.out.println(a.getAge());
		System.out.println(a.getName());
		System.out.println(a.getSalary());
		System.out.println("----------");

		
		
	}

}
