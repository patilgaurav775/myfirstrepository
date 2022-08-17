package LOOP_CONDIETION;
import java.text.BreakIterator;

public class condition_practice {

	public static void main(String[] args) {
		condition_practice obj = new condition_practice();
		obj.m1(9);
		obj.m2(15);
		obj.m3(15);
		obj.m4(18, 55);
		obj.m5(55);
		obj.m6(4);
	}
	public void m1(int abc) {
		
		if (abc>=10) {
			System.out.println("i am greater than 10");
		}
			System.out.println("i am less than 10");
			
	}
		public void m2(int def) {
			if (def<=10) {
				System.out.println("def is less than 10");
			} else {
				System.out.println("def is greater than 10");
			}
		
	}
		public void m3(int ghi) {
			if(ghi<=10) {
				System.out.println("ghi is less than 10");
			}
			else if (ghi>=10 && ghi<=20) {
				System.out.println("ghi is greater than 10 and less than 20");
			}
			else {
				System.out.println("ghi is greater than 20");
			}
		}
		public void m4(int age,int weight) {
		
			if (age>=18) {
				if (weight>=50) {
					System.out.println("i am eligible for blood donation");
					
				}
				else {
					System.out.println("you are under weight so you cant donate blood");
				}
			}
				else {
					System.out.println("you are under age so you cant donate blood");
				}
				
			}
		public void m5(int num) {
			
			switch (num%2) {
			case 0: {
				System.out.println(num+ " is even number");
				break;
			}
			default:
				System.out.println(num + "is odd number");
			}
		}
		public void m6(int num1) {
			switch(num1) {
			case 1:{
			System.out.println("this is one");
			break;
			}
			case 2:{
			System.out.println("this is two");
			break;
			}
			default:
			System.out.println(num1+"is other than one and two");
			}
			}
			
		
		}

