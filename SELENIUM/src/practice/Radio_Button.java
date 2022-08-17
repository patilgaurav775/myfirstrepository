package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/radio-button");
		System.out.println(driver.getTitle());
		
		WebElement radiobutton=driver.findElement(By.id("item-2"));
		radiobutton.click();
		Thread.sleep(3000);
		
		WebElement yes=driver.findElement(By.cssSelector("label[for=\"yesRadio\"]"));
		yes.click();
		Thread.sleep(3000);
		
		WebElement impressive=driver.findElement(By.cssSelector("label[for=\"impressiveRadio\"]"));
		impressive.click();
		Thread.sleep(3000);
		
		WebElement Radio_text_print=driver.findElement(By.className("text-success"));
		System.out.println(Radio_text_print.getText());
		
		WebElement no=driver.findElement(By.id("noRadio"));
		if (!no.isEnabled()) {
			System.out.println("no redio button is disable test case is pass");
		}
		else {
			System.out.println("no redio button is enable test case is fail");
		}
		
	}
}
