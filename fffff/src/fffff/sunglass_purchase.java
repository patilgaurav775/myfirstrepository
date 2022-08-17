package fffff;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class sunglass_purchase {
	public static WebDriver driver;
	
	@BeforeClass(   )
	public static void launch() {
		System.setProperty("webdriver.chrome.driver",".//Resources//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		}
	
	@Test(priority = 1)
	public static void m() {
		if (driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).isDisplayed()) {
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		}
		else {
			System.out.println("element is not displayed");
		}
	}
	
	@Ignore
	@Test()
	public static void m1() {
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("sunglass");
		//WebElement sunglass_for_main=driver.findElement(By.xpath("(//div[@class=\"lrtEPN _17d0yO\"])[1]"));
		
			Keys a=Keys.ENTER;
			driver.switchTo().activeElement().sendKeys(a);
			
	}
	@Ignore
	@Test()
	public static void range_set() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select min=new Select(driver.findElement(By.cssSelector("div[class='_1YAKP4'] select[class='_2YxCDZ']")));
		min.selectByValue("300");
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		Select max=new Select(driver.findElement(By.cssSelector("div[class='_3uDYxP'] select[class='_2YxCDZ']")));
		max.selectByValue("1000");
		try {
		jsv.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@class='_24_Dny _3tCU7L']")));
		
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.out.println("clicked inturrpted");
		}
		
		WebElement fast_track=driver.findElement(By.xpath("//div[text()='Fastrack']"));
		jsv.executeScript("arguments[0].click();",fast_track);
		//jsv.executeScript("argument[0].scrollIntoView();",fossil);
		//fast_track.click();
		
		//jsv.executeScript("window.scrollBy(0,600);");
	
		//WebElement glass=driver.findElement(By.cssSelector("div div a[href^='/fastrack-aviator-sunglasses/p/itm047bd71f167bb?pid=SGLFKYGHKP4'] div[class='_3ywSr_']"));
		driver.navigate().refresh();
		try{jsv.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector("div div a[href^='/fastrack-aviator-sunglasses/p/itm047bd71f167bb?pid=SGLFKYGHKP4'] div[class='_3ywSr_']")));
		}
		catch (Exception e) {
			
			System.out.println("no such element Exception");
		}
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("div div a[href^='/fastrack-aviator-sunglasses/p/itm047bd71f167bb?pid=SGLFKYGHKP4'] div[class='_3ywSr_']")).click();

		Set<String> handles=driver.getWindowHandles();
		
		List<String> list=new LinkedList<String>(handles);
		
		driver.switchTo().window(list.get(1));		
		
		WebElement name=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		
		System.out.println("name of goggle is "+name.getText());
	
		WebElement value=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		
		System.out.println("value of goggle is "+value.getText());
		
		jsv.executeScript("window.scrollBy(0,400);");
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		driver.findElement(By.xpath("(//button[@class='_23FHuj'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	
		driver.close();
		
		driver.switchTo().window(list.get(0));
		
		jsv.executeScript("window.scrollBy(0,400);");
	
		driver.findElement(By.xpath("(//div[@class='_4921Z t0pPfW'])[7]")).click();
			
	//	driver.switchTo().activeElement().sendKeys(Keys.END);	
		
	//	driver.switchTo().activeElement().sendKeys(Keys.HOME);	
		
		//driver.quit();
	}
	
	@Test(priority = 2)
	public static void powerbank() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		//jsv.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//a[@href=\"/\"])[1]")));
 		List<WebElement> lst=driver.findElements(By.cssSelector("div[class='xtXmba']"));
 		//Iterator<WebElement> itr=lst.iterator();
 		
 		Actions act=new Actions(driver);
 		for(int i=0;i<lst.size();i++) {
 			if (lst.get(i).getText().equalsIgnoreCase("Electronics")) {
				act.clickAndHold(lst.get(i)).build().perform();
				
			}
 		}
 		Thread.sleep(3000);
 		WebElement powerbank=driver.findElement(By.xpath("(//div[@class='_3XS_gI _7qr1OC']//a)[10]"));
 		System.out.println(powerbank.getText());
 			powerbank.click();
 			jsv.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//a[@title='realme 10000 mAh Power Bank (18 W, Quick Charge 3.0)'])[1]")));
 		
 			jsv.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//a[@title='realme 10000 mAh Power Bank (18 W, Quick Charge 3.0)'])[1]")));
 			
 			Set<String> st=driver.getWindowHandles();
 			List<String> ls=new LinkedList<String>(st);
 			driver.switchTo().window(ls.get(1));
 			
 			//jsv.executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
 			
 			WebElement buynow=driver.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']"));
 			buynow.click();
 			
 			
 			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
 			
 			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8806699604");
 			
 			driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
 			
 			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gaurav@123");
 			
 			driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
 			
 			driver.findElement(By.xpath("//button[@class='_2KpZ6l RLM7ES _3AWRsL']")).click();
 			
	}
}
