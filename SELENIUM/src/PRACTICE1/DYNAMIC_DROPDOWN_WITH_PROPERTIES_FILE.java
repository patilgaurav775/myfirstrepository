package PRACTICE1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DYNAMIC_DROPDOWN_WITH_PROPERTIES_FILE {

	public static WebDriver driver;
	public static Properties prop;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("dateAndTimePickerInput")).click();
		prop_file();
		
		String month=prop.getProperty("month");
		String year=prop.getProperty("year");
		String date=prop.getProperty("date");
		String time=prop.getProperty("time");
		
		
		while(true) {
			WebElement header=driver.findElement(By.xpath("//div[contains(@class,'hasYearDropdown')]"));
			String a=header.getText();
			String[] b=a.split(" ");
			if (b[0].equalsIgnoreCase(month)&&b[1].equalsIgnoreCase(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//button[text()='Previous Month']")).click();
			}
		}
		
		
		
		int i=0;
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,300)");
		List<WebElement> lst=driver.findElements(By.xpath("//div[@role='option']"));
		for(i=0;i<lst.size();i++) {
			if (date.equalsIgnoreCase(lst.get(i).getText())) {
			lst.get(i).click();
			}
		}
		
		List<WebElement> duration=driver.findElements(By.xpath("//li[@class='react-datepicker__time-list-item ']"));
		for(i=0;i<duration.size();i++) {
			try{if (time.equalsIgnoreCase(duration.get(i).getText())) {
				duration.get(i).click();
			
			}
		}
		catch (Exception e) {
			System.out.println("Exception handeled");
		}
		
			driver.quit();
		
		}
		

	}
	public static void  prop_file() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(".\\src\\CONFIG\\date.properties");
			prop.load(fis);
		}
		catch (IOException e) {
			
		}
	}

}
