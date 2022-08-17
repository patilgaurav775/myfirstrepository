package operator;

public class unary {

	public static void main(String[] args) {
		unary obj=new unary();
		obj.positive(10);   //+ + = +
		obj.positive(-10);  //+ - =  -
		obj.negative(-50);  //- - = +
		obj.negative(50);  //- + = -
		int gaurav=1000;
		obj.increment(gaurav);  // value will get 1001
		obj.decrement(25);
		obj.invert(true);
		obj.invert(false);
	
		int var1=12;
		System.out.println(++var1); // 13    prefix ++ addition first then value will print    var1 value will auto updated
		System.out.println(var1++); //  13        suffix ++ first variable will get printed then addition will print
		System.out.println(var1);      //  14
		System.out.println(++var1 + var1++);   // 15 + 15
		System.out.println(var1);   //16
		
		int var2=100;
		System.out.println("value of var2 is"+ ++var2);    //101
		System.out.println("value of second var2 is " + var2++);		//101
		System.out.println("value of second var2 is " + (++var2 + var2++ ));   //103+103=204
		System.out.println(var2);
	}
private void positive(int a) {
	System.out.println("i am operator to present positive"+(+a));
}
private void negative(int b) {
	System.out.println("i am operator to present negative"+(-b));
}
private void increment(int c) {
	System.out.println("i am operator to present increment"+(++c));
}
private void decrement(int e) {
	System.out.println("i am operator to present decrement"+(--e));
}
private void invert(boolean d) {
	System.out.println("i am operator to present invert" + (!d));
}
}

