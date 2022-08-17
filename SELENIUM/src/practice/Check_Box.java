package practice;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Box {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(3000);
		
		WebElement checkbox_home=driver.findElement(By.cssSelector("button[class='rct-collapse rct-collapse-btn']"));
		if (!checkbox_home.isSelected()) {
			checkbox_home.click();
		}
	
		Thread.sleep(3000);

	/*	WebElement checkbox_desktop=driver.findElement(By.cssSelector("span[class=\"rct-text\"]"));
		checkbox_desktop.click();
		Thread.sleep(3000);*/
		
	/*	WebElement checkbox_desktop_click=driver.findElement(By.cssSelector("span[class=\"rct-checkbox\"]"));
		checkbox_desktop_click.click();
		Thread.sleep(3000);*/
		
		WebElement checkbox_desktop_click=driver.findElement(By.cssSelector("button[aria-label=\"Expand all\"]"));
		checkbox_desktop_click.click();
		Thread.sleep(3000);
		
		WebElement checkbox_public_click=driver.findElement(By.cssSelector("label[for='tree-node-public'] span[class='rct-checkbox']"));
		checkbox_public_click.click();
		Thread.sleep(3000);
		
		WebElement checkbox_collaps_click=driver.findElement(By.cssSelector("button[class=\"rct-option rct-option-collapse-all\"]"));
		checkbox_collaps_click.click();
		Thread.sleep(3000);
		
		//driver.quit();
	}

}
