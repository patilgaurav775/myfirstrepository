package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;

public class FORM {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		WebElement first_name = driver.findElement(By.id("firstName"));
		first_name.sendKeys("GAURAV");
		Thread.sleep(3000);

		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("PATIL");
		Thread.sleep(3000);

		WebElement email_text = driver.findElement(By.id("userEmail-label"));
		System.out.println(email_text.getText());
		Thread.sleep(3000);

		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys("PATILGAURAV775@GMAIL.COM");
		Thread.sleep(3000);

		WebElement gender_text = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		System.out.println(gender_text.getText());
		Thread.sleep(3000);

		WebElement gender_radio = driver.findElement(By.cssSelector(
				"div[class=\"custom-control custom-radio custom-control-inline\"] label[for=\"gender-radio-1\"]"));
		gender_radio.click();
		Thread.sleep(3000);

		WebElement mobile_number = driver.findElement(By.id("userNumber"));
		mobile_number.sendKeys("8806699604");
		Thread.sleep(3000);

		WebElement date_of_birth = driver.findElement(By.id("dateOfBirthInput"));
		date_of_birth.click();

		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByValue("1997");
		Thread.sleep(3000);

		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText("September");
		Thread.sleep(3000);

		WebElement date = driver
				.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--025']"));
		date.click();
		Thread.sleep(3000);

		WebElement Subject = driver.findElement(By.id("subjectsInput"));
		Subject.sendKeys("CIVIL ENGINEERING");
		Thread.sleep(3000);

		WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		hobbies.click();
		Thread.sleep(3000);

		JavascriptExecutor JSE = (JavascriptExecutor) driver;
		JSE.executeScript("window.scrollBy(0,200);");
		Thread.sleep(2000);

		WebElement advertising = driver.findElement(By.xpath("//img[@alt='adplus-dvertising']"));
		advertising.click();
		Thread.sleep(3000);

		WebElement upload_picture = driver.findElement(By.id("uploadPicture"));
		upload_picture.sendKeys("E:\\GAURAV\\documents\\photo.jpg");
		Thread.sleep(3000);
		

		WebElement permanant_address = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		permanant_address.sendKeys("953,VIVEKANAND NAGAR, BHADGAON ROAD,PACHORA-424201, DIST-JALGAON");
		Thread.sleep(3000);

		WebElement wedget = driver.findElement(By.xpath("//div[text()='Widgets']"));
		wedget.click();
		Thread.sleep(3000);

		JSE.executeScript("window.scrollBy(0,200);");

		WebElement textstate = driver.findElement(By.xpath("//div[@id='state']//div[contains(@class,'-indicatorContainer')]"));textstate.click();
		Thread.sleep(3000);

		WebElement hariyana = driver.findElement(By.id("react-select-3-option-2"));
		hariyana.click();
		Thread.sleep(3000);

		WebElement textcity = driver.findElement(By.xpath("//div[@id='city']//div[contains(@class,'-indicatorContainer')]"));
		textcity.click();
		Thread.sleep(3000);

		WebElement panipat = driver.findElement(By.id("react-select-4-option-1"));
		panipat.click();
		Thread.sleep(3000);

		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(3000);

		JSE.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);

		WebElement close = driver.findElement(By.id("closeLargeModal"));
		close.click();
		Thread.sleep(3000);
	}

}
