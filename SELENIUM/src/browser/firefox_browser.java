package browser;
import java.sql.Driver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefox_browser {

	
	
	public static void main(String[] args) {
		
																//FIREFOX
		
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		  FirefoxDriver driver = new FirefoxDriver();   //browser launch zal object banavlyavar
		 driver.get("https://www.w3schools.com/");
		 driver.navigate().to("https://www.w3schools.com/");
		// driver.navigate().back();
		   System.out.println(driver.getTitle());
		   //System.out.println(driver.close();)
		//driver.close();			//close current browser
	
		//   driver.manage().window().maximize();		//maximize window
		 //  driver.manage().window().minimize();		//minimize window
		 //  driver.manage().window().fullscreen();		//full screen window
		//	driver.quit();    //close all browser
																	
			
	}

}
