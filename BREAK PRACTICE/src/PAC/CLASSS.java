package PAC;

public class CLASSS {
	public int b;
	public int a;
	public int c;
	public void m1(double d,int e) {
		double f=d*e;
		System.out.println("multiplication of d and e is"+f);
	}
	public static double m2(int g,int h) {
		int i=g+h;
		System.out.println("addition of g and h is"+i);
		return g+h;
	}
	private void m3(int j,double k) {
		double l=j-k;
		System.out.println("subtraction of j and k"+l);
	}
	public static void main(String[] args) {
		CLASSS obj=new CLASSS();
		obj.m1(100, 100);
		m2(60, 40);
		double patil=m2(999, 1);
		obj.m1(patil, 45);
		obj.m3(5001, 1);
		obj.m3(10000, patil);
	}
}
