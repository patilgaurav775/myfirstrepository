import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Eleminate_word_in_statement {

	public static void main(String[] args) {
		String a = "Welcome Gaurav Sanjay Patil";

		String[] b = a.split(" ");
		
		for(int i=0;i<b.length;i++) {
			if (b[i].equalsIgnoreCase("Sanjay")) {
				System.out.println(b[i]);
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			if (!b[i].equals("Sanjay") && !b[i].equals("Patil")) {
				System.out.println(b[i] + " ");
			}

		}
		System.out.println("  ");
		List<String> c = new LinkedList<String>(Arrays.asList(b));
		for (int i = 0; i < c.size(); i++) {
			if (!c.get(i).equals("Sanjay") && !c.get(i).equals("Patil")) {
				System.out.println(c.get(i) + " ");
			}

		}
		System.out.println();
		Set<Integer> st=new LinkedHashSet<Integer>();
		
		st.add(11);
		st.add(11);
		st.add(22);
		System.out.println(st.toString());
		
	}

}
