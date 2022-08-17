package PRACTICE;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;

public class ASSERTS {

	@Test()
	  public void test1() {
		
		SoftAssert asser=new SoftAssert();
		asser.assertEquals("gaurav", "GAURAV", "name is wrong");	
		  System.out.println("i am test case 1");
		  asser.assertAll("soft assert message");        //***************************assert all kele tevhach eror disto
	  }
	
	@Test
	  public void test2() {
		  System.out.println("i am test case 2");
	  }
	
	@Test
	  public void test3() {
		  System.out.println("i am test case 3");
	  }
}
