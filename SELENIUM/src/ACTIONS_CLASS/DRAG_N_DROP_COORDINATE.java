package ACTIONS_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRAG_N_DROP_COORDINATE {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/dragabble");
			
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("dragBox"));
		System.out.println(source.getLocation().getX());
		System.out.println(source.getLocation().getY());
		
		Thread.sleep(3000);
		action.dragAndDropBy(source, 50, 50).perform();
		
		
		Thread.sleep(3000);
		action.moveToElement(source).dragAndDropBy(source, 100, 100).build().perform();    //MOVE TO ELEMENT METHOD FOR NEXT MOVEMENT OF WEBELEMENT
		int a=source.getLocation().getX();
		int b=source.getLocation().getY();
		System.out.println(a);
		System.out.println(b);
		
		Thread.sleep(3000);
		action.moveToElement(source).dragAndDropBy(source, 100, 100).build().perform(); 
		int c=source.getLocation().getX();
		int d=source.getLocation().getY();
		System.out.println(c);
		System.out.println(d);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.id("draggableExample-tab-axisRestriction")).click();
		
		
		WebElement X_AXIS=driver.findElement(By.id("restrictedX"));
		WebElement Y_AXIS=driver.findElement(By.id("restrictedY"));
		
		
		Thread.sleep(3000);
		action.dragAndDropBy(X_AXIS, 50, 0).perform();
		Thread.sleep(3000);
		action.dragAndDropBy(Y_AXIS, 0, 50).perform();
		
		Thread.sleep(3000);
		action.moveToElement(X_AXIS).dragAndDropBy(X_AXIS, 50, 0).build().perform();
		Thread.sleep(3000);
		action.clickAndHold(Y_AXIS).moveByOffset(0, 60).release().build().perform();              //move by offset method
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Thread.sleep(3000);
		driver.findElement(By.id("draggableExample-tab-containerRestriction")).click();
		Thread.sleep(3000);
		
		
		WebElement RISTRICTED=driver.findElement(By.cssSelector("div[id='containmentWrapper'] div[class='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
		
		action.dragAndDropBy(RISTRICTED, 50, 25).perform();
		Thread.sleep(3000);
		
		action.moveToElement(RISTRICTED).dragAndDropBy(RISTRICTED, 50, 25).build().perform();
		Thread.sleep(3000);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,200)");
		
				WebElement RISTRICTED_below=driver.findElement(By.cssSelector("[class='ui-widget-header ui-draggable ui-draggable-handle']"));
				
				action.dragAndDropBy(RISTRICTED_below, 0, 20).perform();
				Thread.sleep(3000);
				
				action.moveToElement(RISTRICTED_below).dragAndDropBy(RISTRICTED_below, 0, 20).build().perform();
	
				
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
				Thread.sleep(3000);
				driver.findElement(By.id("draggableExample-tab-cursorStyle")).click();
				Thread.sleep(3000);
				
				//JavascriptExecutor jsv=(JavascriptExecutor) driver;	
				jsv.executeScript("window.scrollBy(0,100)");
				WebElement CENTER=driver.findElement(By.id("cursorCenter"));
				
				action.dragAndDropBy(CENTER, 200,110).perform();
				
				Thread.sleep(3000);
				WebElement TOP_LEFT=driver.findElement(By.id("cursorTopLeft"));
				action.dragAndDropBy(TOP_LEFT, -60,-200).perform();
				
				Thread.sleep(3000);
				WebElement BOTTOM=driver.findElement(By.id("cursorBottom"));
				action.dragAndDropBy(BOTTOM, 400,100).perform();
				
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
		
				
				
				
		
		
	}

}
