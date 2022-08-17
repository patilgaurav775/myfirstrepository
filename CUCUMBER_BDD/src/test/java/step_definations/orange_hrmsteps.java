package step_definations;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import DOM.INFOSYS.POM.Dashboard_page;
import DOM.INFOSYS.POM.login_page;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;



public class orange_hrmsteps {

	public login_page login;
	public static WebDriver driver;
	public static Properties property;


/*@AfterStep
public void addScreenshot(Scenario scenario){

	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		
	}
@Before
public void browser_launch(Scenario scenario) {
	try {
		property=new Properties();
		FileInputStream fis=new FileInputStream("src/main/resources/launch.properties");
		property.load(fis);
		
	} catch (IOException e) {
		System.out.println("file not found");
		
		
	}
	
	String browser=property.getProperty("Browser");
	String url=property.getProperty("URL");
	System.out.println(browser);
	
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();	
		System.out.println("chromedriver is launtched");
	}
	else if (browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else {
		System.setProperty("webdriver.edge.driver", ".\\src\\main\\resources\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	
	driver.get(url);
	driver.manage().window().maximize();
}

@After
public void close_chrome_browser(Scenario scenario) {
	   driver.quit();
	}
	

*/
	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
	   login=new login_page(driver);
	boolean yes=  login.get_HRM_header_logo().isDisplayed();
	Assert.assertEquals(yes, true);
	
	}
	
	
	@Then("login with valid credentials username as {string} and password as {string}")
	public void login_with_valid_credentials_username_as_and_password_as(String username, String password) throws InterruptedException   {
	  login=new login_page(driver);
		login.login_successful(username, password);
		Thread.sleep(3000);
		
	}

	@Then("dashboard is selected by default")
	public void dashboard_is_selected_by_default() throws InterruptedException {
		 
		 Thread.sleep(3000);
		Dashboard_page dashboard=new Dashboard_page(driver);
		boolean piechart=  dashboard.get_pie_chart().size()>0;
		Assert.assertEquals(piechart, true,"after login dashboard is selected by default");
	}
	
	@Then("I logout from dashboard")
	public void i_logout_from_dashboard() throws InterruptedException {
	   login.logout();
	   if (login.get_login_panel_logo().isDisplayed()) {
		System.out.println("logout successful");
	
		
	}
	}
	


	
	

}

