package com.infosis.orangehrm_project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class login_page  {
	WebDriver driver;
	
	public login_page(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement get_username() {
		return driver.findElement(By.id("txtUsername"));
	}
	
	public WebElement get_password() {
		return driver.findElement(By.id("txtPassword"));
	}
	
	public WebElement get_submit() {
		return driver.findElement(By.name("Submit"));
	}
	
	public WebElement get_Error_message() {
		return driver.findElement(By.id("spanMessage"));
	}
	
	public WebElement get_HRM_header_logo() {
		return driver.findElement(By.id("divLogo"));
	}
	
	public WebElement get_login_panel_logo() {
		return driver.findElement(By.cssSelector("circle[fill='url(#f)']"));
	}
	
	public WebElement get_login_panel_text() {
		return driver.findElement(By.id("logInPanelHeading"));
	}
	public WebElement get_forgot_password() {
		return driver.findElement(By.xpath("//a[//a[text()='Forgot your password?']]"));
	}
	
	public WebElement get_sample_user_pass() {
		return driver.findElement(By.cssSelector("span[style=\"color:red; font-weight:bold; z-index:100;\"]"));
	}
	
	public WebElement get_footer_orange_HRM_copyright() {
		return driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']"));
	}
	
	public WebElement get_footer_linkedIn_link() {
		return driver.findElement(By.xpath("//a[@href='http://www.linkedin.com/groups?home=&gid=891077']"));
	}
	
	public WebElement get_footer_facebook_link() {
		return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/OrangeHRM\"]"));
	}
	
	public WebElement get_footer_twitter_link() {
		return driver.findElement(By.xpath("//a[@href='http://twitter.com/orangehrm']"));
	}
	
	public WebElement get_footer_youtube_link() {
		return driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/orangehrm\"]"));
	}
	
	public void login_successful(String username,String password) {
		get_username().sendKeys(username);
		get_password().sendKeys(password);
		get_submit().click();
	}
}
