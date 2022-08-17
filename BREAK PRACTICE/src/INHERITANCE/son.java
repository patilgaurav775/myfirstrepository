package INHERITANCE;
class father{
	public void car() {	
	}
}


public class son extends father {    //single level inheritance

	public static void main(String[] args) {
		System.out.println();
	}
	
}


class grf extends son{  //multilevel inheritance


	public static void main(String[] args) {
		System.out.println("i am from grandfather");
	}

}