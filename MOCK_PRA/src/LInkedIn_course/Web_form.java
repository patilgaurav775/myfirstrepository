package LInkedIn_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_form {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://formy-project.herokuapp.com/form");
		
		WebElement first=driver.findElement(By.id("first-name"));
		first.sendKeys("Gaurav");
		WebElement last=driver.findElement(By.id("last-name"));
		last.sendKeys("patil");
		WebElement job_title=driver.findElement(By.id("job-title"));
		job_title.sendKeys("tester");
		WebElement college=driver.findElement(By.id("radio-button-2"));
		college.click();
		WebElement male=driver.findElement(By.id("checkbox-1"));
		male.click();
		Select slt=new Select(driver.findElement(By.id("select-menu")));
		slt.selectByValue("2");
		
		WebElement date_picker=driver.findElement(By.id("datepicker"));
		date_picker.click();
		
		String Month="September";
		String year="2022";
		String dat="25";
		while(true) {

			WebElement date=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
			String[] str=date.getText().split(" ");
			
			if (str[0].equalsIgnoreCase(Month)&&str[1].equalsIgnoreCase(year)) {
				break;
			} else {
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			}
		}
		
		List<WebElement> lst=driver.findElements(By.xpath("//td[@class='day']"));
		try{for(int i=0;i<lst.size();i++) {
		if (lst.get(i).getText().equalsIgnoreCase("25")) {
			lst.get(i).click();
		}
	}}
		catch (Exception e) {
			
		}
		
		WebElement submit=driver.findElement(By.cssSelector("a[role='button']"));
		submit.click();
		if (driver.findElement(By.tagName("h1")).isDisplayed()) {
			driver.quit();
		}
		
		
		
		

}
}
