package ACTIONS_CLASS;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		driver=new ChromeDriver();
		
			driver.get("http://demoqa.com/droppable");
			
		driver.manage().window().maximize();
		
			Actions action=new Actions(driver);
			
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement target=driver.findElement(By.id("droppable"));
			
			action.dragAndDrop(source, target).perform();
			Thread.sleep(5000);
			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
		
			driver.findElement(By.id("droppableExample-tab-accept")).click();
			Thread.sleep(5000);
		
			WebElement acceptable=driver.findElement(By.id("acceptable"));
			WebElement target1=driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
			
		   action.dragAndDrop(acceptable, target1).perform();
		   Thread.sleep(3000);
			
			WebElement notAcceptable=driver.findElement(By.id("notAcceptable"));
			
			action.dragAndDrop(notAcceptable, target1).perform();
			
			Thread.sleep(3000);
			
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			
			driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
			Thread.sleep(3000);
			
			
			WebElement drag_me=driver.findElement(By.id("dragBox"));
			
			WebElement dropped1=driver.findElement(By.id("notGreedyDropBox"));
			WebElement dropped2=driver.findElement(By.id("notGreedyInnerDropBox"));
			
			action.dragAndDrop(drag_me, dropped1).perform();
			Thread.sleep(3000);
			
			action.dragAndDrop(drag_me, dropped2).perform();
			Thread.sleep(3000);
			 
			JavascriptExecutor jsv=(JavascriptExecutor) driver;
			jsv.executeScript("window.scrollBy(0,400)");
			Thread.sleep(3000);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

			WebElement drag_me_inner=driver.findElement(By.id("dragBox"));
			WebElement dropped_below2=driver.findElement(By.id("greedyDropBoxInner"));
			WebElement dropped_below1=driver.findElement(By.id("greedyDropBox"));
		
			action.dragAndDrop(drag_me, dropped_below1).perform();
			Thread.sleep(3000);
			
			action.dragAndDrop(drag_me_inner, dropped_below2).perform();
			Thread.sleep(3000);
			
			action.dragAndDropBy(drag_me, 100, 300).perform();
			Thread.sleep(3000);
			
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			driver.findElement(By.id("droppableExample-tab-revertable")).click();
			Thread.sleep(3000);
			
			WebElement will_revert=driver.findElement(By.id("revertable"));
			WebElement will_not_revert=driver.findElement(By.id("notRevertable"));
			WebElement drop=driver.findElement(By.cssSelector("div[id='revertableDropContainer'] div[id='droppable']"));
			
			action.dragAndDrop(will_revert, drop).perform();
			Thread.sleep(3000);
			
			action.dragAndDrop(will_not_revert, drop).perform();
			Thread.sleep(3000);
			
			action.dragAndDrop(will_not_revert, will_revert).perform();
			Thread.sleep(3000);
			
	}

}
