package StringClass;

//Immutable class means we cannot change the values of data members after object creation
//all the string classes are Immutable classes
//for Immutable class, class should be final
//all the data variables should be declared as private
//create constructor with passing parameter
//create getter method for data variables

public final class Immutableclass {

	private int salary;
	private String name;

	Immutableclass(String s, int num) {
		salary = num;
		name = s;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Immutableclass obj = new Immutableclass("java", 25000);

		System.out.println(obj.getName());
		System.out.println(obj.getSalary());

	}
}
