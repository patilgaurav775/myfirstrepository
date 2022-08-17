package LInkedIn_course;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement choose=driver.findElement(By.xpath("//button[@class='btn btn-secondary btn-choose']"));

		choose.sendKeys("DIFFERENCE BETWEEN COLLECTION AND COLLECTIONS.jpeg");
		
		driver.quit();
	

	}

}
