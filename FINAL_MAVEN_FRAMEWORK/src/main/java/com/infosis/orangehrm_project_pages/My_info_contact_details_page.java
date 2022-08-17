package com.infosis.orangehrm_project_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class My_info_contact_details_page {

	WebDriver driver;

	public My_info_contact_details_page(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement get_contact_details() {
		return driver.findElement(By.xpath("//a[@href='/index.php/pim/contactDetails/empNumber/7']"));
	}
	
	public WebElement get_edit_button() {
		return driver.findElement(By.xpath("//input[@id='btnSave']"));
	}
	
	public WebElement get_address_street_1() {
		return driver.findElement(By.xpath("//input[@id='contact_street1']"));
	}
	
	public WebElement get_address_street_2() {
		return driver.findElement(By.xpath("//input[@id='contact_street2']"));
	}
	
	public WebElement get_city() {
		return driver.findElement(By.xpath("//input[@id='contact_city']"));
	}
	
	public WebElement get_state() {
		return driver.findElement(By.xpath("//input[@id='contact_province']"));
	}
	
	public WebElement get_Zip_postal_code() {
		return driver.findElement(By.xpath("//input[@id='contact_emp_zipcode']"));
	}
	
	public WebElement get_country() {
		return driver.findElement(By.xpath("//select[@id='contact_country']"));
	}
	
	public WebElement get_home_telephone_number() {
		return driver.findElement(By.xpath("//input[@id='contact_emp_hm_telephone']"));
	}
	
	public WebElement get_mobile_number() {
		return driver.findElement(By.xpath("//input[@id='contact_emp_mobile']"));
	}
	
	public WebElement get_work_telephone_number() {
		return driver.findElement(By.xpath("//input[@id='contact_emp_work_telephone']"));
	}
	
	public WebElement get_work_email() {
		return driver.findElement(By.xpath("//input[@id='contact_emp_work_email']"));
	}
	
	public WebElement get_other_email() {
		return driver.findElement(By.xpath("//input[@id='contact_emp_oth_email']"));
	}
	
	public WebElement get_add_attachment_button() {
		return driver.findElement(By.xpath("//input[@id='btnAddAttachment']"));
	}
	
	public WebElement get_attachment_heading() {
		return driver.findElement(By.xpath("//h1[text()='Attachments']"));
	}
	
	public WebElement get_add_attachment_heading() {
		return driver.findElement(By.xpath("//h1[text()='Add Attachment']"));
	}
	
	public WebElement get_choose_file() {
		return driver.findElement(By.xpath("//input[@name='ufile']"));
	}
	
	public WebElement get_comment() {
		return driver.findElement(By.xpath("//textarea[@name='txtAttDesc']"));
	}
	
	public WebElement get_upload_button() {
		return driver.findElement(By.xpath("//input[@value='Upload']"));
	}
	
	public WebElement get_cancel_button() {
		return driver.findElement(By.xpath("//input[@id='cancelButton']"));
	}
	
	
	
}
