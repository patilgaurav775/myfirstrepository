package COMMON;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class browser_launch {
	public static Properties property;
	public static WebDriver driver;
	
	public static void prop() {
		property=new Properties();
		try {
			property.load(new FileInputStream(".\\src\\test\\resources\\source.properties"));
		}  catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	@BeforeSuite(alwaysRun=true)
	public void launch() {
		prop();
		String browser=property.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		String url=property.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	
/*	@AfterSuite(alwaysRun=true)
	public void TearDown() {
		driver.quit();
	}*/

}
