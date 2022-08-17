package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALL_IN_ONE {
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

WebElement home_cnz = driver.findElement(By.id("dynamicLink"));
home_cnz.click();
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
	}
}
	


