package LInkedIn_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button_check_box {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		Thread.sleep(1500);
		WebElement option_2=driver.findElement(By.cssSelector("input[value='option2']"));
		option_2.click();
		
		WebElement option_3=driver.findElement(By.cssSelector("input[value='option3']"));
		option_3.click();
		Thread.sleep(1500);
		
		driver.navigate().to("https://formy-project.herokuapp.com/checkbox");
		
		Thread.sleep(1500);
		WebElement check_1=driver.findElement(By.cssSelector("input[value='checkbox-1']"));
		check_1.click();
		
		Thread.sleep(1500);
		WebElement check_2=driver.findElement(By.cssSelector("input[value='checkbox-2']"));
		check_2.click();
		
		Thread.sleep(1500);
		WebElement check_3=driver.findElement(By.cssSelector("input[value='checkbox-3']"));
		check_3.click();
		
		driver.quit();

	}

}
