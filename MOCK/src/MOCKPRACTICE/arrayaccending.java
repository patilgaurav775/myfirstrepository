package MOCKPRACTICE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayaccending {

	
public static List<Integer> findnum(int j,int k) {
j=2;
k=10;
List<Integer> c=new ArrayList<Integer>();

for(int i=j;i<=k;i++) {
if (i%2!=0) {
	c.add(i);
	
}

}
return c;

	}

public static void main(String[]args) {
	

	
	
findnum(2, 10);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*rollno=new int[10];
	System.out.println("length of array roll no is"+rollno.length); 
	employee=new int[3][2];			//aani array chi cpacity ashi lihitat
	System.out.println("length of array employee row is"+employee.length);
	System.out.println("length of array employee column is"+employee[1].length);

	
	//RETURN ARRAY IN METHOD 
	
	//DIFFERENT WAYS TO PRINT ARRAY 
	employee[0][0]=20;
	employee[0][1]=40;
	employee[1][0]=60;
	employee[1][1]=80;
	employee[2][0]=100;
	employee[2][1]=120;
																//FOR 2D
	//System.out.println("PRINT ARRAY COMPONENT BY INDIVIDUAL INDEX"+employee[2][1]);
	for(int i=0;i<=employee.length-1;i++) {
		for(int j=0;j<=employee[1].length-1;j++) {
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
	
	//FIND THE SUM OF ARRAY IN JAVA
	int[] arr= {12,24,36,48,60,72,84,96,108,120};
	int sum=0;
	System.out.println("ingredient of array arr are as follows:-");
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("sum of all ingredient in array arr is"+sum);

	//AVERAGE OF ARRAY IN JAVA
	
	int[] patil= {15,30,45,60,75,90,105,120,135,150};
	int addition=0;
	double average=0;
	
	System.out.println("Contents in array patil is as follows");
	for(int i=0;i<patil.length;i++) {
		
		addition=addition+patil[i];
		System.out.print(patil[i]+" ");
		average=addition/patil.length;
	}
	System.out.println();
	System.out.println("average of all content in array is= "+average);*/

	
	
	
	
	
	
}

}
 

 

