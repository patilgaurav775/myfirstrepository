package fffff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GOOGLE_LAUNCH {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("apj");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/ul/div/ul/li[9]/div//div/div/span/b")).click();
		String place_of_birth=driver.findElement(By.xpath("(//div//a[@class='fl'])[3]")).getText();
		System.out.println("birth place of kalam is :-- "+place_of_birth);
		
	}
}
