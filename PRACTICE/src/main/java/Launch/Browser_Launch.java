package Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Browser_Launch {
	public static WebDriver driver;
	public static JavascriptExecutor jsv;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", ".//src//test//resources//RESOURSES//chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		jsv=(JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("(//div[@class='card-body'])[1]")).click();
	}

}
