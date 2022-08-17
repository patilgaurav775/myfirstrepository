package EXCEPTION;

public class throwkeyword {

	public static void main(String[] args) {
		throwkeyword name = new throwkeyword();
		name.auth("wwuwu", "");
	}
	public void auth(String username,String password) {
			try {
			if (password.isEmpty()) {
				throw new NullPointerException();		//forcefullly exception dila aahe yamadhe
			}
			else {
				System.out.println("");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();                                      //name,discription,location
			System.out.println(e.toString());                  //name location 
			System.out.println(e.getMessage());				//discription
			System.out.println("password must not be empty");
		}
		System.out.println("this is auth methood ");
		
	
		
		
		
	}

}
