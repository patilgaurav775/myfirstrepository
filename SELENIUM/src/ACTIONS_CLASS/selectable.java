package ACTIONS_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectable {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demoqa.com/selectable");
		 driver.manage().window().maximize();
		 
		 WebElement cras=driver.findElement(By.xpath("//li[text()='Cras justo odio']"));
		 cras.click();
		 System.out.println(cras.getText());
		 Thread.sleep(3000);
		 
		 WebElement dap=driver.findElement(By.xpath("//li[text()='Dapibus ac facilisis in']"));
		 dap.click();
		 System.out.println(dap.getText());
		 Thread.sleep(3000);
		 
		 WebElement mor=driver.findElement(By.xpath("//li[text()='Morbi leo risus']"));
		 mor.click();
		 System.out.println(mor.getText());
		 Thread.sleep(3000);
		 
		 WebElement por=driver.findElement(By.xpath("//li[text()='Porta ac consectetur ac']"));
		 por.click();
		 System.out.println(por.getText());
		 Thread.sleep(3000);

		WebElement grid=driver.findElement(By.xpath("//a[text()='Grid']"));
		grid.click();
		
		WebElement One=driver.findElement(By.xpath("//li[text()='One']"));
		One.click();
		Thread.sleep(3000);
		
		WebElement Three=driver.findElement(By.xpath("//li[text()='Three']"));
		Three.click();
		Thread.sleep(3000);
		
		WebElement Five=driver.findElement(By.xpath("//li[text()='Five']"));
		Five.click();
		Thread.sleep(3000);
		
		WebElement Seven=driver.findElement(By.xpath("//li[text()='Seven']"));
		Seven.click();
		Thread.sleep(3000);
		
		WebElement Nine=driver.findElement(By.xpath("//li[text()='Nine']"));
		Nine.click();
		Thread.sleep(3000);
		
		
		
		
		
	}
}
