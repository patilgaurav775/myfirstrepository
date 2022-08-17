package Launch_page;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import COM.TCS.COMMON_FUNCTIONALITY.Browser_Launch;
import COM.TCS.COMMON_FUNCTIONALITY.Reporter;
import COM.TCS.COMMON_FUNCTIONALITY.Synchrnization;
import COM.TCS.POM.LAUNCH_PAGE;

public class Launch_page extends Reporter{
	
	public static LAUNCH_PAGE LP;
	public static Synchrnization sn;
	public static Actions act;
	
	
	@Test(description = "logo visibility",priority = 1)
	public static void Symbol_displayed() {
		     LP=new LAUNCH_PAGE(driver);
		     start_test("Mintra symbol should display on launching page");
		if(LP.get_symbol().isDisplayed()) {
			pass_test("Mintra symbol is displayed on launching page");
		}
		else {
			fail_test("Mintra symbol is not displayed on launching page");
		}
		
	}
	
	@Test(description = "Top wear module validation",priority = 2)
	public static void Option_under_men_module()  {
		 LP=new LAUNCH_PAGE(driver);
		 start_test("Top_wear should display while clicking and holding on men module");
		 if (LP.get_men().isDisplayed()) {
			act=new Actions(driver);
			
			sn=new Synchrnization(driver, 10);
			sn.Wait_for_element_to_be_clickable(LP.get_men());
			
			act.clickAndHold(LP.get_men()).build().perform();
		
			if (LP.get_top_wear().isDisplayed()) {
				 pass_test("Top_wear is displayed after clicking and holding on men module");
			}
			else {
				fail_test("Top_wear is not displayed after clicking and holding on men module");
			}
		}
		 
	}
	
	@Test(description = "Verify presence of main module",priority = 3)
	public static void Main_module()  {
		 LP=new LAUNCH_PAGE(driver);
		 start_test("All main modules should be displayed on launching page");
		 if (LP.get_men().isDisplayed()) {
			 pass_test("Men Module is displayed");}
		 else {
			 fail_test("Men modules are missing");
		}
			 if (LP.get_women().isDisplayed()) {
				 pass_test("women Module is displayed");}
			 else {
				 fail_test("women modules are missing");
			}
				 if (LP.get_kid().isDisplayed()) {
					 pass_test("kid Module is displayed");}
				 else {
					 fail_test("kid modules are missing");
				}
					 if (LP.get_home_Living().isDisplayed()) {
						 pass_test("Home Module is displayed");}
					 else {
						 fail_test("Home modules are missing");
					}
						 if (LP.get_beauty().isDisplayed()) {
							 pass_test("beauty Module is displayed");}
						 else {
							 fail_test("beauty modules are missing");
						}
							 if (LP.get_studio().isDisplayed()) {
								 pass_test("studio Module is displayed");
							 }
							  
							 else {
								 fail_test("studio modules are missing");
							}
	
	
	}
	
	
	@Test(description = "Verify searchbox_functionaliy",priority = 4)
	public static void Search_Box() throws InterruptedException  {
		 LP=new LAUNCH_PAGE(driver);
		 sn=new Synchrnization(driver, 10);
		 
		 if (LP.get_searchbox().isDisplayed()) {
			 start_test("Search box should allow us to buy particular product");
			//sn.Wait_for_element_to_be_visible(LP.get_men_redio_button());
			LP.get_searchbox().sendKeys("Flipflops Nike");
			Keys a=Keys.ENTER;
			driver.switchTo().activeElement().sendKeys(a);
			String aaa=driver.getWindowHandle();
			driver.switchTo().window(aaa);
			
			try{Alert alert=driver.switchTo().alert();
			alert.dismiss();}
			catch (Exception e) {
				System.out.println("no alert present");
			}
			
				JavascriptExecutor jsv=(JavascriptExecutor) driver;
			//	jsv.executeScript("arguments[0].click();",LP.get_men_redio_button());
			//	jsv.executeScript("arguments[0].click();",LP.get_flipflop_colour_black());
				
				jsv.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//img[@alt='Nike Men Orange OnDeck Thong Flip-Flops']")));
				driver.findElement(By.xpath("//img[@alt='Nike Men Orange OnDeck Thong Flip-Flops']")).click();
				
				Set<String> st=driver.getWindowHandles();
				List<String> ll=new LinkedList<String>(st);
				driver.switchTo().window(ll.get(1));
				
				
				String size="10";
				List<WebElement> lst=driver.findElements(By.xpath("//button[@class='size-buttons-size-button size-buttons-size-button-default']"));
				
				for(int i=0;i<lst.size();i++) {
					if (lst.get(i).getText().equalsIgnoreCase(size)) {
						System.out.println(lst.get(i).getText());
						lst.get(i).click();
					}
				}
				
				WebElement price=driver.findElement(By.cssSelector("span[class='pdp-price']"));
				System.out.println("price of ashish slipper is "+price.getText());
				
				WebElement add_to_bag=driver.findElement(By.cssSelector("span.pdp-whiteBag"));
				add_to_bag.click();
				
				WebElement bag=driver.findElement(By.cssSelector("span.desktop-iconBag"));
				bag.click();
				
				jsv.executeScript("window.scrollBy(0,300);");
				
				
				WebElement place_order=driver.findElement(By.xpath("//div[text()='PLACE ORDER']"));
				if(place_order.isDisplayed()) {
					pass_test("Search box is allow us to buy particular product");
					jsv.executeScript("arguments[0].click();",place_order);
				}
				}
		 		else {
				fail_test("Search box is not allow us to buy particular product");
		 		}
				
				
				
			
		
				
		
			
			
		}
		 
	}
		
	
		    
	


