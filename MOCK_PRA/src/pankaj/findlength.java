package pankaj;

public class findlength {
public static int rollno[];
	
	public static int employee[][];
	public static void main(String[] args) {
		//FIND LENGTH OF ARRAY IN JAVA
		rollno=new int[10];
		System.out.println("length of array roll no is"+rollno.length); 
		employee=new int[3][2];			//aani array chi cpacity ashi lihitat
		
		System.out.println("length of array employee row is"+employee.length);
		System.out.println("length of array employee column is"+employee[1].length);

	}

}
