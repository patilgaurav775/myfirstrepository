 package ARRAY;

import java.util.Arrays;

public class singlediamentionarray {
	public int a[];
	public static int[] b;     //we can write in both way
	public static int rollno[];
	public static int percentage[];
	public static int acendingrow[]= {1,2,3,4,5,6,7,8,9,10};
			
	
	
	public static void main(String[] args) {
		b=new int[25];            //their is size in square bracket meand ithe 25 value store karu shkto
		rollno=new int[100];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		
		for(int i=0;i<100;i++) {
			rollno[i]=i+1;
			
		}
		System.out.println("first student of class is"+rollno[0]);
		System.out.println("last student of class is"+rollno[99]);
		
		singlediamentionarray name = new singlediamentionarray();
		name.a=new int[52];		//instance arrray
		name.a=new int[60];
		
		name.a[51]=60;            //out of boundry error because 50 set keli ahe apn 25 no line var
		name.a[59]=655;		
		
		
		percentage=new int[10];      //he zal hardcoded khali aahe rombhust code on 43 no line la
		
		for(int j=0;j<10;j++) {
			System.out.println("default value f percentage is"+percentage[j]);
		}
		System.out.println(percentage[0]); //we will get null point error if we try to access variable without initilization
		
		System.out.println(name.a.length);   //if we want to printh length of array variable
		
		//if i want to modify above for loop for percentage
		for(int j=0;j<percentage.length;j++) {			//it is rombhust means aapn size chane keli jast keli ttri kahi pb nahi apoap update karil java
			System.out.println("default value f percentage is"+percentage[j]);
		}
		
		//integrating array through for each loop
		//please iterate through all array element
		for(int g:acendingrow) {
			System.out.println(g);   //sagle print karayche asel tr
		}
		
		for(int z:rollno) {
			System.out.println("roll no"+z);
			System.out.println("welcome to our colllage");
			System.out.println("welcome kit");
			System.out.println("laptop");
		}
		
		//printing array in one goal
		//we are using tostring method of arrays class
		//it is overloaded method for all datatypes.
		System.out.println(Arrays.toString(rollno));                                //fo r print all values of array
		System.out.println(Arrays.binarySearch(acendingrow, 6));		//for searching
		System.out.println(Arrays.equals(rollno, acendingrow));       //for comparison output is in boolean
	Arrays.sort(acendingrow);
		System.out.println(Arrays.binarySearch(acendingrow, 10)+"hhh");
	System.out.println(Arrays.toString(acendingrow));
		
	}
	
}
