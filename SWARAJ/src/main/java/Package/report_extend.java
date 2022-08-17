package Package;


import java.util.Properties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class report_extend extends excel {
	public static ExtentReports report;
	public static ExtentTest test;
	public static Properties property;
	public static String expected_code;
	public static String actual_code;
	public static String respo;
	public static String updated_place_id;
	
	@BeforeTest(alwaysRun = true)
	public static void start_test() {
		
		report=new ExtentReports("src/main/resources/REPORT/report.html");	
	}
	
	public static void start_test(String EXPECTED_RESULT) {
		test=report.startTest(EXPECTED_RESULT);
		
	}
	
	public static void PassTest(String ACTUAL_RESULT) {
		test.log(LogStatus.PASS, ACTUAL_RESULT);
		
	}
	
	public static void fail_test(String ACTUAL_RESULT) {
		test.log(LogStatus.FAIL, ACTUAL_RESULT);
		
	}
	public static void skip_test() {
		test.log(LogStatus.SKIP,"test case is skipped");
		
	}
	
	
	@AfterTest()
	public static void tear_down() {
		report.endTest(test);
		report.flush();
	}

}
