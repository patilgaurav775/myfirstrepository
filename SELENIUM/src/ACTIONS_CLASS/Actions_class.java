package ACTIONS_CLASS;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
		click.click();
		 
		 Actions obj=new Actions(driver);                                       //ACTIONS CHA OBJECT BANVALA AANI CONSTRUCTOR LA WEBDRIVER PASS KELA
		 
		 //////////////////////////////////////////////DOUBLE CLICK AND CONTEXT CLICK////////////////////////////////
		 
		 obj.doubleClick(driver.findElement(By.id("doubleClickBtn")));          //DOUBLE CLICK METHOD MADHE LOCATOR AS PARAMETER PASS KELA
		 obj.perform();
		 
		 obj.contextClick(driver.findElement(By.id("rightClickBtn")));            //CONTEX CLICK METHOD MADHE LOCATOR AS PARAMETER PASS KELA
		 obj.perform();                                                                                       //PERFORM METHOD HI ACTION INTERFACE CHI METHOD AAHE
		 
		 /////////////////////////////////////////////CLICK AND HOLD METHOD AND CLICK METHOD/////////////////////////////
		
		 driver.get("https://demoqa.com/menu");
		 
		 Thread.sleep(3000);
		 obj.click(driver.findElement(By.xpath("//a[text()='Main Item 1']"))).perform();	
		 WebElement menu1_text=driver.findElement(By.xpath("//a[text()='Main Item 1']"));
		 System.out.println(menu1_text.getText());
		 Thread.sleep(3000);
		
		 obj.click(driver.findElement(By.xpath("//a[text()='Main Item 3']"))).perform();	
		 WebElement menu3_text=driver.findElement(By.xpath("//a[text()='Main Item 3']"));
		 System.out.println(menu3_text.getText());
		 Thread.sleep(3000);
		 
		 WebElement menu2_text=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		 System.out.println(menu2_text.getText());
		 Thread.sleep(3000);
		 obj.clickAndHold(driver.findElement(By.xpath("//a[text()='Main Item 2']"))).perform();
		 
		 obj.clickAndHold(driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"))).perform();
		 WebElement SUBSUB_LIST_text=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		 System.out.println(SUBSUB_LIST_text.getText());
		 Thread.sleep(3000);
		 
		 obj.click(driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"))).perform();
		 WebElement SUBSUB_LIST_1_text=driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
		 System.out.println(SUBSUB_LIST_1_text.getText());
		 Thread.sleep(3000);
		 
		 ///////////////////////////////////////////////HOVERING TEXT PRINT//////////////////////////////////////////////////
		 
		 driver.get("https://demoqa.com/tool-tips");
		 obj.clickAndHold(driver.findElement(By.xpath("//button[text()='Hover me to see']"))).perform();
		 WebElement HOVE_ME_TO_SEE=driver.findElement(By.xpath("//button[text()='Hover me to see']"));
		 System.out.println(HOVE_ME_TO_SEE.getText());
		 
		Thread.sleep(5000);
		 WebElement HOVERING_MESSAGE=driver.findElement(By.xpath("//div[text()='You hovered over the Button']"));
		 System.out.println(HOVERING_MESSAGE.getText());
		 
		
		 if(HOVERING_MESSAGE.isDisplayed()) {
			 System.out.println(driver.findElement(By.xpath("//div[@id='texToolTopContainer']")).getText());
		 }
		 
		 /////////////////////////////////////////////DRAG_AND_DROP_METHOD///////////////////////////////////////////////////////
		 
		 driver.get("http://demoqa.com/droppable");
			
		
			
			
				
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
				
/////////////////////////////////////////////////DRAG AND DROP BY COORDINATES/////////////////////////////////////////////////////
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		}
		 
		 
		 
		 
		 
		 
	}


