package PRACTICE;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DEPENDS_ON {

		@Ignore
		@Test()
		  public void test1() {
			  System.out.println("i am test case 1");
		  }
		@Ignore
		@Test(enabled = true,dependsOnMethods  = "test3",alwaysRun = true)
		  public void test2() {
			  System.out.println("i am test case 2");
		  }
		
		@Test
		  public void test3() {
			Assert.assertEquals(true, false);
			  System.out.println("i am test case 3");
		  }
	

	}

