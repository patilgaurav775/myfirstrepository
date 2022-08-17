package fffff;


	
	
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Samsung_Mobile_Buy {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			
			String id=driver.getWindowHandle();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
			//driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oneplus mobile");
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
			Thread.sleep(3000);
			
			
			List<WebElement> arrow=driver.findElements(By.cssSelector("svg[class='RWB9Wm']"));
			Iterator<WebElement> itr=arrow.iterator();
			while(itr.hasNext()) {
				itr.next().click();
				break;
			}
		
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Samsung']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[text()='VIEW ALL'])[1]")).click();
			Thread.sleep(5000);
			
			JavascriptExecutor ss=driver;
			WebElement Element=driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy A73 5G (Awesome Mint, 128 GB)']"));
			 ss.executeScript("arguments[0].scrollIntoView();", Element);
			 Element.click();
			 Thread.sleep(5000);
			
			 
			 Set<String> a= driver.getWindowHandles();
			Iterator<String> itr1=a.iterator();
			while(itr1.hasNext()) {
			String b=itr1.next().toString();
			
			if(!id.equals(b)) {
				driver.switchTo().window(b);
				driver.findElement(By.xpath("//li[@id='swatch-1-storage']//a")).click();
				 Thread.sleep(5000);
				 System.out.println( driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText());
				
				 Thread.sleep(2000);
				 System.out.println("Price of Mobile In RS- "+driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText());
				 
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("//span[@class='_3IIjhd']")).click();
				 System.out.println("**WARRENTY INFO.**");
				 System.out.println(driver.findElement(By.xpath("//div[@class='uqSNrx']")).getText());

				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _1KAjNd']")).click();
				Thread.sleep(2000);
				ss.executeScript("window.scrollBy(0,500)");
				List<WebElement> feature= driver.findElements(By.xpath("//li[@class='_21Ahn-']"));
				
				System.out.println("**SEPECIFICATION**");
				Iterator<WebElement> itr2=feature.iterator();
				 while(itr2.hasNext()) {
					 System.out.println(itr2.next().getText());
				 }
				 
				ss.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				 
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				Thread.sleep(3000);
				driver.navigate().back();
			}
			
			
			}
			
			 
			}

}
