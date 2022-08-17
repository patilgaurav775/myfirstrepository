package Elements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Launch.Browser_Launch;

public class test_box extends Browser_Launch{
	@Ignore
	@Test(priority = 0)
	public static void textbox() {
		driver.findElement(By.xpath("//li[@id='item-0']")).click();
		
		try {
			WebElement add=driver.findElement(By.xpath("//a[@id='close-fixedban']"));
			if(add.isDisplayed()) {
			add.click();
			}
			else {
				System.out.println("no add found");
			}
			
		} catch (Exception e) {
			System.out.println("add not found");
		}
		
		jsv.executeScript("window.scrollBy(0,200)");
		
		WebElement Full_Name=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement UserEmail=driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement Current_Address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement Permanant_Address=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		WebElement Submit=driver.findElement(By.xpath("//button[@id='submit']"));
		
		Full_Name.sendKeys("Gaurav Sanjay Patil");
		UserEmail.sendKeys("patilgaurav775@gmail.com");
		Current_Address.sendKeys("953,vivekanand nagar bhadgaon road pachora");
		Permanant_Address.sendKeys("953,vivekanand nagar bhadgaon road pachora");
		Submit.click();
		
		WebElement summary=driver.findElement(By.xpath("//div[@id='output']"));
		if (summary.isDisplayed()) {
			System.out.println(summary.getText());
		} else {
			System.out.println("summary not displayed");
		}
		
	}
	
	@Ignore
	@Test(priority = 0)
	public static void checkbox() {
		driver.findElement(By.xpath("//li[@id='item-1']")).click();
		WebElement Home_Arrow=driver.findElement(By.xpath("(//*[local-name()='svg'])[48]"));
		Home_Arrow.click();
		
		WebElement Desktop_Arrow=driver.findElement(By.xpath("(//*[local-name()='svg'])[51]"));
		Desktop_Arrow.click();
		
		
		WebElement Document_Arrow=driver.findElement(By.xpath("(//*[local-name()='svg'])[58]"));
		Document_Arrow.click();
				
		WebElement Downloads_Arrow=driver.findElement(By.xpath("(//*[local-name()='svg'])[61]"));
		Downloads_Arrow.click();
		
		WebElement HOME_box=driver.findElement(By.xpath("(//*[local-name()='svg'])[49]"));
		HOME_box.click();
					
	}
	
	@Ignore
	@Test(priority = 0)
	public static void radio_button() {
		driver.findElement(By.xpath("//li[@id='item-2']")).click();
		
		WebElement impressive=driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
		jsv.executeScript("arguments[0].click()",impressive);
		
	}
	
	@Test(priority = 0)
	public static void web_table() {
		driver.findElement(By.xpath("//li[@id='item-3']")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("div[class='rt-tr -odd']")).getText());
		
		List<WebElement> list_content=driver.findElements(By.className("rt-td"));
		
		
		
		Iterator<WebElement> itr=list_content.iterator();
		
		while(itr.hasNext()) {
			String aa=itr.next().getText();
			if (aa.equalsIgnoreCase("Alden")) {
				System.out.println(aa+" is present");
				  
				try {
					 driver.findElement(By.xpath("//span[@id='delete-record-2']")).click();
					 break;
				} catch (Exception e) {
					
				}
						  
			}
		}
		
		
	}

	}
	
