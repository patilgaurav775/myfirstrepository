package com.restapi_testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Util.Spark_reportor;

public class Listners implements ITestListener{

	public void onTestStart(ITestResult result) {
		Pre_conditions.sp.creattest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		String	respo=null;
		try {
			respo =(String) result.getTestClass().getRealClass().getDeclaredField(("respo_"+result.getMethod().getMethodName())).get(result.getInstance());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		Spark_reportor.Pass(respo );
	}

	public void onTestFailure(ITestResult result) {
		 Spark_reportor.Fail(result.getTestName()+result.getThrowable());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}
	

}
