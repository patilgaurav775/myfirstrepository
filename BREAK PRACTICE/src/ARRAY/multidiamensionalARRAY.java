package ARRAY;

public class multidiamensionalARRAY {
	
	//1D array
	public static int[] array;
	
	//2D array
	public static int[] [] array2;  
	
	//3D array
	public static int[] [] [] array3;
	
	//4D array
		public static int[] [] [] array4;
		
		public static int number [][];
		
		
	
	public static void main(String[] args) {
			array=new int[50];
			
			array2=new int[3][2];
			array2[0][0]=5;
			array2[0][1]=10;
			array2[1][0]=15;
			array2[1][1]=20;
			array2[2][0]=25;
			array2[2][1]=30;
			//---------------------------------------------------------1st way
			System.out.println(array2[0][0]);
			System.out.println(array2[0][1]);
			System.out.println(array2[1][0]);
			System.out.println(array2[1][1]);
			System.out.println(array2[2][0]);
			System.out.println(array2[2][1]);
			System.out.println("//////////////////////");
		//-------------------------------------------------------------------------------------------	2nd way
			for(int i=0;i<3;i++) {
				System.out.println(array2[i][0]);
				System.out.println(array2[i][1]);
				
			}
			System.out.println("//////////////////////");
		//	-----------------------------------------------------------------------------------------------------------------------------3rd way
			for(int i=0;i<3;i++) {
				for(int j=0;j<2;j++) {
					System.out.println(array2[i][j]);
					
				}
			}
			System.out.println("//////////////////////");

			
			for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++) {
					System.out.print('*');
				}
				System.out.println();
			}

	
	  // 2 dimensonal array
	  number = new int [2][3]; 
	  
	  System.out.println(" length size of row = " + number.length);
	  System.out.println(" length size of column = " + number[0].length);
	  
	  
	  int acendingrow[][]= {{1,2,3,4},{9,9,9,9},{8,8,8,8},{1,2,3,4}};	
	 
		System.out.println("no of row  accending is"+acendingrow.length);
		System.out.println("no of column accending is"+acendingrow[3].length);
		
		
		int[][] lengthmeasure;
		
		lengthmeasure=new int[2][4];
		System.out.println("total length of row is"+lengthmeasure.length);
		System.out.println("total length of column is"+lengthmeasure[0].length);
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print(" "+acendingrow[i] [j]);
			}
			System.out.println();
		}
	 }
	}

