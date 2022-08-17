package systemclass;

public class System1 {

	public static void main(String args[]) {

		System.out.println("System User Dir: " + System.getProperty("user.home"));
		
		System.out.println("Current Working Dir: " + System.getProperty("user.dir"));

		System.clearProperty("user.home");
		
		System.out.println(System.getProperty("user.home"));

		System.out.println(System.getProperty("user.country"));

		System.setProperty("user.country", "IND");

		System.out.println(System.getProperty("user.country"));

		// checking property other than system property
		// illustrating getProperty(String key, String def)
		System.out.println("other than system property: " + System.getProperty("user.password", "none of your business"));

		System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
				+ System.currentTimeMillis());
		System.out.println("current time in " + "nano sec: " + System.nanoTime());
	}
}
