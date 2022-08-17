package DOM.INFOSYS.ORANGE_HRM;

import org.testng.annotations.Test;

import DOM.INFOSYS.COMMONFUNCTIONALITY.EXCEL_REPORT;
import DOM.INFOSYS.POM.Dashboard_page;
import DOM.INFOSYS.POM.login_page;

public class MI_PERSONAL_DETAILS extends EXCEL_REPORT{
	
	@Test
	public static void mm() {
		start_test("launch browser and url");
		login_page lp=new login_page(driver);
		Dashboard_page dp=new Dashboard_page(driver);
		lp.login_successful(getStringCellData("TC1", "USERNAME"),getStringCellData("TC1", "PASSWORD"));
		if (dp.get_pie_chart().size()>0) {
			PassTest("launch browser and url with successful login");
		} else {
			fail_test("launch browser and url with successful login not occured");
		}
		
	}

}
