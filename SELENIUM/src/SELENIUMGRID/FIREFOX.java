package SELENIUMGRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FIREFOX {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver=new FirefoxDriver();
		
		String url="loaclhost";
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		
		desiredCapabilities.setBrowserName("firefox");
		
		desiredCapabilities.setPlatform(Platform.WIN10);
		
		URL ur=new URL(url);
		
		driver =new RemoteWebDriver(ur,desiredCapabilities);
		
		driver.get("actualsite");
		
		driver.manage().window().maximize();
		
		driver.quit();


	}

}
