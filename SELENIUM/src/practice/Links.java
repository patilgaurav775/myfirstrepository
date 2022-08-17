package practice;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
							driver = new ChromeDriver();

		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		WebElement new_tab_text = driver.findElement(By.xpath("//strong[text()='Following links will open new tab']"));
		System.out.println(new_tab_text.getText()+"\n");
		
		WebElement home_text = driver.findElement(By.xpath("//a[text()='Home']"));
		System.out.println(home_text.getText()+"\n");
		
		String link_window = driver.getWindowHandle();
		

		WebElement home_link = driver.findElement(By.cssSelector("a[id='simpleLink']"));
		home_link.click();
		Thread.sleep(3000);

		Set<String> nextwindow = driver.getWindowHandles();

		Iterator<String> itr = nextwindow.iterator();

		while (itr.hasNext()) {

			String home_window = itr.next().toString();

			if (!link_window.equalsIgnoreCase(home_window)) {
				driver.switchTo().window(home_window);
				Thread.sleep(3000);

				driver.close();
				Thread.sleep(3000);

			}

		}

		driver.switchTo().window(link_window);
		Thread.sleep(3000);

		WebElement home_cnz = driver.findElement(By.id("dynamicLink"));
		home_cnz.click();
		Thread.sleep(3000);

		Set<String> nextwindow1 = driver.getWindowHandles();

		Iterator<String> itr1 = nextwindow1.iterator();

		while (itr1.hasNext()) {

			String home_window1 = itr1.next().toString();

			if (!link_window.equalsIgnoreCase(home_window1)) {
				driver.switchTo().window(home_window1);
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(3000);
			}

		}

		driver.switchTo().window(link_window);
		Thread.sleep(3000);
		
		
		JavascriptExecutor jsv = (JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		

		WebElement api_text = driver.findElement(By.xpath("//strong[text()='Following links will send an api call']"));
		System.out.println(api_text.getText()+"\n");
		

		WebElement link_button = driver.findElement(By.id("item-5"));
		link_button.click();
		Thread.sleep(3000);

		WebElement created_link = driver.findElement(By.id("created"));
		created_link.click();
		Thread.sleep(3000);

		WebElement title_after_clicking_created_link = driver.findElement(By.id("linkResponse"));
		System.out.println(title_after_clicking_created_link.getText()+"\n");

		WebElement no_content_link = driver.findElement(By.id("no-content"));
		no_content_link.click();
		Thread.sleep(3000);

		WebElement title_after_clicking_no_content_link = driver.findElement(By.id("linkResponse"));
		System.out.println(title_after_clicking_no_content_link.getText()+"\n");

		WebElement moved_link = driver.findElement(By.id("moved"));
		moved_link.click();
		Thread.sleep(3000);

		WebElement title_after_clicking_moved_link_link = driver.findElement(By.id("linkResponse"));
		System.out.println(title_after_clicking_moved_link_link.getText()+"\n");

		WebElement bad_request_link = driver.findElement(By.id("bad-request"));
		bad_request_link.click();
		Thread.sleep(3000);

		WebElement title_after_clicking_bad_request_link = driver.findElement(By.id("linkResponse"));
		System.out.println(title_after_clicking_bad_request_link.getText()+"\n");

		WebElement unauthorized_link = driver.findElement(By.id("unauthorized"));
		unauthorized_link.click();
		Thread.sleep(3000);

		WebElement title_after_clicking_unauthorized_link = driver.findElement(By.id("linkResponse"));
		System.out.println(title_after_clicking_unauthorized_link.getText()+"\n");

		WebElement forbidden_link = driver.findElement(By.id("forbidden"));
		forbidden_link.click();
		Thread.sleep(3000);

		WebElement title_after_clicking_forbidden_link = driver.findElement(By.id("linkResponse"));
		System.out.println(title_after_clicking_forbidden_link.getText()+"\n");

		WebElement notfound_link = driver.findElement(By.id("invalid-url"));
		notfound_link.click();
		Thread.sleep(3000);

		WebElement title_after_clicking_link = driver.findElement(By.id("linkResponse"));
		System.out.println(title_after_clicking_link.getText()+"\n");
		
		System.out.println("test cases of link are passed");

	}

}
