package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	/*	WebElement checkbox_home =driver.findElement(By.className("rct-checkbox"));          //checkbox la click kel
		if (!checkbox_home.isSelected()) {
			checkbox_home.click();
		}*/
		
	/*WebElement hiddenid=driver.findElement(By.id("result"));                  //find element ne jar id dom madhe asel tar text print hoil
		if (hiddenid.isDisplayed()) {
			System.out.print(hiddenid.getText());
		}
		else {
			System.out.println("unable to seee result because test case got failed");
		}*/
		
		/*List<WebElement> hiddenid=driver.findElements(By.id("result"));			//find elementSS ne kel aahe yacha return type list webelement aahe
		if (hiddenid.size()>0) {
			System.out.print(hiddenid.get(0).getText());
		}
		else {
			System.out.println("unable to seee result because test case got failed");
		}*/
		
		WebElement toggle_home=driver.findElement(By.cssSelector("button[aria-label=\"Toggle\"]"));        //home button toggle
		toggle_home.click();
		
		
		WebElement toggle_desktop=driver.findElement(By.xpath("//label[@for=\"tree-node-desktop\"]//preceding-sibling::button"));   
		toggle_desktop.click();                              //desktop button toggle using preceding sibling 
		
		WebElement toggle_documents=driver.findElement(By.xpath("//label[@for=\"tree-node-documents\"]/preceding-sibling::button"));
		toggle_documents.click();							//documents toggle click using preceding sibling
		
				WebElement toggle_workspace=driver.findElement(By.xpath("//label[@for=\"tree-node-workspace\"]/preceding-sibling::button"));
				toggle_workspace.click();					//workspace toggle click using preceding sibling
				
				WebElement toggle_office=driver.findElement(By.xpath("//span[text()='Office']//parent::label//preceding-sibling::button"));
				toggle_office.click();                         //office toggle click using preceding sibling
			
		JavascriptExecutor jsv=(JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,300);");                  //scroll kele 
		Thread.sleep(3000);
		
		WebElement toggle_downloads=driver.findElement(By.xpath("//label[@for=\"tree-node-downloads\"]/preceding-sibling::button"));
		toggle_downloads.click();							//downloads toggle click using preceding sibling
		
		WebElement checkbox_of_word_file=driver.findElement(By.cssSelector("label[for=\"tree-node-wordFile\"] span[class=\"rct-checkbox\"]"));
		if (!checkbox_of_word_file.isSelected()) {
			checkbox_of_word_file.click();                  //word file chya checkbox la click kele
		}
		else {
			System.out.println("CHECKBOX OF WORD IS ALREADY SELECTED");
		}
		
		WebElement checkbox_of_notes_file=driver.findElement(By.cssSelector("label[for='tree-node-notes'] span[class='rct-checkbox']"));
		checkbox_of_notes_file.click();					//notes chys checkbox la click kele
		
		WebElement checkbox_of_workspace_file=driver.findElement(By.cssSelector("label[for=\"tree-node-workspace\"] span[class=\"rct-checkbox\"]"));
		checkbox_of_workspace_file.click();		//notes chys workspace la click kele
		
		WebElement To_get_text_after_selection_of_checkbox=driver.findElement(By.cssSelector("div[id=\"result\"]"));
		
		if (To_get_text_after_selection_of_checkbox.isDisplayed()) {          //checkbox file chya box la click kelyavar text aale
			System.out.println(To_get_text_after_selection_of_checkbox.getText());
		} 
		else {
			System.out.println("cant foud text our testcase is fail");		
		}
		
		
		
	}

}
