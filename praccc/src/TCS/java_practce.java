package TCS;

public class java_practce {

	public static void main(String[] args) {
		
		int num=123456789;
		int rem;
		int rev=0;
		for(;num>0;) {
			rem=num%10;
			rev=10*rev+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		
		
		

	}

}
