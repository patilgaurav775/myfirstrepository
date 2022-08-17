package DOM.INFOSYS.COMMONFUNCTIONALITY;

import java.io.File;
import java.util.Date;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class REPORTER extends BROWSER_LAUNCH{
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeTest(alwaysRun = true)
	public static void report_generates() {
		
		Date date=new Date();
		String timestamp=date.toString().replace(":", "-");
		File file=new File("Result/"+timestamp);
		file.mkdir();          //folder ready zali
		file_path=file.getPath();
		report=new ExtentReports(file_path+"/Result.html",true);
		
	}
	
	public static void start_test(String EXPECTED_RESULT) {
		test=report.startTest(EXPECTED_RESULT);
		
	}
	
	public static void PassTest(String ACTUAL_RESULT) {
		test.log(LogStatus.PASS, ACTUAL_RESULT);
		
	}
	
	public static void fail_test(String ACTUAL_RESULT) {
		test.log(LogStatus.FAIL, ACTUAL_RESULT,test.addScreenCapture(UTILITY.screen_capture()));
		
	}
	
	@AfterTest()
	public static void tear_down() {
		report.endTest(test);
		report.flush();
	}
	
	
	

}
