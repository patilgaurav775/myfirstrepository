package MyHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class hooks {

	@Before
	public void capturescreenshotonfailure(Scenario scenario) {

		if (scenario.isFailed()) {

			TakesScreenshot webDriver = null;
			// Take a screenshot
			byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
	}

}
