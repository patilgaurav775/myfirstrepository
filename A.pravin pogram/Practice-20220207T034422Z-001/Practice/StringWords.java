package Practice;

public class StringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am an Indian";
		s.split(" ");
		
		String a [] = s.split(" ");
		int count = 0;
		for(int i=0; i<a.length; i++ ) {
			count++;
		}
		
		System.out.println(count);
/*
		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("number of words in string: " + count);

	}*/
	}
}
