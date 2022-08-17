package step_definations;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DOM.INFOSYS.POM.login_page;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.bytebuddy.asm.Advice.This;


public class Base_Class {

//WebDriver driver;

	/*	public static Properties property;
		@AfterStep
		public void addScreenshot(Scenario scenario) throws IOException {
			  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			  scenario.attach(fileContent, "image/png", "screenshot");
			
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
	
	public static String random_String() {
		String generate_string1 = RandomStringUtils.randomAlphabetic(5);
		return generate_string1;
		
	}*/
}


