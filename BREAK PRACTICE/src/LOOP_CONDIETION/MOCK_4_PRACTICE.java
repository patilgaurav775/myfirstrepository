package LOOP_CONDIETION;

public class MOCK_4_PRACTICE {

	
	public void m1(int a,int b) {
		System.out.println("addition of two parameter is"+(a+b));
	}
	
	public void m1(long a,int b) {
		System.out.println("addition of two parameter long and int is "+(a+b));
	}
	
	public void m1(long a,int b,int c) {
		System.out.println("addition of three parameter long int int is "+(a+b+c));
	}
	
	
	public static void forloop(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(" *");
			}
			System.out.println( );
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			for(int j=i;j<num;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<num;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" *");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<num;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(" *");
			}
			System.out.println( );
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			for(int j=i;j<num;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<num;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" *");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<num;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public void m(int age,int weight) {
		if (age>=18) {
			if (weight>=50) {
				System.out.println("you can donate blood");
			} 
			else {
				System.out.println("you can not donate blood due to under weight");
			}
			
		} 
		else{System.out.println("you can not donate blood due to under age");}
	}
	
	
	
	public void arraypractice() {
	 int[][] gaurav;
	 gaurav=new int[3][2];
	 gaurav[0][0]=5;
	 gaurav[0][1]=10;
	 gaurav[1][0]=15;
	 gaurav[1][1]=20;
	 gaurav[2][0]=25;
	 gaurav[2][1]=30;
	 
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<2;j++) {
			 System.out.println(gaurav[i][j]);
		 }
		
	 }
	 
		System.out.println(gaurav[0][1]);
	}
public static void main(String[] args) {
			MOCK_4_PRACTICE obj=new MOCK_4_PRACTICE();
		
			//obj.m1(45, 5, 115);
			//obj.forloop(3);           star patterns
			//obj.m(19,52);             nested if example
		
		obj.arraypractice();
		
}	
}
