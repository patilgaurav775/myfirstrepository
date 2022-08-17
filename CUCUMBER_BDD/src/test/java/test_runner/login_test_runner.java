package test_runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

	@CucumberOptions(
			
		features = ".//src//test//resources//Feature//login.feature"
		,glue = "step_definations"
		,dryRun = false,
		monochrome = true          //remove unnecessary character in console window
		,plugin = {"pretty","html:test-output/HTML/Result.html",   //preety folder karto for report 
							"junit:test-output/XML/Result.xml",
							"json:test-output/JSON/Result.json",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	}	
		//,tags = "@sanity" asto special group run karnyasathi		
		
			)
		
		
public class login_test_runner {

}
