package fffff;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _001 {
public static WebDriver driver;




@BeforeClass()
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}

@Test(priority = 1)
public static void mobile_click() throws InterruptedException {
	WebElement cross_button=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	cross_button.click();
	Thread.sleep(2000);
	String module_name="Mobiles";
	
	List<WebElement> mobile=driver.findElements(By.xpath("//div[@class='xtXmba']"));
	
	
	
	for(int i=0;i<mobile.size();i++) {
		if (mobile.get(i).getText().equalsIgnoreCase(module_name)) {
			mobile.get(i).click();
		}
	}
	Thread.sleep(4000);
	WebElement taskbar_after_click__on_mobile=driver.findElement(By.xpath("//div[@class='_1kidPb']"));
	
	
	
	if (taskbar_after_click__on_mobile.isDisplayed()) {
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		electronics.click();
		Thread.sleep(4000);
		WebElement samsung=driver.findElement(By.xpath("//a[@title='Samsung']"));
		samsung.click();
	}
	
	Thread.sleep(5000);
	

}

@Test(priority = 2)
public static void mobile_select() throws InterruptedException {
	String now=driver.getWindowHandle();
	//String mobile_name="SAMSUNG Galaxy A73 5G (Awesome Mint, 256 GB)";
	
	WebElement view_all=driver.findElement(By.xpath("(//a[@class='_2KpZ6l _3dESVI'])[1]"));
	view_all.click();
	
	Thread.sleep(8000);
	
	WebElement A73=driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy A33 (Awesome Black, 128 GB)']"));
	JavascriptExecutor jsv=(JavascriptExecutor) driver;
	jsv.executeScript("arguments[0].scrollIntoView();", A73);
	A73.click();
	Thread.sleep(5000);
	
	Set<String> next=driver.getWindowHandles();
	Iterator<String> itr=next.iterator();
	while(itr.hasNext()) {
	String b=itr.next().toString();
	
	if (!now.equalsIgnoreCase(b)) {
		driver.switchTo().window(b);
	
	Thread.sleep(5000);
	
	/*WebElement select_storage=driver.findElement(By.xpath("//li[@id='swatch-1-storage']//a"));
	select_storage.click();*/
	
	WebElement ADD_CART=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	ADD_CART.click();
	Thread.sleep(3000);
	
	/*WebElement PLACE_ORDER=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
	PLACE_ORDER.click();*/
	driver.close();

	}
	}
	driver.switchTo().window(now);
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().back();
}

}