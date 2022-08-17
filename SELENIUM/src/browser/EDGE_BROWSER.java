package browser;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.grid.Main;

public class EDGE_BROWSER {

	public static void main(String[] args) {
		// EDGE

		
		  System.setProperty("webdriver.edge.driver", "Resources/msedgedriver.exe");
		  EdgeDriver driver1 = new EdgeDriver(); //
		  driver1.get("https://www.w3schools.com/");
		 driver1.navigate().to("https://www.w3schools.com/"); //TO METHOD OF
		 
		 
		 driver1.navigate().refresh(); //REFRESH METHOD OF NAVIGATION INTERFACE
		 
		  driver1.navigate().back(); //BACK METHOD OF NAVIGATION INTERFACE
		  
		  driver1.navigate().forward(); //FORWARD METHOD OF NAVIGATION INTERFACE
		 
		  System.out.println(driver1.getTitle()); //GET TITLE METHOD OF WEBDRIVER
		  
		  
		 
	}
}
