package practice;
//badreequest	 unauthorized 	forbidden	 not fond 	method not allowed
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01OA_TOOL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		////////////////////////////////////////////////////////TEXTBOX/////////////////////////////////////////////////////////////////////////////

		//obj.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com");
		System.out.println(driver.getTitle());
		
		WebElement element=driver.findElement(By.cssSelector("div[class='card mt-4 top-card']"));
		element.click();
		Thread.sleep(3000);
		
		WebElement Textbox=driver.findElement(By.cssSelector("ul[class='menu-list'] li[id='item-0'][class='btn btn-light ']"));
		Textbox.click();
		Thread.sleep(3000);
		
		WebElement Username=driver.findElement(By.id("userName"));
		Username.sendKeys("GAURAV SANJAY PATIL");
		Thread.sleep(3000);
		
		WebElement Email=driver.findElement(By.cssSelector("input[type='email']"));
		Email.sendKeys("PATILGAURAV775@GMAIL.COM");
		Thread.sleep(3000);
		
		WebElement Current_Address=driver.findElement(By.id("currentAddress"));
		Current_Address.sendKeys("953, vivekanand nagar bhadgaon road tal-pachora,Dist-jalgaon,State-maharastra");
		Thread.sleep(3000);
		
		WebElement Permanant_Address=driver.findElement(By.id("permanentAddress"));
		Permanant_Address.sendKeys("953, vivekanand nagar bhadgaon road tal-pachora,Dist-jalgaon,State-maharastra");
		Thread.sleep(3000);
		
		Username.clear();
		Username.sendKeys("gaurav patil");
		
		WebElement Submit=driver.findElement(By.id("submit"));
		Submit.click();
		Thread.sleep(3000);
		
		System.out.println(Username.getTagName());                  //TAG NAME
		System.out.println(Submit.getText());							//
		System.out.println(Username.getAttribute("id"));				//ATTRITBUTE VALUE
		
		////////////////////////////////////////////////////////CHECKBOX/////////////////////////////////////////////////////////////////////////////
		
		WebElement CHECKBOX=driver.findElement(By.id("item-1"));
		CHECKBOX.click();
		Thread.sleep(3000);
		
		WebElement checkbox_home=driver.findElement(By.cssSelector("button[class='rct-collapse rct-collapse-btn']"));
		checkbox_home.click();
		Thread.sleep(3000);

	/*	WebElement checkbox_desktop=driver.findElement(By.cssSelector("span[class=\"rct-text\"]"));
		checkbox_desktop.click();
		Thread.sleep(3000);*/
		
	/*	WebElement checkbox_desktop_click=driver.findElement(By.cssSelector("span[class=\"rct-checkbox\"]"));
		checkbox_desktop_click.click();
		Thread.sleep(3000);*/
		
		WebElement checkbox_desktop_click=driver.findElement(By.cssSelector("button[aria-label=\"Expand all\"]"));
		checkbox_desktop_click.click();
		Thread.sleep(3000);
		
		WebElement checkbox_public_click=driver.findElement(By.cssSelector("label[for='tree-node-public'] span[class='rct-checkbox']"));
		checkbox_public_click.click();
		Thread.sleep(3000);
		
		WebElement checkbox_collaps_click=driver.findElement(By.cssSelector("button[class=\"rct-option rct-option-collapse-all\"]"));
		checkbox_collaps_click.click();
		Thread.sleep(3000);
		
		////////////////////////////////////////////////////////RADIOBUTTON/////////////////////////////////////////////////////////////////////////////
		
		
		WebElement radiobutton=driver.findElement(By.id("item-2"));
		radiobutton.click();
		Thread.sleep(3000);
		
		WebElement yes=driver.findElement(By.cssSelector("label[for=\"yesRadio\"]"));
		yes.click();
		Thread.sleep(3000);
		
		WebElement impressive=driver.findElement(By.cssSelector("label[for=\"impressiveRadio\"]"));
		impressive.click();
		Thread.sleep(3000);
		
		////////////////////////////////////////////////////////WEBTABLE/////////////////////////////////////////////////////////////////////////////

		
		
		WebElement webtable=driver.findElement(By.id("item-3"));
		webtable.click();
		Thread.sleep(3000);
		
		WebElement ADD=driver.findElement(By.id("addNewRecordButton"));
		ADD.click();
		Thread.sleep(3000);
		
		WebElement FIRSTNAME=driver.findElement(By.id("firstName"));
		FIRSTNAME.sendKeys("GAURAV");
		Thread.sleep(3000);
		
		WebElement LASTNAME=driver.findElement(By.id("lastName"));
		LASTNAME.sendKeys("PATIL");
		Thread.sleep(3000);
		
		WebElement EMAIL=driver.findElement(By.id("userEmail"));
		EMAIL.sendKeys("PATILGAURAV775@GMAIL.COM");
		Thread.sleep(3000);
		
		WebElement AGE=driver.findElement(By.id("age"));
		AGE.sendKeys("25");
		Thread.sleep(3000);
		
		WebElement SALARY=driver.findElement(By.id("salary"));
		SALARY.sendKeys("50000");
		Thread.sleep(3000);
		
		WebElement DEPARTMENT=driver.findElement(By.id("department"));
		DEPARTMENT.sendKeys("QA SECTION");
		Thread.sleep(3000);
		
		WebElement SUBMIT=driver.findElement(By.id("submit"));
		SUBMIT.click();
		Thread.sleep(3000);
		
		WebElement SEARCH=driver.findElement(By.id("searchBox"));
		SEARCH.sendKeys("GAURAV");
		Thread.sleep(3000);
		
		WebElement DELETE=driver.findElement(By.id("delete-record-4"));
		DELETE.click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
