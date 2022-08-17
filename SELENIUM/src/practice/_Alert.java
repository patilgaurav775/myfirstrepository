package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
	    
		WebElement text=driver.findElement(By.xpath("//span[text()='Click Button to see alert ']"));
		System.out.println(text.getText());
		
		WebElement click=driver.findElement(By.id("alertButton"));
		click.click();
	
		Alert obj=driver.switchTo().alert();
		System.out.println(obj.getText());
		obj.accept();
		System.out.println();
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		WebElement text_after_5_seconds=driver.findElement(By.xpath("//span[text()='On button click, alert will appear after 5 seconds ']"));
		System.out.println(text_after_5_seconds.getText());
		
		WebElement click1=driver.findElement(By.id("timerAlertButton"));
		click1.click();
		
		
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println();
		WebElement text_confirm=driver.findElement(By.xpath("//span[text()='On button click, confirm box will appear']"));
		System.out.println(text_confirm.getText());
		
		
		WebElement click2=driver.findElement(By.id("confirmButton"));
	    click2.click();
	    System.out.println(obj.getText());
	    obj.accept();
	    WebElement Text_after_click2=driver.findElement(By.id("confirmResult"));
	    System.out.println(Text_after_click2.getText());
	    System.out.println();
	    
	    //WebElement click2_cancel=driver.findElement(By.id("confirmButton"));
	    System.out.println(text_confirm.getText());
	    click2.click();
	    System.out.println(obj.getText());
	    obj.dismiss();
	    System.out.println(Text_after_click2.getText());
	    System.out.println();
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		WebElement text_prompt=driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']"));
		System.out.println(text_prompt.getText());

		 WebElement click3=driver.findElement(By.id("promtButton"));
		 click3.click();
		 
		 System.out.println(obj.getText());
		 obj.sendKeys("hello lucifer");
		 obj.accept();
		 
		 WebElement Text_after_click3=driver.findElement(By.id("promptResult"));
	    System.out.println(Text_after_click3.getText());
	    
	    
	    
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
