package method_overiding;

class prani {
	public void sound() {
		System.out.println("hello....");
	}
}
class cat extends prani{
	public void sound() {
		System.out.println("cat sound is meu");
	}
}
class Animal extends prani{
   
	public void sound() {
		System.out.println("bark is sound of dog");
}
	 public static void main(String[] args) {
			Animal name = new Animal();
			cat obj = new cat();
			name.sound();
			obj.sound();
		}
}

