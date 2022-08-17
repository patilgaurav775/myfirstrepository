package operator;

import java.util.Iterator;

public class forloop {

	public static void main(String[] args) {
		//when you have to run some set of statement or code multiple times then we use loop i.e 1 to 10000
		for (int i=1;i<=10;i++)   //ihave one variable i its value is 1;run code till value comes 10; increament or decrement
		{
			System.out.println(i);
		}
		int g=10;           //we can initiize outside the loop also
		for (;g>=1;g--)   //ihave one variable i its value is 1;run code till value comes 10; increament or decrement
		{
			System.out.println(g);
		}
		for (int c=25;50>=c;c++)
		{
			System.out.println(c);
		}
		for(int q=25;q>=1;q-=2)
		{
			System.out.println(q);
		}
		for (int z=25;50>=z;z+=2)
		{
			System.out.println(z);
		}
		for (int t=100;t>=1;t--) {
		System.out.println(t);
	    }
		for (int r=1;100>=r;r++)
		{
		System.out.println(r);
		}
		for (int p=200;p>=100;p-=5) {
		System.out.println(p);
		}
		
		
		int gaurav=500;
		do {
			System.out.println(gaurav);
			gaurav-=5;
		} while (gaurav>=1);
		
		int bp=0;
		while(bp<=500) {
			System.out.println(bp);
			bp+=5;
		}
		
		for(int h=1000;h>=1;h-=100) {
			System.out.println(h);
		}
}
}
