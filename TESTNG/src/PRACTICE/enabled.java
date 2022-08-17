package PRACTICE;

import java.util.NoSuchElementException;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import net.jodah.failsafe.Fallback;

public class enabled {

	@Ignore
	@Test(dependsOnMethods ="m2",alwaysRun = true)
	public void m1() {
		System.out.println("i am from m1");
	}
	
	@Test(enabled = true)
	public void m2() {
		System.out.println("i am from m2");
		throw new SkipException("method is skipped");
		// throw new NoSuchElementException("no such element exception");
		}

	
}
