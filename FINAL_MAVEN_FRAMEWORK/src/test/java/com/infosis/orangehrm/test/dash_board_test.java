package com.infosis.orangehrm.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.infosis.common_functionality.BrowserLaunch;
import com.infosis.orangehrm_project_pages.Dashboard_page;
import com.infosis.orangehrm_project_pages.login_page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class dash_board_test extends BrowserLaunch {
	public static ExtentTest test;
	public static ExtentReports report;
	
	@BeforeClass(alwaysRun = true)
	
	public static void start_test() {
		report =new ExtentReports("Result\\dashboard_page.html",true);
	}
	
	@Test(description = "dashboard is selected by default")
	public void TC_01_DASGBOARD_SELECTED_BYDEFAULT() {
		
		login_page obj=new login_page(driver);
		
		Dashboard_page obj1=new Dashboard_page(driver);
		
			test=report.startTest("Dashboard should selected by default after successful login");
			
					obj.login_successful("Admin", "admin123");
			
						if (obj1.getDashboard_img().isDisplayed()) {
							test.log(LogStatus.PASS, "Dashboard is selected by default after successful login");
						} else {
							test.log(LogStatus.FAIL, "Dashboard is not selected by default after successful login");
							//test.log(LogStatus.FAIL, "Fail",test.addScreenCapture("E:\\GAURAV\\eclips\\fail test case ss"));
						}
	}
	
	@AfterClass(alwaysRun = true)
	public static void end_test() {
		report.endTest(test);
		report.flush();
	}
	
	
}
