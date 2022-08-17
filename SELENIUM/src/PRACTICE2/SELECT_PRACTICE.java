package PRACTICE2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SELECT_PRACTICE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement obj=driver.findElement(By.id("oldSelectMenu"));		
		
		Select test=new Select(obj);
		
		test.selectByIndex(1);
		Thread.sleep(3000);                      //blue
		
		test.selectByValue("2");
		Thread.sleep(3000);                        //green
		
		test.selectByVisibleText("Yellow");
		Thread.sleep(3000);                              //yellow
		
		List<WebElement> option=test.getOptions();           //get option method use keli jyacha return type list ahe
		
		if(option.size()==11) {
			System.out.println("COUNT OF COLOUR TEST CASE IS PASSED");
		}
		
		Iterator<WebElement> itr=option.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next().getText()+" ");                          
		}
		System.out.println();
		
		String first=test.getFirstSelectedOption().getText();
		
		System.out.println(first+" is the output of first selected option method"+"\n");
		
		if (first.equalsIgnoreCase("Yellow")) {
			System.out.println("TEST CASE IS PASSED");
		}
		else {
			System.out.println("TEST CASE OF DEFAULT COLOUR IS FAILED");
		}
		
		
		
	}

}
