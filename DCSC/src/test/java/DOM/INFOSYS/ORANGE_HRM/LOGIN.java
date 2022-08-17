package DOM.INFOSYS.ORANGE_HRM;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import DOM.INFOSYS.COMMONFUNCTIONALITY.EXCEL_REPORT;
import DOM.INFOSYS.POM.Dashboard_page;
import DOM.INFOSYS.POM.login_page;
import synchronization.webdriver_wait;

public class LOGIN extends EXCEL_REPORT {
	public static webdriver_wait wait;
	
	
	@Test(description = "TEST CASE FOR VALID LOGIN CREDENTIALS", priority = 7)
	public void TC_01_LOGIN_VALIDCREDENTIALS() throws InterruptedException {
		login_page obj = new login_page(driver);
		Dashboard_page obj1 = new Dashboard_page(driver);
		driver.navigate().forward();
		obj.login_successful(getStringCellData("TC1", "USERNAME"), getStringCellData("TC1", "PASSWORD"));
		Thread.sleep(3000);
		start_test("user should able to login successfully with valid credentials and dashbooard should selected by default");

		if (obj1.get_pie_chart().size() > 0) {
			PassTest("user are able to login successfully with valid credentials and dashbooard is selected by default");
		} else {
			fail_test("user are not able to login successfully with valid credentials");
		}
		driver.navigate().back();
			}

	@Test(priority = 1, enabled = true)
	public void TC_02_sample_text() {

		login_page obj = new login_page(driver);
		start_test("url should open successfully ");

		wait = new webdriver_wait(driver,10);
		wait.wait_for_visible( obj.get_sample_user_pass());

		if (obj.get_sample_user_pass().isDisplayed()) {

			PassTest("url is opened successfully ");
		} else {
			fail_test("url is not opened successfully ");
		}
	}

	@Test(priority = 6, enabled = true)
	public void TC_03_login_unsuccessful() {

		login_page obj = new login_page(driver);
		test = report.startTest("error message should displayed after invalid username and password");
		obj.login_successful(getStringCellData("TC2", "USERNAME"), getStringCellData("TC2", "PASSWORD"));
	
		wait = new webdriver_wait(driver,10);
		wait.wait_for_visible(obj.get_Error_message());
		if (obj.get_Error_message().isDisplayed()) {
			// assertEquals(driver.findElement(By.id("spanMessage")).getText(), "Invalid
			// credentials");
			PassTest("error message is displayed after passing invalid username and password");
		} else {
			fail_test("error message is not displayed after passing invalid username and password");
		}

	}

	@Test(priority = 2)
	public void TC_04_login_panel_logo() {
		login_page obj = new login_page(driver);
		test = report.startTest("login panel logo should be present in login panel");
		if (obj.get_login_panel_logo().isDisplayed()) {
			PassTest("login panel logo is present in login panel");
		} else {
			fail_test("login panel logo is absent in login panel");
		}

	}

	@Test(priority = 3)
	public void TC_05_header_logo() {
		login_page obj = new login_page(driver);
		test = report.startTest("header panel logo of HRM should be present ");
		if (obj.get_HRM_header_logo().isDisplayed()) {
			PassTest("header panel logo of HRM is present ");
		} else {
			fail_test("header panel logo of HRM is present ");
		}

	}

	@Test(priority = 4)
	public void TC_06_Login_panel_text() {
		login_page obj = new login_page(driver);
		test = report.startTest("login panal text should displayed as per requirement ");
		if (obj.get_login_panel_text().size() > 0) {
			PassTest("login panal text is displayed as per requirement ");
		} else {
			fail_test("login panal text is not displayed as per requirement ");
		}
	}

	@Test(priority = 5)
	public void TC_07_forgot_password() throws InterruptedException {

		login_page obj = new login_page(driver);
		test = report.startTest("forgot password text should be visible ");
		if (obj.get_forgot_password().isDisplayed()) {
			PassTest("forgot password text is visible ");
		}

		else {
			fail_test("forgot password text is not visible ");
		}
		test = report.startTest("forgot password link should be clickable ");
		if (obj.get_forgot_password().isDisplayed()) {
			obj.get_forgot_password().click();
			PassTest("forgot password link is clickable ");

			driver.navigate().back();
			Thread.sleep(3000);

		}

		else {
			fail_test("forgot password link is not clickable ");
		}

	}

	@Test(priority = 8)
	public void TC_08_footer_copyright_link() throws InterruptedException {
		login_page obj = new login_page(driver);
		test = report.startTest("footer copyright link should be displayed and clickable");
		if (obj.get_footer_orange_HRM_copyright().isDisplayed()) {
			obj.get_footer_orange_HRM_copyright().click();

			PassTest("footer copyright link is displayed and clickable");
		} else {
			fail_test("footer copyright link is not displayed and clickable");

		}

		driver.navigate().back();
		Thread.sleep(3000);

	}

	@Test(priority = 9)
	public void TC_09_social_media_link() throws InterruptedException {
		String id = driver.getWindowHandle();
		login_page obj = new login_page(driver);
		test = report.startTest("LINKED IN footer quick link should be visible and clickable ");
		if (obj.get_footer_linkedIn_link().isDisplayed()) {
			obj.get_footer_linkedIn_link().click();
			PassTest("LINKED IN footer quick link is visible and clickable ");

			driver.switchTo().window(id);

		} else {
			fail_test("LINKED IN footer quick link is  not visible and clickable ");
		}
		test = report.startTest("TWITTER  footer quick link should be visible and clickable ");
		if (obj.get_footer_twitter_link().isDisplayed()) {
			obj.get_footer_twitter_link().click();
			PassTest("TWITTER footer quick link is visible and clickable ");
			Thread.sleep(3000);
			driver.switchTo().window(id);

		} else {
			fail_test("TWITTER footer quick link is  not visible and clickable ");
		}
		test = report.startTest("FACEBOOK  footer quick link should be visible and clickable ");
		if (obj.get_footer_facebook_link().isDisplayed()) {
			obj.get_footer_facebook_link().click();
			test.log(LogStatus.PASS, "FACEBOOK footer quick link is visible and clickable ");
			Thread.sleep(3000);
			driver.switchTo().window(id);

		} else {
			fail_test("FACEBOOK footer quick link is  not visible and clickable ");
		}
		test = report.startTest("YOUTUBE  footer quick link should be visible and clickable ");
		if (obj.get_footer_youtube_link().isDisplayed()) {
			obj.get_footer_youtube_link().click();
			PassTest("YOUTUBE footer quick link is visible and clickable ");
			Thread.sleep(3000);
			driver.switchTo().window(id);

		} else {
			fail_test("YOUTUBE footer quick link is  not visible and clickable ");
		}
	}

}