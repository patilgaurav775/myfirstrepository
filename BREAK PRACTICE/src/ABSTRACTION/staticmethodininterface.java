package ABSTRACTION;

public interface staticmethodininterface {
		void add(int a,int b);  //public abstract void add(int a,int b);
		default void sub(int a, int b) {	//public default void sub()
			System.out.println("substraction"+(a-b));
		}
		static void multiply(int a, int b) {
			System.out.println("multiply"+(a*b));
		}
		
}


