package LInkedIn_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autocomplete {
public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/scroll");
		//driver.navigate().refresh();
		WebElement name=driver.findElement(By.id("name"));
		Actions act=new  Actions(driver);
		act.moveToElement(name).build().perform();
		name.sendKeys("Gaurav");
		WebElement date=driver.findElement(By.id("date"));
		date.sendKeys("25/06/1997");
		driver.quit();//
		
		
	}

}
