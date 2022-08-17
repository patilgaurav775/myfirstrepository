package COM.TCS.COMMON_FUNCTIONALITY;



import java.io.File;
import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporter extends Browser_Launch{
	public static String filepath;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
@BeforeTest
public static void report_generate() {
		Date date=new Date();
		String timestamp=date.toString().replace(":", "-");
		File file=new File("Result/"+timestamp);
		file.mkdir();
		filepath=file.getPath();
		report=new ExtentReports(filepath+"/Result.html",true);
		
	}
	
	public static void start_test(String Expected_Result) {
		test=report.startTest(Expected_Result);
	}

	public static void pass_test(String Actual_Result) {
		test.log(LogStatus.PASS, Actual_Result); 
	}
	
	public static void fail_test(String Actual_Result) {
		test.log(LogStatus.FAIL, Actual_Result,test.addScreenCapture(Utility.screen_capture())); 
	}

@AfterTest
public static void teardown() {
	report.endTest(test);
	report.flush();
}
	
}
