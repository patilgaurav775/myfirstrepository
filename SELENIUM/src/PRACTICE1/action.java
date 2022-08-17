package PRACTICE1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class action {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		Actions action=new Actions(driver);
		
		Action a=action.contextClick(driver.findElement(By.id(""))).build();
		
		a.perform();
		
		
	}

}
