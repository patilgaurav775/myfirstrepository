package MOCKPRACTICE;

import java.util.Scanner;

public class vovel {

	public static void main(String[] args) {
		
		System.out.println("pls enter character");
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		System.out.println(a.concat(" patil"));
		obj.nextLine();
		
		for(char i='a';i<='z';i++) {
		if (i=='a'|| i=='e'||i=='i'||i=='o'||i=='u') {
			System.out.println(i+" is a vovel");
		} 
		else {
			System.out.println(i+" is a consonent");
		}
		}
		
 

		
	}

}
