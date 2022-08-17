package PRACTICE;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ANNOTATIONS2 {

	@Test(priority = -1)
	  public void test4() {
		  System.out.println("i am test case 4");
	  }
	
	@Test(priority = 0)
	  public void test5() {
		  System.out.println("i am test case 5");
	  }
	
	@Test(priority = 1)
	  public void test6() {
		  System.out.println("i am test case 6");
	  }
	
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("i am before method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("i am after Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("i am before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("i am after Class");
	  }
}
