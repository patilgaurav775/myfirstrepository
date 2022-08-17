package PRACTICE;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ANNOTATIONS {
	
	@Test(priority = 1)
	  public void test1() {
		  System.out.println("i am test case 1");
	  }
	
	@Test(priority = 2)
	  public void test2() {
		
		  System.out.println("i am test case 2");
	  }
	
	@Test
	  public void test3() {
		
		  System.out.println("i am test case 3");
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

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("i am before Test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("i am after Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("i am before Suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("i am after Suite");
	  }

}
