package LInkedIn_course;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement box=driver.findElement(By.id("datepicker"));
		
		box.click();
		/*box.sendKeys("25/09/2022");
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);*/
		String Month="November";
		String Year="2025";
		String date="25";
		
		while(true) {
		WebElement month_year=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
		
		String[] aa=month_year.getText().split(" ");
		
		if (aa[0].equalsIgnoreCase(Month)&&aa[1].equalsIgnoreCase(Year)) {
			break;
		}
		else {
			driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
		}
		
		
		}
		
		List<WebElement> dates=driver.findElements(By.xpath("//td[@class='day']"));
		
		Iterator<WebElement> itr=dates.iterator();
		
		/*while(itr.hasNext()) {
			WebElement a=itr.next();
			String da=(a.getText());
			if (da.equalsIgnoreCase(date)) {
				a.click();
			} 
		}*/
		try{
		for(int i=0;i<dates.size();i++) {
			if (dates.get(i).getText().equalsIgnoreCase(date)) {
				dates.get(i).click();
			}
		}
		}
		catch (StaleElementReferenceException e) {
			
		}
		
		driver.quit();
		
	}

}
