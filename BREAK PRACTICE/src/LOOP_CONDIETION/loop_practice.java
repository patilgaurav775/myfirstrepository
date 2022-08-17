package LOOP_CONDIETION;
import java.util.Iterator;

public class loop_practice {

	public static void main(String[] args) {
		loop_practice obj1 = new loop_practice();
			obj1.m10(50);
			obj1.m2(15);
			obj1.m3(16);
			obj1.m4(45, 2000, '*');
			obj1.pprr();
		
	}
	public void m10(int gaurav) {    //reverse order of 5 table
		for(;gaurav>=1;gaurav-=5) {
			System.out.println(gaurav);
		}
		}
	public void m2(int sanjay) {      //15 table print by while loop
		while(sanjay<=150) {
			System.out.println(sanjay);
			sanjay+=15;
		}
	}
	public void m3(int patil) {
		do {
			System.out.println(patil);      //"table of 16 by dowhile loop"
			patil+=16;
			
		} while (patil<=160);
	}
	public void m4(int firstnum,int secondnum,char operator) {
		switch(operator) {
		case '+':
			System.out.println("addition of two number is "+(firstnum+secondnum));
		break;
		case '*':
			System.out.println("multiplication of two number is"+(firstnum*secondnum));
		break;
		default:
			System.out.println("please enter valid input");
		break;
			
		
	
	}
		
	}
	public void reverseprime() {
	int sum=0;
		for(int i=100;i>=2;i--) {
			boolean flag=false;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if (!flag) {
				sum=sum+i;
				System.out.println("prime no"+i);
				System.out.println("all sum of prime number is"+sum);
			} else {

			}

			}
		//System.out.println();
	}
	
	public void pprr() {
		int sum=0;
		for(int i=2;i<=100;i++) {
			boolean flag=false;
			for(int j=2;i>j;j++) {
				if(i%j==0) {
					flag=true;
					break;
				}
			}
			if (!flag) {
				sum=sum+i;
				System.out.println("prime number is"+i);
			} 
			else {
				System.out.println("non prime");
			}
			
		}
		System.out.println("sum of priime number is"+sum);
	}
}



