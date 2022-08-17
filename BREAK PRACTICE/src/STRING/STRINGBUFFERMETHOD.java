package STRING;

public class STRINGBUFFERMETHOD {
static String gaurav="hello";
	public static void main(String[] args) {
		//stringbuffer is mutable and string is immutable
		// TO GET THE ACCESS OF STRING BUFFER WE NEED TO CREATE OBJECT
		//OBJ WITH SRING AS NO PARAMERTER CONSTRUCTOR
		StringBuffer obj=new StringBuffer();
		System.out.println(obj.length());
		
		//OBJ WITH SRING AS PARAMERTER CONSTRUCTOR
		StringBuffer obj1=new StringBuffer("THIS IS FOR STRING");
		System.out.println(obj1.length());
		
		System.out.println(obj1.append( 123456));  //last la join karnyasathi 
		System.out.println(obj1.append(false));
		
		System.out.println(obj1.delete(0, 4));    //o to 3 paryant index wale character delet hotil
		System.out.println(obj1.deleteCharAt(4));  //4 no cha delete hoil fact
		
		System.out.println(obj1.insert(4, "F"));     //to insert int string whatever you want
		
		System.out.println(obj1.replace(0, 10, "string"));		//0 to 10 delete kele aani string naav takal
		
		System.out.println(obj1.reverse());
		
		System.out.println(Character.isDigit('6'));    //digit aahe ki nahi te sangat 6 aahe mahnumn true
		
		System.out.println(Character.isAlphabetic('R'));  //alphabet aahe ki nahi te sangat R aahe mahnun true
		
		
	}

}
