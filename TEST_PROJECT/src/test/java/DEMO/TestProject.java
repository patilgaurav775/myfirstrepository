package DEMO;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;


public class TestProject {
	
	  public static void main(final String[] args) throws Exception {
	       // ChromeDriver driver = new ChromeDriver(new ChromeOptions());
		  
		  
		/*  ChromeDriver driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
				  .withRemoteAddress(new URL("http://localhost:8585"))
				  .withToken("L6VcKVqF5ssH4drbR2Ay9aQAp5PDtS5m3MoDkUHEyOc1")
				  .build(ChromeDriver.class);
	        driver.navigate().to("https://example.testproject.io/web/");

	        driver.findElement(By.cssSelector("#name")).sendKeys("Gaurav Patil");
	        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
	        driver.findElement(By.cssSelector("#login")).click();

	        boolean passed = driver.findElement(By.cssSelector("#logout")).isDisplayed();
	        if (passed) {
	            System.out.println("Test Passed");
	        } else {
	            System.out.println("Test Failed");
	        }

	        driver.quit();*/
		  
		  int a=20;
		  int b=20;
		  String name = new String("hello");
		  String name1 = new String("hello");
		  String d="hello";
		  
		  
		  System.out.println(name.equals(name1)+"  name.equals(name1)");
		  System.out.println(name==d+"  name==d");
		  System.out.println(name==name1+"  name==name1");
		  System.out.println(a==b);
		  System.out.println(name.equalsIgnoreCase(d));
	    }

}
