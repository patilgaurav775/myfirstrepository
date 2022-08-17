package Basics;

public class Sample {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.test1();
		s.test1(10);
	}
	
	/*
	 * Rules to define Method Overloading 
	 * rule 1: number of parameters should be different
	 * or
	 * rule 2: position of parameters should be different
	 * or
	 * rule 3: type of argument should be different
	 */
	
	private void test1() {
		System.out.println("I am private method test1");
	}
	
	private void test1(double a) {
		System.out.println("I am overloaded method of test1: "+a);
	}
	
	

}
