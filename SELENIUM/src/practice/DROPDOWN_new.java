package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN_new {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
	//LOCATOR MADHE CONTAINS METHOD VAPARLI
		
		WebElement arrow=driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'-indicatorContainer')]"));
		arrow.click();                                                  
		Thread.sleep(3000);
		
		//DYNAMIC OPTION HOTE KHALCHE TYASATHI EVENT LISTENERS>>BLURR>REMOVEOVE KELE
		WebElement G1O2=driver.findElement(By.id("react-select-2-option-0-1"));
		G1O2.click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		arrow.click();
		
		WebElement G2O2=driver.findElement(By.id("react-select-2-option-1-1"));
		G2O2.click();
		Thread.sleep(3000);
		
		JavascriptExecutor jsv = (JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
				
		
		//div[@id='selectOne'] //div[contains(@class,'-indicatorContainer')]
		WebElement arrow1=driver.findElement(By.xpath("//div[@id='selectOne'] //div[contains(@class,'-indicatorContainer')]"));
		arrow1.click();
		Thread.sleep(3000);
		
		WebElement Other=driver.findElement(By.xpath("//div[text()='Other']"));                
		Other.click();
		Thread.sleep(3000);
		
		arrow1.click();
		Thread.sleep(3000);
		
		WebElement Mr=driver.findElement(By.xpath("//div[text()='Mr.']"));
		Mr.click();
		Thread.sleep(3000);
		
		
		///////////////////////////////////////////////////////MULTISELECT OPTION/////////////////////////////////////////////////////////
		
	//	JavascriptExecutor jsv = (JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,200);");
		Thread.sleep(3000);
		
		WebElement text=driver.findElement(By.xpath("//b[text()='Multiselect drop down']"));
		System.out.println(text.getText());
		
		WebElement arrow2=driver.findElement(By.cssSelector("div[style=\"opacity: 1; transition: opacity 260ms ease 0s;\"]"));
		arrow2.click();
		
		//div[@id="react-select-4-option-0"] green
		//div[@id="react-select-4-option-1"] blue
		//div[@id="react-select-4-option-2"] black
		
		
		
		WebElement green=driver.findElement(By.xpath("//div[@id=\"react-select-4-option-0\"]"));
		green.click();
		
		WebElement blue=driver.findElement(By.xpath("//div[@id=\"react-select-4-option-1\"]"));
		blue.click();
		
		WebElement black=driver.findElement(By.xpath("//div[@id=\"react-select-4-option-2\"]"));
		black.click();
		
		
		List<WebElement> colour_cancel=driver.findElements(By.className("css-xb97g8"));
		
		Iterator<WebElement> itr=colour_cancel.iterator();
		
		while(itr.hasNext()) {
			itr.next().click();
		}
		
		text.click();
		
		
		
	}
}
