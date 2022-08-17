package PRACTICE;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DATA_PROVIDER {
//by avoiding loop we can use dataprovider
	public static int a=10;
	static public int b=10;
	public final static int c=10;
	static public final int d=10;
	
	
	@DataProvider(name="login data provider")
	public Object[][] get_data(){
		Object[][] data= {{"abc@123",123,"user1"}, {"def@123",456,"user2"}, {"ghi@123",789,"user3"}};
		return data;
	}
	
	@Test (dataProvider ="login data provider")
	public void login_test(String user , int pass,String User) {
		System.out.println(user+"        "+pass+"        "+User);
		
	}
}

class two{
		@Test (dataProvider ="login data provider",dataProviderClass  = DATA_PROVIDER.class)
		public void login_test(String user , int pass) {
			System.out.println(user+"        "+pass);
		}
		
}
