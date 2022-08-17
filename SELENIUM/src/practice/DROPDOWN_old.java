package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROPDOWN_old {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement str=driver.findElement(By.id("oldSelectMenu"));
		
		Select name = new Select(str);                       //SELECT IS A CLASS WE ARE CREATING OBJECT OF SELECT CLASS
		
		WebElement old_text=driver.findElement(By.xpath("//div[text()='Old Style Select Menu']"));
		System.out.println(old_text.getText());
		System.out.println();
		
		name.selectByIndex(5);                  			   //INDEX NE
		
		/*WebElement index_5_Text=driver.findElement(By.cssSelector("option[value='5']"));	
		System.out.println("selected colour is"+index_5_Text.getText());*/
		System.out.println(name.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		System.out.println();
		
		name.selectByValue("2");             				 //dOM MADHE VALUE HE ATTRIBUTE ASEL TR
		
		/*WebElement value_2_Text=driver.findElement(By.cssSelector("option[value='2']"));
		System.out.println("selected colour is"+value_2_Text.getText());*/
		System.out.println(name.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		System.out.println();
		
		name.selectByVisibleText("Blue");            //TEXT NE
		
		/*WebElement value_1_Text=driver.findElement(By.cssSelector("option[value='1']"));
		System.out.println("selected colour is"+value_1_Text.getText());*/
		System.out.println(name.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		
           List<WebElement> option=name.getOptions();           //get option method use keli jyacha return type list ahe
		
		if(option.size()==11) {
			System.out.println("COUNT OF COLOUR TEST CASE IS PASSED");
		}
		
		else {
			System.out.println("COUNT OF COLOUR TEST CASE IS FAILED");
		}
		
		Iterator<WebElement> itr=option.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next().getText()+" ");                          
		}
		
		System.out.println();
		
		String first=name.getFirstSelectedOption().getText();                //LAST LA JI VALUE SELECTED ASEL TI DISPLAY KARTE HI METHOD
		
		System.out.println(first+" is the output of first selected option method"+"\n");
		
		if (first.equalsIgnoreCase("Blue")) {
			System.out.println("TEST CASE OF DEFAULT COLOUR IS PASSED");
		}
		
		else {
			System.out.println("TEST CASE OF DEFAULT COLOUR IS FAILED");
		}

		////////////////////////////////////////////////////OLD MULTIPLE DROPDOWN////////////////////////////////////////////////////////
		
		 
		Select oo=new Select(driver.findElement(By.cssSelector("select[name=\"cars\"]")));
		
		System.out.println("IS DROPDOWN IS MULTIPLE=> "+oo.isMultiple());                       //IS MULTIPLE METHOD
		
		oo.selectByValue("volvo");
		oo.selectByValue("saab");
		oo.selectByValue("opel");
		
		List<WebElement> a=oo.getAllSelectedOptions();
		Iterator<WebElement> b=a.iterator();
		
		while(b.hasNext()) {
			System.out.println(b.next().getText());                                        //GETALLSELECTEDOPTIONS
		}
		
		System.out.println();            
		
	}

}
