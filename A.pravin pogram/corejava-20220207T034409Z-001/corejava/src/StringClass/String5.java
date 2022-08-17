package StringClass;

public class String5 {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("hello ");
		sb.append("java");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("hello java");
		System.out.println(sb1);
		
		System.out.println(sb.equals(sb1)); // compare based on address 
		System.out.println(sb==sb1);       //  compare based on address
		
		if(sb.compareTo(sb1) == 0){
			System.out.println("sb & sb1 are equals");
		}else
			System.out.println("sb & sb1 are not equals");
		
		 //stringBuilder class not overriding equals method so we cannot use equals method directly
		System.out.println((sb.toString().equals(sb1.toString())));
		
	}

}
