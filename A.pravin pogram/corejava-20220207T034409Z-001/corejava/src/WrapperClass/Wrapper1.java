package WrapperClass;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 50;
		
		//converting int primitive data type into Integer wrapper class
		
		// explicit boxing 
		Integer i = new Integer(x);
		Integer j = new Integer(50);
		
		//Auto boxing or implicit boxing
		Integer k = x;
		Integer l = 50;
		
		System.out.println("x: "+x+"\ni: "+i+"\nj: "+j+"\nk: "+k+"\nl: "+l);
		System.out.println("-----");
		//or
		System.out.println("x: "+x);
		System.out.println("i: "+i);
		System.out.println("j: "+j);
		System.out.println("k: "+k);
		
		//converting Integer wrapper class into int primitive data type 
		
		// explicit unboxing
		System.out.println("-----");
		
		Integer m = new Integer(10);
		int n = m.intValue();
		
		System.out.println("n: "+n);
		System.out.println("m: "+m);
		
		System.out.println(m.equals(n));
		System.out.println(m==n);
		
		System.out.println("-----");
		
		Integer o = new Integer(x);
		int p = o.intValue();
		
		System.out.println("p: "+p);
		System.out.println("o: "+o);
		
		System.out.println(o.equals(p));
		System.out.println(p==o);
		
		System.out.println("-----");
		
	}

}
