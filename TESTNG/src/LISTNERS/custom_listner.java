package LISTNERS;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

public class custom_listner implements ITestListener{
	
//before starting of Test set
public void onStart(ITestContext arg) {
	System.out.println("start test execution...................."+arg.getName());
	
}

//after starting of Test set
public void onFinish(ITestContext arg) {
	System.out.println("finish test execution...................."+arg.getName());
}

//before main test start
public void onTestStart(ITestResult arg) {
	System.out.println("starts test...................."+arg.getName());
	
}

//when test is skipped
public void onTestSkipped(ITestResult arg) {
	System.out.println("skipped test...................."+arg.getName());
}

//when test case is pass
public void onTestSuccess  (ITestResult arg) {
	System.out.println("passed test...................."+arg.getName());
}

//when test case is fail
public void onTestFailure(ITestResult arg) {
	System.out.println("failled test...................."+arg.getName());
}


}
