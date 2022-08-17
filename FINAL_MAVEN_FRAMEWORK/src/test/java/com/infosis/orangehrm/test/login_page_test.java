package com.infosis.orangehrm.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.infosis.common_functionality.BrowserLaunch;
import com.infosis.orangehrm_project_pages.Dashboard_page;
import com.infosis.orangehrm_project_pages.login_page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class login_page_test extends BrowserLaunch {
	
public static ExtentTest test;
public static ExtentReports report;


	@BeforeClass(alwaysRun = true)
	
	public static void start_test() {
		report =new ExtentReports("Result\\login_page.html",true);
	}
	
	@Test(description = "TEST CASE FOR VALID LOGIN CREDENTIALS",priority = 7)
	public void TC_01_LOGIN_VALIDCREDENTIALS() {
		login_page obj=new login_page(driver);
		Dashboard_page obj1=new Dashboard_page(driver);
		
			test=report.startTest("user should able to login successfully with valid credentials");
			
					obj.login_successful("Admin", "admin123");
			
							if (obj1.getdashboard().isDisplayed()) {
								test.log(LogStatus.PASS, "user are able to login successfully with valid credentials");
								}
							else {
								test.log(LogStatus.FAIL, "user are not able to login successfully with valid credentials");
								}
							driver.navigate().back();							
							
	}
	@Test(priority = 1, enabled = true)
	public void sample_text() {

		login_page obj=new login_page(driver);
		test=report.startTest("url should open successfully ");
		if(obj.get_sample_user_pass().isDisplayed()) {
		test.log(LogStatus.PASS, "url is opened successfully ");
		}
		else {
			test.log(LogStatus.FAIL, "url is not opened successfully ");
			}
		}
		
	@Test(priority = 3, enabled = true)
	public void login_unsuccessful() {

		login_page obj=new login_page(driver);
		test=report.startTest("error message should displayed after invalid username and password");
		obj.login_successful("Admin", "admn123");
		if(driver.findElement(By.id("spanMessage")).isDisplayed()) {
			assertEquals(driver.findElement(By.id("spanMessage")).getText(), "Invalid credentials");
			test.log(LogStatus.PASS, "error message is displayed after passing invalid username and password");
		}
		else {
			test.log(LogStatus.FAIL, "error message is not displayed after passing invalid username and password");
			}

	}

	@Test(priority = 4)
	public void login_panel_logo() {
		login_page obj=new login_page(driver);
		test=report.startTest("login panel logo should be present in login panel");
		if (obj.get_login_panel_logo().isDisplayed()) {
			test.log(LogStatus.PASS, "login panel logo is present in login panel");
		} else {
			test.log(LogStatus.FAIL, "login panel logo is absent in login panel");
		}

	}

	@Test(priority = 6)
	public void header_logo() {
		login_page obj=new login_page(driver);
		test=report.startTest("header panel logo of HRM should be present ");
		if (obj.get_HRM_header_logo().isDisplayed()) {
			test.log(LogStatus.PASS, "header panel logo of HRM is present ");
		} else {
			test.log(LogStatus.FAIL, "header panel logo of HRM is present ");
		}

	}

	@Test(priority = 5)
	public void Login_panel_text() {

		login_page obj=new login_page(driver);
		test=report.startTest("login panal text should displayed as per requirement ");
		if (obj.get_login_panel_text().isDisplayed()) {
			Assert.assertEquals(obj.get_login_panel_text().getText(), "LOGIN Panel");
			test.log(LogStatus.PASS, "login panal text is displayed as per requirement ");
		}
		else {
			test.log(LogStatus.FAIL, "login panal text is not displayed as per requirement ");
		}

	

	}

	@Test(priority = 2)
	public void forgot_password() {

		login_page obj=new login_page(driver);
		test=report.startTest("forgot password text should be visible ");
		if (obj.get_forgot_password().isDisplayed()) {
			assertEquals(obj.get_forgot_password().getText(), "Forgot your password?");
			test.log(LogStatus.PASS, "forgot password text is visible ");
		}
		
		else {
			test.log(LogStatus.FAIL, "forgot password text is not visible ");
		}
		test=report.startTest("forgot password link should be clickable ");
		if (obj.get_forgot_password().isDisplayed()) {
			obj.get_forgot_password().click();
			test.log(LogStatus.PASS, "forgot password link is clickable ");
	
			driver.navigate().back();
		}

		else {
			test.log(LogStatus.FAIL, "forgot password link is not clickable ");
		}

	}

	@Test(priority = 8)
	public void footer_copyright_link() {
		login_page obj=new login_page(driver);
		test=report.startTest("footer copyright link should be displayed and clickable");
		if (obj.get_footer_orange_HRM_copyright().isDisplayed()) {
			obj.get_footer_orange_HRM_copyright().click();
			test.log(LogStatus.PASS, "footer copyright link is displayed and clickable");
		} else {
			test.log(LogStatus.FAIL, "footer copyright link is not displayed and clickable");
			
		}

		driver.navigate().back();

	}

	@Test(priority = 9)
	public void social_media_link() throws InterruptedException {
		String id = driver.getWindowHandle();
		login_page obj=new login_page(driver);
		test=report.startTest("LINKED IN footer quick link should be visible and clickable ");
		if (obj.get_footer_linkedIn_link().isDisplayed()) {
			obj.get_footer_linkedIn_link().click();
			test.log(LogStatus.PASS, "LINKED IN footer quick link is visible and clickable ");

			driver.switchTo().window(id);

		} else {
			test.log(LogStatus.FAIL, "LINKED IN footer quick link is  not visible and clickable ");
		}
		test=report.startTest("TWITTER  footer quick link should be visible and clickable ");
		if (obj.get_footer_twitter_link().isDisplayed()) {
			obj.get_footer_twitter_link().click();
			test.log(LogStatus.PASS, "TWITTER footer quick link is visible and clickable ");
			Thread.sleep(3000);
			driver.switchTo().window(id);

		} else {
			test.log(LogStatus.FAIL, "TWITTER footer quick link is  not visible and clickable ");
		}
		test=report.startTest("FACEBOOK  footer quick link should be visible and clickable ");
		if (obj.get_footer_facebook_link().isDisplayed()) {
			obj.get_footer_facebook_link().click();
			test.log(LogStatus.PASS, "FACEBOOK footer quick link is visible and clickable ");
			Thread.sleep(3000);
			driver.switchTo().window(id);

		} else {
			test.log(LogStatus.FAIL, "FACEBOOK footer quick link is  not visible and clickable ");
		}
		test=report.startTest("YOUTUBE  footer quick link should be visible and clickable ");
		if (obj.get_footer_youtube_link().isDisplayed()) {
			obj.get_footer_youtube_link().click();
			test.log(LogStatus.PASS, "YOUTUBE footer quick link is visible and clickable ");
			Thread.sleep(3000);
			driver.switchTo().window(id);

		} else {
			test.log(LogStatus.FAIL, "YOUTUBE footer quick link is  not visible and clickable ");
		}
	}
	@AfterClass(alwaysRun = true)
	public static void end_test() {
		report.endTest(test);
		report.flush();
	}
}


