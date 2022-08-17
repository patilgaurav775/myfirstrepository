package Practice;

public class Stringcharnumbers {

	public static void method1() {
		String s = "c15da3";

		StringBuffer str = new StringBuffer();
		StringBuffer num = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				num.append(s.charAt(i));
			} else if (Character.isAlphabetic(s.charAt(i))) {
				str.append(s.charAt(i));
			}
		}
		System.out.println(num + " ");
		System.out.println(str + " ");

	}

	public static void main(String[] args) {

		method1();

	}

}
