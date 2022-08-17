package pppp;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;

public class uuuu {
	

	
	
	
	@Given("user is on login page {int}")
	public void user_is_on_login_page(Integer int1) throws InvalidTokenException, AgentConnectException, IOException, ObsoleteVersionException {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("i am inside code");
	   ChromeDriver driver = new ChromeDriver("24JXLR9JucFZvjuBm3noUp81zsp_d3GZdAdAcatYL081",new ChromeOptions());
				  
	   driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("user enter valid username and password {int}")
	public void user_enter_valid_username_and_password(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i am inside code");
	}

	@When("clicks on login button {int}")
	public void clicks_on_login_button(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i am inside code");
	}

	@Then("user should navigated to home page {int}")
	public void user_should_navigated_to_home_page(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i am inside code");
	}

}
