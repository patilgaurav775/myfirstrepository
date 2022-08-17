package DOM.INFOSYS.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class login_page  {
	WebDriver driver;

	
	//@FindBy method is not from testng but it is method of selenium
	
	@FindBy (id="txtUsername")
	WebElement username;
	
	@FindBy (id="txtPassword")
	WebElement password;
	
	@FindBy (name="Submit") 
	WebElement submit;
	
	@FindBy (id="divLogo")
	WebElement orange_hrm_header_logo;
	
	@FindBy (id="spanMessage")
	WebElement error_message;
	
	@FindBy (css="circle[fill='url(#f)']")
	WebElement get_login_panel_logo;
	
	@FindBy (id="logInPanelHeading")
	List<WebElement> get_login_panel_text;
	
	@FindBy (xpath="//a[@href='/index.php/auth/requestPasswordResetCode']")
	WebElement get_forgot_password;
	
	@FindBy (css="span[style='color:red; font-weight:bold; z-index:100;']")
	WebElement get_sample_user_pass;
	
	@FindBy (xpath="//a[@href='http://www.orangehrm.com']")
	WebElement get_footer_orange_HRM_copyright;
	
	@FindBy (xpath="//a[@href='http://www.linkedin.com/groups?home=&gid=891077']")
	WebElement get_footer_linkedIn_link;
	
	@FindBy (css="a[href='http://www.facebook.com/OrangeHRM']")
	WebElement get_footer_facebook_link;
	
	@FindBy (xpath="//a[@href='http://twitter.com/orangehrm']")
	WebElement get_footer_twitter_link;
	
	@FindBy (css="a[href='http://www.youtube.com/orangehrm']")
	WebElement get_footer_youtube_link;
	
	
	public login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement get_username() {
		return username;
	}
	
	public WebElement get_password() {
	//	return driver.findElement(By.id("txtPassword"));
		return password;
	}
	
	public WebElement get_submit() {
		//return driver.findElement(By.name("Submit"));
		return submit;
		
	}
	
	public WebElement get_Error_message() {
		//return driver.findElement(By.id("spanMessage"));
		return error_message;
	}
	
	public WebElement get_HRM_header_logo() {
		//return driver.findElement(By.id("divLogo"));
		return orange_hrm_header_logo;
	}
	
	public WebElement get_login_panel_logo() {
	//	return driver.findElement(By.cssSelector("circle[fill='url(#f)']"));
		return get_login_panel_logo;
		
	}
	
	public List<WebElement> get_login_panel_text() {
		//return driver.findElement(By.id("logInPanelHeading"));
		return get_login_panel_text;
	}
	public WebElement get_forgot_password() {
		//return driver.findElement(By.xpath("//a[//a[text()='Forgot your password?']]"));
		return get_forgot_password;
	}
	
	public WebElement get_sample_user_pass() {
		//return driver.findElement(By.cssSelector("span[style='color:red; font-weight:bold; z-index:100;']"));
		return get_sample_user_pass;
	}
	
	public WebElement get_footer_orange_HRM_copyright() {
	//	return driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']"));
		return get_footer_orange_HRM_copyright;
	}
	
	public WebElement get_footer_linkedIn_link() {
	//	return driver.findElement(By.xpath("//a[@href='http://www.linkedin.com/groups?home=&gid=891077']"));
		return get_footer_linkedIn_link;
	}
	
	public WebElement get_footer_facebook_link() {
		//return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/OrangeHRM\"]"));
		return get_footer_facebook_link;
	}
	
	public WebElement get_footer_twitter_link() {
		//return driver.findElement(By.xpath("//a[@href='http://twitter.com/orangehrm']"));
		return get_footer_twitter_link;
	}
	
	public WebElement get_footer_youtube_link() {
		//return driver.findElement(By.cssSelector("a[href='http://www.youtube.com/orangehrm']"));
		return get_footer_youtube_link;
	}
	
	public void login_successful(String username,String password) {
		get_username().sendKeys(username);
		get_password().sendKeys(password);
		get_submit().click();
	}
}
