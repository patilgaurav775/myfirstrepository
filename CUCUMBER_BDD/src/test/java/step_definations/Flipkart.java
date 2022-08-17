package step_definations;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//io.cucumber.core.cli.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;

import DOM.TCS.FLIPKART.DASHBOARD;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flipkart {
	public static DASHBOARD dash;
	public WebDriver driver;
	@Given("I launch browser")
	public void i_launch_browser() {
	   System.setProperty("webdriver.chrome.driver", "F:\\GAURAV\\eclips2\\CUCUMBER_BDD\\src\\main\\resources\\chromedriver.exe");
	   driver=new ChromeDriver();
	}

	@Then("I enter url")
	public void i_enter_url() {
	    driver.get("https://www.flipkart.com");
	    driver.manage().window().maximize();
	}

	@Then("I verify url is working fine or not")
	public void i_verify_url_is_working_fine_or_not() {
	   dash=new DASHBOARD(driver);
	   boolean flag=dash.get_popup().isDisplayed();
	   assertEquals(flag, true);
	 
	}

	@When("Popup displays just close")
	public void popup_displays_just_close() {
		dash=new DASHBOARD(driver);
		dash.get_mobile_no().sendKeys("8806699604");
		dash.get_password().sendKeys("Gaurav@123");
		dash.get_login().click(); 
		
		
	}

	@Then("put {string} in the search box")
	public void put_in_the_search_box(String string) {
		driver.navigate().refresh();
		dash=new DASHBOARD(driver);
		dash.Get_search_box().sendKeys(string);
	}

	@Then("click on search button")
	public void click_on_search_button() {

driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	}

	@Then("set the price range from {string} to {string}")
	public void set_the_price_range_from_to(String min, String max) throws InterruptedException {
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select slt_min =new Select(driver.findElement(By.xpath("//div[@class='_1YAKP4']//select[@class='_2YxCDZ']")));
		Select slt_max =new Select(driver.findElement(By.xpath("//div[@class='_3uDYxP']//select[@class='_2YxCDZ']")));
		Thread.sleep(1000);
		slt_min.selectByValue(min);
		Thread.sleep(1000);
		slt_max.selectByValue(max);
		
	  
	}
	
	@Then("click on particular product")
	public void click_on_particular_product() {
//	  JavascriptExecutor jsv=(JavascriptExecutor) driver;
//	  jsv.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[text()='NN3098SL02 Square Daddy Analog Watch  - For Men']")));
	  
	  driver.navigate().refresh();
		//driver.findElement(By.xpath("//a[text()='38024PP25 Minimalists Analog Watch  - For Men']")).click();
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		  jsv.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//a[@title='38024PP25 Minimalists Analog Watch  - For Men']")));
		  jsv.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@title='38024PP25 Minimalists Analog Watch  - For Men']")));
	}

	@Then("click on buy now button")
	public void click_on_buy_now_button() {
		
		Set<String> st=driver.getWindowHandles();
		List<String> lst=new LinkedList<String>(st);
		
		driver.switchTo().window(lst.get(1));
		dash=new DASHBOARD(driver);
		dash.Get_buy_now().click();
		
		
	    
	}

	@Then("Verify Login page functionality")
	public void verify_login_page_functionality() {
		dash=new DASHBOARD(driver);
		if (driver.findElement(By.xpath("//span[text()='Delivery Address']")).isDisplayed()) {
		dash.get_delever_here().click();
		}
		if (driver.findElement(By.xpath("//span[text()='Order Summary']")).isDisplayed()) {
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _1seccl _3AWRsL']")).click();
			}
		
		
	}

	@Then("close the browser")
	public void close_the_browser() {
	  if (driver.findElement(By.xpath("//span[text()='UPI']")).isDisplayed()) {
		System.out.println("order executed properly");
		//driver.quit();
	}
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "screenshot");
		
	}


}
