package method_overiding;

class tree {
	public child taste() {
		 child obj = new child();
		return obj;
	}
	
	public void leafs() {
		
	}

}
public class mango extends tree{
	public parent taste() {
		parent obj=new parent();
		obj.m1();
		return obj;
	}
	public static void main(String[] args) {
		System.out.println("i am a boy");
	}
}