package dashboard;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import COMMON.browser_launch;

public class hello extends browser_launch{

	
	@Test
	public void validate_main_module() {
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> list=driver.findElements(By.cssSelector("div[class='xtXmba']"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
		}
		if (list.size()==9) {
			System.out.println("all modules are visible on main page");
		}
		else {
			System.out.println("all modules are not on main page");
		}
	}
}
