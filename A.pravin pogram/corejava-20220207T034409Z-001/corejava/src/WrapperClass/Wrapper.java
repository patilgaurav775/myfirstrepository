package WrapperClass;

public class Wrapper {

	public static void main(String[] args) {
	
		long aa = 500;
		
		Long bb = new Long(aa);
		Double cc = new Double(aa);
		
		System.out.println("aa: "+aa+"\nbb: "+bb+"\ncc: "+cc);
		System.out.println("-------");
		
		Float ff = new Float(aa);
		int ii = ff.intValue();
		System.out.println("ii: "+ii+"\nff: "+ff);
		System.out.println(ii==ff);
		
		
		

	}

}
