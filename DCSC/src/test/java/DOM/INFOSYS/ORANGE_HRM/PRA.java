package DOM.INFOSYS.ORANGE_HRM;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import DOM.INFOSYS.COMMONFUNCTIONALITY.BROWSER_LAUNCH;
import DOM.INFOSYS.COMMONFUNCTIONALITY.EXCEL_REPORT;
import DOM.INFOSYS.POM.login_page;
import synchronization.webdriver_wait;

public class PRA extends EXCEL_REPORT {
	
@Test
public static void launch()  {
	
	login_page obj = new login_page(driver);
	
	obj.get_username().sendKeys("admin");
	obj.get_password().sendKeys("admin");
	obj.get_submit().click();

	

	
	
	
}
}
