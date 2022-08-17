package WrapperClass;

public class Wrapper2 {

	public static void main(String[] args) {
		
		char c = 'A';
		
		// explicit boxing 
		Character c1 = new Character(c);
		Character c2 = new Character('A');
		
		//Auto boxing or implicit boxing
		Character c3 = c;
		Character c4 = 'A';
		
		System.out.println("c: "+c+"\nc1: "+c1+"\nc2: "+c2+"\nc3: "+c3+"\nc4: "+c4);
		System.out.println("------");
		
		Character c5 = new Character('Z');
		char c6 = c5.charValue();
		System.out.println("c6: "+c6+"\nc5: "+c5);
		System.out.println(c5==c6);
		System.out.println(c5.equals(c6));
	}

}
