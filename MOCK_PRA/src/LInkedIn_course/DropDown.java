package LInkedIn_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement box=driver.findElement(By.id("dropdownMenuButton"));
		box.click();
		
		driver.findElement(By.xpath("(//a[text()='Modal'])[2]")).click();
		
		driver.quit();

	}

}
