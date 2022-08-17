package COM.TCS.COMMON_FUNCTIONALITY;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class LAUNCH {
	
	public static Properties property;
	public static WebDriver driver;
	public static String file_path;
	public static FileInputStream fis;
	public static FluentWait<WebDriver> wait;
	public static JavascriptExecutor jsv;
	
	public static void read_property() {
	
	try {
		 property=new Properties();
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\PROP\\config.properties");
		property.load(file);
		
	} 
	
	catch (IOException e) {

	}
	}
	
	
	@BeforeSuite(alwaysRun=true)
	public static void launch() {
		read_property();
		String browser=property.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\DRIVER\\chromedriver1.exe");
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
		
		String url=property.getProperty("URL");
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
	@AfterSuite(alwaysRun=true)
		public void teardown() {
		driver.quit();
	}

}
