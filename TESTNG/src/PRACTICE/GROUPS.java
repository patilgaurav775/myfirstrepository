package PRACTICE;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GROUPS {
	
	@Test(groups = {"sanity","smoke","regression"})
	public void t1() {
		System.out.println("i am from common suite");
	}

	@Test(groups = {"sanity"})
	public void t2() {
		System.out.println("i am from test 2");
	}

	@Test(groups = {"smoke","regression"})
	public void t3() {
		System.out.println("i am from test 3");
	}
	
	@Test(groups = {"sanity"})
	  public void test4() {
		  System.out.println("i am test case 4");
	  }
	
	@Test(groups = {"smoke","regression"})
	  public void test5() {
		  System.out.println("i am test case 5");
	  }
	
	@Test(groups = {"regression"})
	  public void test6() {
		  System.out.println("i am test case 6");
	  }
}
