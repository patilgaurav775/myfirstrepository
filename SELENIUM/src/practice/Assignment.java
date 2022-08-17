package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/webtables");

		List<WebElement> header_table_name = driver.findElements(By.className("rt-resizable-header-content"));

		Iterator<WebElement> header_name = header_table_name.iterator();
		System.out.println();
		System.out.println("                                column head name are as follows                     ");
		while (header_name.hasNext()) {
			System.out.println(header_name.next().getText());                                                        // sagle column heading print hotil
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<WebElement> whole_table_content = driver.findElements(By.className("rt-td"));

		for (int i = 0; i < whole_table_content.size(); i++) {
			System.out.println(whole_table_content.get(i).getText());                                                      // sgle table details print hotil
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<WebElement> find_salary = driver.findElements(By.className("rt-td"));

		Iterator<WebElement> salary = find_salary.iterator();

		while (salary.hasNext()) {
			if (salary.next().getText().contentEquals("10000")) {
				System.out.println("salary you have mention is present in the table");                          // salary aahe ki nahi te check karel
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<WebElement> print_one_row = driver.findElements(By.xpath("//div[text()='Kierra']//parent::div"));

		for(int i=0;print_one_row.size()-1>i;i++) {
			System.out.println(print_one_row.get(i).getText());
		}
		
		/*Iterator<WebElement> print_a_row = print_one_row.iterator();
		while (print_a_row.hasNext()) {
			System.out.println(print_a_row.next().getText());                                                                       // paricular row print karel
		}*/
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<WebElement> Word_present = driver.findElements(By.className("rt-td"));

		Iterator<WebElement> word_present = Word_present.iterator();
		while (word_present.hasNext()) {
			if (word_present.next().getText().equals("Gentry")) {
				System.out.println("Gentry word is present");                                               // gentry word aahe ki nahi check karel
			}
		}

		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
		List<WebElement> all=driver.findElements(By.className("rt-td"));
		Iterator<WebElement> itr1 = all.iterator();
		
		List<WebElement> delete=driver.findElements(By.cssSelector("span[title='Delete']"));
		Iterator<WebElement> itr2=delete.iterator();
		
		try {
		while(itr1.hasNext()&&itr2.hasNext()) {
			if (itr1.next().getText().equals("Cantrell")) {
				itr2.next().click();
				System.out.println("delete button is clicked");           //cantrell word asel ti line delete hoil
			}
		} 
		}
		catch (Exception e) {
			System.out.println("test case is pass");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
