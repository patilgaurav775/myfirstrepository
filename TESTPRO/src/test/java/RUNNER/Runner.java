package RUNNER;






import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
				
	features = ".//src//test//resources//feature1122//zzhhzzz.feature"
	,glue = "pppp"
	,dryRun = false,
	monochrome = true          //remove unnecessary character in console window
	,plugin = {"pretty","html:test-output/HTML/Result.html",   //preety folder karto for report 
						"junit:test-output/XML/Result.xml",
						"json:test-output/JSON/Result.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"
						
	}	
	//,tags = "@sanity" asto special group run karnyasathi		
	
		)

public class Runner {

}
