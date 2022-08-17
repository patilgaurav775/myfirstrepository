package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,100);");
		Thread.sleep(3000);
		
		WebElement button_module=driver.findElement(By.id("item-4"));
		button_module.click();
		Thread.sleep(3000);

		WebElement click_me=driver.findElement(By.xpath("//button[text()='Click Me']"));
		click_me.click();        //button chi id change hot aahe refresh kel ki
		Thread.sleep(3000);
		
		WebElement Text_message_after_click=driver.findElement(By.id("dynamicClickMessage"));
		System.out.println(Text_message_after_click.getText());
		
		
		
		
		
		
	}

}
