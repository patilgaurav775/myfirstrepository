package ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ARRAYEXAMPLE {
		int a ;         //normal variable declaration
		static int [] b;			//array declaration single diamention
		int[] marks;
		static int[] percentage;
		
		static int[]rollno= {1,2,3,4,5,6,7,8,9,10};        //ini with declaration
	public static void main(String[] args) {
		b=new int[5];                     //initilize of array
	
	rollno=new int[100];
	rollno[0]=1;
	rollno[1]=2;
	rollno[2]=3;   //this is donkey work
	
	//this is smart work
	for(int i=0;i<100;i++) {
		rollno[i]=i+1;
	}
	System.out.println("first student of school"+rollno[0]);
	System.out.println("last student of school"+rollno[99]);
	
	ARRAYEXAMPLE name = new ARRAYEXAMPLE();
	name.marks=new int[5];                 //instance array variable
	name.marks[4]=45;
//	name.marks[6]=45;
	name.marks=new int[10];
	for(int j=0;j<10;j++) {
		//System.out.println(name.marks[j]);
	}
	
	
	//System.out.println(percentage[0]);          //we will gwt null poiunt errror if we access without initilization and size chya baher boundry error
	
	
	
	//iterating array through foreach group
	
	
	for(int i:name.marks) {
		System.out.println(i);
	}
	
	System.out.println(Arrays.toString(rollno));
	}

}
