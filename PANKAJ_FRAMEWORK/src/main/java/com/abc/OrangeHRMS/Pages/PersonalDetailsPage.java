package com.abc.OrangeHRMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {
	
	WebDriver driver;
	
	  public PersonalDetailsPage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	  public WebElement getEditBtn() {
		  return driver.findElement(By.id("btnSave"));
	  }
	  
	  public WebElement getFirstNameTxt() {
		  return driver.findElement(By.id("personal_txtEmpFirstName"));
	  }
	  
	  public WebElement getLastNameTxt() {
		  return driver.findElement(By.id("personal_txtEmpLastName"));
	  }
	  
	  public WebElement getEmployeeID() {
		  return driver.findElement(By.id("personal_txtEmployeeId"));
	  }
	  
	  public WebElement getSavebBtn() {
		  return driver.findElement(By.id("btnSave"));
				  
	  }
	  
	  
	

}
