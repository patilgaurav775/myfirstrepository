package Elements;
interface inter{
	void a();
	public abstract int aaa();
}

interface inter1 extends inter{
	void a();
	public abstract int aaa();
}

interface inter2 extends inter1,inter{
	void a();
	public abstract int aaa();
}

 class claa{
	public static void name() {
		System.out.println("name");
	} 
}
public  class revision extends claa implements inter{
	
	public revision() {
		
	}
	
	
		

	public static void main(String[] args) {
		name(10,2,'/');
		
	}
	
	public static void name(int a,int b,char sign) {

		switch(sign) {
		
		case '+':
			System.out.println(a+b);
			
		case '-':
			System.out.println(a-b);
			
		case '*':
			System.out.println(a*b);
			
		case '/':
			System.out.println(a/b);
			
		}
	}
	
	public static int k1() {
		System.out.println("hello k1");
		
		return 10;
		
	}
	
	public static int k() {
		System.out.println("hello k");
		return k1();
		
	}




	public void a() {
		// TODO Auto-generated method stub
		
	}




	public int aaa() {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
