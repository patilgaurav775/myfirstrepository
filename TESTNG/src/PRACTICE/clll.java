package PRACTICE;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class clll {
	public static WebDriver driver;
	public static Properties property;
	

	
	@Test
	public  void launch() {
		try {	
			property=new Properties();
			property.load(new FileInputStream(".\\launch.properties"));
		}
		
		catch (FileNotFoundException e) {
			
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
		
		}
	
		
		String browser=property.getProperty("BROWSERNAME");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\GAURAV\\eclips2\\Z_FINAL_PROJECT\\resources\\chromedriver.exe");
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
		
	}
	
	/*@AfterSuite()
	public static void Tear() {
		driver.close();
	}
	*/
}
