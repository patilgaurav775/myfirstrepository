package GARBAGE_COLLECTION;

public class FINALIZE_METHOD {

	private static void name() {
		FINALIZE_METHOD name1 = new FINALIZE_METHOD();
		name1 = null;

	}

	public static void main(String[] args) {
		name(); // NAME1 NULL ZALA

		FINALIZE_METHOD obj = new FINALIZE_METHOD();
		obj = null; // OBJ NULL ZALA

		FINALIZE_METHOD obj1 = new FINALIZE_METHOD();
		FINALIZE_METHOD obj2 = new FINALIZE_METHOD();
		obj2 = obj1; // OBJ2 NULL ZALA

		FINALIZE_METHOD obj3 = new FINALIZE_METHOD();
		FINALIZE_METHOD obj4 = new FINALIZE_METHOD();
		FINALIZE_METHOD obj5 = new FINALIZE_METHOD();
		FINALIZE_METHOD obj6 = new FINALIZE_METHOD();
		obj3 = obj4; // OBJ3 NULL ZALA
		obj5 = obj6; // OBJ5 NULL ZALA

		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
// TODO Auto-generated method stub
		System.out.println("i am from finalize"); // 5 OBJECTS GOT NULL SO "I AM FROM FINALIZE"
													// WILL PRINT 5 TIMES.
	}
}
