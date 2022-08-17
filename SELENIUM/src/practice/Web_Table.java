package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_Table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		//obj.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/webtables");
		System.out.println(driver.getTitle());
		
		WebElement webtable=driver.findElement(By.id("item-3"));
		webtable.click();
		Thread.sleep(3000);
		
		WebElement ADD=driver.findElement(By.id("addNewRecordButton"));
		ADD.click();
		//Thread.sleep(3000);
		
		WebElement FIRSTNAME=driver.findElement(By.id("firstName"));
		FIRSTNAME.sendKeys("GAURAV");
		//Thread.sleep(3000);
		
		WebElement LASTNAME=driver.findElement(By.id("lastName"));
		LASTNAME.sendKeys("PATIL");
		//Thread.sleep(3000);
		
		WebElement EMAIL=driver.findElement(By.id("userEmail"));
		EMAIL.sendKeys("PATILGAURAV775@GMAIL.COM");
		//Thread.sleep(3000);
		
		WebElement AGE=driver.findElement(By.id("age"));
		AGE.sendKeys("25");
		//Thread.sleep(3000);
		
		WebElement SALARY=driver.findElement(By.id("salary"));
		SALARY.sendKeys("50000");
		///Thread.sleep(3000);
		
		WebElement DEPARTMENT=driver.findElement(By.id("department"));
		DEPARTMENT.sendKeys("QA SECTION");
		//Thread.sleep(3000);
		
		WebElement SUBMIT=driver.findElement(By.id("submit"));
		SUBMIT.click();
		//Thread.sleep(3000);
		
	/*	WebElement SEARCH=driver.findElement(By.id("searchBox"));
		SEARCH.sendKeys("GAURAV");
		Thread.sleep(3000);*/
		
	/*	WebElement whole_table_in_console=driver.findElement(By.cssSelector("div[class=\"rt-tr -odd\"]"));
		System.out.println(whole_table_in_console.getText());*/
		
		
	/*	WebElement DELETE=driver.findElement(By.id("delete-record-4"));
		DELETE.click();
		Thread.sleep(3000);*/
		
		List<WebElement> print_header=driver.findElements(By.className("rt-resizable-header-content"));
		
		Iterator<WebElement>  print_column_header=print_header.iterator();
		
		System.out.println("following are the content header of table");
		while(print_column_header.hasNext()) {
			System.out.print(print_column_header.next().getText()+"    ");
		}
		
		List<WebElement> print_row=driver.findElements(By.className("rt-td"));
		
		Iterator<WebElement> row=print_row.iterator();
		
		System.out.println();
		System.out.println();
		System.out.println("following are the content table with row");
		while(row.hasNext()) {
				System.out.println(row.next().getText()+" ");
		}
		
		List<WebElement> search_gentry=driver.findElements(By.className("rt-td"));
		
		Iterator<WebElement> search_entry=search_gentry.iterator();
		
		while(search_entry.hasNext()) {
			if (search_entry.next().getText().equals("Gentry")) {
				System.out.println("Gantry is present");
			}
		}
		
	
	
	}



}
