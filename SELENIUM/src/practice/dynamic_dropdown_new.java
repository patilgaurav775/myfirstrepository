package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown_new {
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
		
		String year="2024";
		String month="December";
		String date="24";
		String time="23:45";
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		
		//month and year
		while(true) {
			String str=driver.findElement(By.xpath("//div[contains(@class,'hasYearDropdown')]")).getText();
			String[] array=str.split(" "); 
			
			if (array[0].equalsIgnoreCase(month)&&array[1].equalsIgnoreCase(year)) {
				break;
			} 
			else {
				driver.findElement(By.xpath("//button[text()='Next Month']")).click();
			}
		}
		
		//date
		List<WebElement> day=driver.findElements(By.xpath("//div[@role='option']"));
		for(int i=0;i<day.size();i++) {
			if (date.equalsIgnoreCase(day.get(i).getText())) {
				day.get(i).click();
			}
		}
		
		//time
		List<WebElement> duration=driver.findElements(By.xpath("//li[@class='react-datepicker__time-list-item ']"));
		for(int i=0;i<duration.size();i++) {
			if (time.equalsIgnoreCase(duration.get(i).getText())) {
				duration.get(i).click();
			}
		}
		
	}

}
