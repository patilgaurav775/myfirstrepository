package pankaj;

public class returnarrythroughmethod {
	
	public static int array[]= {65,78,95,65,25,45};
	public static int[] name() {
		
		
		return array;
	}
	
	public static void main(String[] args) {
		int[] b = name();
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	 	
		
		
	}

}
