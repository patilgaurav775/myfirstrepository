package Runner;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = { "src\\test\\resources\\Features\\Actitime.feature" }, // feature file folder name
		glue = { "Stepdefination" }, // step definition package name
		plugin = { "html:target/cucumber-html-report", "rerun:target/failedrun.txt" }, // reporting
		monochrome = true)

public class ParallelRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
