package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { "@target/failedrun.txt" }, // feature file folder name
		glue = { "Stepdefination" }, // step definition package name
		plugin = { "html:target/cucumber-html-report",
				"rerun:target/failedrun.txt" }, // reporting
		monochrome = true)

public class failedrerun extends AbstractTestNGCucumberTests {

}
