package com.infosis.orangehrm_project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Dashboard_page {
	WebDriver driver;
	
	public Dashboard_page(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getdashboard() {
		return driver.findElement(By.tagName("h1"));
	}

	public WebElement getDashboard_img() {
		return driver.findElement(By.xpath("//h1[text()='Dashboard']"));
	}
}
