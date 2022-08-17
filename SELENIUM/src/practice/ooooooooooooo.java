package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ooooooooooooo {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement element=driver.findElement(By.xpath("//h5[text()='Elements']"));
		jsv.executeScript("window.scrollBy(0,200)");
		element.click();
		
	
		jsv.executeScript("window.scrollBy(0,600)");
		
		WebElement widget=driver.findElement(By.xpath("//div[@class='element-group'][4]"));
		widget.click();
		Thread.sleep(3000);
		
		jsv.executeScript("window.scrollBy(0,600)");
		WebElement date_picker=driver.findElement(By.xpath("//span[text()='Date Picker']"));
		date_picker.click();
		
		String month="December";
		String year="2024";
		String date="24";
		String time="10:00";
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		
		while(true) {
			String str=driver.findElement(By.xpath("//div[contains(@class,'hasMonthDropdown')]")).getText();
			String[]  sp=str.split(" ");
			if (sp[0].equalsIgnoreCase(month)&&sp[1].equalsIgnoreCase(year)) {
				break;
			} 
			else {
				driver.findElement(By.xpath("//button[text()='Next Month']")).click();
			}
		}
		
		List<WebElement> tarik=driver.findElements(By.xpath("//div[@role='option']"));
		
		for(int i=0;i<tarik.size();i++) {
			if (date.equalsIgnoreCase(tarik.get(i).getText())) {
				tarik.get(i).click();
			}
		}
		
		List<WebElement> vel=driver.findElements(By.xpath("//li[@class='react-datepicker__time-list-item ']"));
		for(int i=0;i<vel.size();i++) {
			if (time.equalsIgnoreCase(vel.get(i).getText())) {
				vel.get(i).click();
			}
		}
		
		
		
		

	}

}
