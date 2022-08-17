package pankaj;

public class differentwaytoprintarray {
public static int rollno[];
	
	public static int employee[][];
	public static void main(String[] args) {
		employee=new int[3][2];			//aani array chi cpacity ashi lihitat
		rollno=new int[10];
		//DIFFERENT WAYS TO PRINT ARRAY 
		employee[0][0]=20;
		employee[0][1]=40;
		employee[1][0]=60;
		employee[1][1]=80;
		employee[2][0]=100;
		employee[2][1]=120;
																	//FOR 2D
		//System.out.println("PRINT ARRAY COMPONENT BY INDIVIDUAL INDEX"+employee[2][1]);
		for(int i=0;i<employee.length;i++) {
			for(int j=0;j<employee[1].length;j++) {
				System.out.print(" "+employee[i][j]);
			}
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println("BY USING LOOP FOR  ROW  "+employee[i][0]);
			System.out.println("BY USING LOOP FOR  ROW  "+employee[i][1]);
		}
																	//FOR 1D
		for(int i=0;i<10;i++) {
			rollno[i]=i+1;
			System.out.println("roll no "+rollno[i]);
		}
		for(int i:rollno){
			System.out.println(rollno[i-1]);
		}

	}

}
