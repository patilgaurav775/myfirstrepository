package array;
public class arraybasics {
	/*
	 * when array declared & initialize separately outside method, 
	 * it act like method.
	 * after declaration, initialization should be written in {   }
	 */
	int a[]; {
	a = new int[5];
	}
	public static void main(String[] args) {
		/*
		//declaration
		int a[];
		//size initialization
		a = new int[5];
		*/
		arraybasics obj = new arraybasics();
			//or
		//int a[]=new int[7];//declaration and instantiation  
		obj.a[0]=10;//initialization  
		obj.a[1]=20;  
		obj.a[2]=30;  
		obj.a[3]=40;  
		obj.a[4]=50; 
		//obj.a[5]=60;
		System.out.println("*************After initialization*************");
		System.out.println(obj.a[0]);  
		System.out.println(obj.a[1]);  
		System.out.println(obj.a[2]);  
		System.out.println(obj.a[3]);  
		System.out.println(obj.a[4]);
		
		System.out.println("*****************************");
		System.out.println("Array Element counts: "+obj.a.length);//5
		
		System.out.println("************normal for-loop***************");
//		//traversing array  
		for(int i=0;i<obj.a.length;i++)//length is the property of array  
		{
			System.out.println(obj.a[i]);  
		}
		System.out.println("**************for-each loop*************");
		for(int num: obj.a) {
			System.out.println(num);
		}
	}
}

