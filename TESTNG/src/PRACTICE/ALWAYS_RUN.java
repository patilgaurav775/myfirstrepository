package PRACTICE;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;



import org.testng.Assert;



public class ALWAYS_RUN {
	
//	@Test(enabled = false)
//	@Ignore          //******************* aapn ignore karu shakto*********************
	  public void test1() {
		  System.out.println("i am test case 1");
	  }
	
	@Test(dependsOnMethods = "test3",alwaysRun  = true)
	  public void test2() {
		  System.out.println("i am test case 2");
	  }

	@Test()
	  public void test3() {
		  Assert.assertEquals("123", "as123");
		  System.out.println("i am test case 3");
	  }

}