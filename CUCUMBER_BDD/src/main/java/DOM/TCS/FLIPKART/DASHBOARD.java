package DOM.TCS.FLIPKART;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DASHBOARD {
public WebDriver driver;
	
	public DASHBOARD(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='_36HLxm col col-3-5']")
	WebElement get_popup;
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	WebElement login_popup_close;
	
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Get_search_box;
	
	@FindBy(css="button[class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	WebElement Get_buy_now;
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement get_mobile_no;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement get_password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement get_login;
	
	
	@FindBy(css="button[class='_2KpZ6l RLM7ES _3AWRsL']")
	WebElement get_delever_here;
	
	public WebElement get_popup() {
		return get_popup;
	}
	
	public WebElement get_login_popup_close() {
		return login_popup_close;
	}

	public WebElement Get_search_box() {
		return Get_search_box;
	}
	
	public WebElement Get_buy_now() {
		return Get_buy_now;
	}
	
	public WebElement get_mobile_no() {
		return get_mobile_no;
	}
	
	public WebElement get_password() {
		return get_password;
	}
	
	public WebElement get_login() {
		return get_login;
	}
	
	public WebElement get_delever_here() {
		return get_delever_here;
	}
}
