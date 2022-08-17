package COM.TCS.COMMON_FUNCTIONALITY;

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

public class Browser_Launch {
	
	public static Properties property;
	public static WebDriver driver;
	
	
	
	@BeforeSuite(alwaysRun = true)
	public void browser_launch() {
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
	
	

	/*@AfterSuite(alwaysRun = true)
	public  void tear_down() {
		driver.quit();
	}*/
}
