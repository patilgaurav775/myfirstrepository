import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class call_object {
	
	public call_object() {
		System.out.println("i am call object constructor");
	}
	
	public static Object abc() {
		call_object name = new call_object();
		return name;
	}
	
}

class def{
	public static List<Integer> c=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		call_object obj=new call_object();
		def oo=new def();
		//System.out.println(obj.abc());
		System.out.println(def.name(c));
		System.out.println(present(c, 6));
	}
	
	public static String name(List<Integer> b) {
		
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		//System.out.println(b);
		for(int i=0;i<b.size();i++) {
		if (b.get(i)%2!=0) {
			System.out.println(b.get(i));
			
		} 
		
		}
		return " ";
	}
	
public static String present(List<Integer> b,int c) {
		
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		//System.out.println(b);
		for(int i=0;i<b.size();i++) {
		if (b.get(i)==c) {
			return "yes present";
			
		} 
		
		}
		return "not present";
	}
}


