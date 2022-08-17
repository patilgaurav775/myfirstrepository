package com.abc.OrangeHRMS.Test;


import org.testng.annotations.Test;

import com.abc.OrangeHRMS.Pages.Dashboard;
import com.abc.OrangeHRMS.Pages.LoginPage;
import com.abc.commonfunctionality.ReadExcel;
import com.abc.commonfunctionality.Reporter;
import com.abc.commonfunctionality.Utility;
import com.abc.commonfunctionality.WaitCondition;
import com.relevantcodes.extentreports.LogStatus;




public class LoginPageTest extends Reporter {
	
	
	
	@Test(enabled=true,description="Verify that user is able to login successfully with valid credential", priority=2)
	public void TC1() {
		test = report.startTest("Verify that user is able to login successfully with valid credential");
		LoginPage loginpage=new LoginPage(driver);
		//hard code is very wrong --you read the data from excel
		//loginpage.Login("Admin", "admin123"); //hard -code when you are write the test data directly in source code
		loginpage.Login(ReadExcel.getStringCellData("TC1", "UserName"), ReadExcel.getStringCellData("TC1", "Password"));
		
		WaitCondition waai=new WaitCondition();

		if(new Dashboard(driver).getDashboardLabel().size()>0) {
			test.log(LogStatus.PASS, "User is able to login in the application");
		}else {
			test.log(LogStatus.FAIL, "USer is unable to login in the application",test.addScreenCapture(Utility.captureScreen()));
		}
		
	}

	@Test(enabled=false,description="Verify that user is unable to login successfully with invalid credential", priority=1)
	public void TC2() {
		test=report.startTest("User should not be able to login with valid user id and wrong password");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.Login("admin", "admin123");
		
			if(loginpage.getinvalidMessageLabel().size()>0) {
			//Reporter.PassTes("USer is not able to login");
			test.log(LogStatus.PASS, "User is not able to login in system " + loginpage.getinvalidMessageLabel().get(0).getText());
		
		}
		else {
			test.log(LogStatus.FAIL, "Fail",test.addScreenCapture(Utility.captureScreen()));
		}
		
		
	}

	@Test(enabled=false)
	public void TC3() {
		System.out.println("" +ReadExcel.getNumericCellData("TC3","Number"));
		
	}
	
	
}
