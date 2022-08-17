package LISTNERS;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(LISTNERS.custom_listner.class)

public class LISTNER_TEST {

	@Test
	void test1() {
		System.out.println("this is test 1");
		Assert.assertEquals("a", "a");
	}
	
	@Test
	void test2() {
		System.out.println("this is test 2");
		Assert.assertEquals("a", "b");
		
	}
	
	@Test
	void test3() {
		System.out.println("this is test 3");
		throw new SkipException("this method is skippeed");          //TO THROW EXCEPTION EXPLIOCITLY*******************************
	}
	
}
