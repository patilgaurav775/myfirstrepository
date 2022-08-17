package browser;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class crome_browser {

	public static void main(String[] args) {
		// CHROME

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();
		//driver.get("http://www.instagram.com");                        //GET METHOD OF WEBDRIVER
		//driver2.navigate().to("http://www.gmail.com");
		Navigation test = driver2.navigate();
		test.to("http://www.gmail.com");
		driver2.manage().window().maximize();
		driver2.quit();
		
		System.out.println(driver2.getTitle());

	}

}
