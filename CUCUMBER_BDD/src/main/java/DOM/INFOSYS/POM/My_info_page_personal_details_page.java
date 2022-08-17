package DOM.INFOSYS.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class My_info_page_personal_details_page  {

	WebDriver driver;

	public My_info_page_personal_details_page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement My_info() {
		return driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
	}
	////////////////////////////////////////////////PERSONAL DETAILS/////////////////////////////////////////////////////////////////
	public WebElement get_personal_details() {
		return driver.findElement(By.xpath("//li[@class='selected']//parent::ul"));
	}

	public WebElement get_Edit_button() {
		return driver.findElement(By.id("btnSave"));
	}

	public WebElement get_save_button() {
		return driver.findElement(By.id("btnSave"));
	}
	
	public WebElement get_first_name() {
		return driver.findElement(By.id("personal_txtEmpFirstName"));
	}
	
	public WebElement get_last_name() {
		return driver.findElement(By.id("personal_txtEmpLastName"));
	}
	
	public WebElement get_middle_name() {
		return driver.findElement(By.id("personal_txtEmpMiddleName"));
	}
	
	public WebElement get_Required_Error_for_first_name() {
		return driver.findElement(By.xpath("//span[@for='personal_txtEmpFirstName']"));
	}
	
	public WebElement get_Required_Error_for_last_name() {
		return driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']//following-sibling::span"));
	}

	public WebElement get_employee_id() {
		return driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']"));
	}
	
	public WebElement get_other_id() {
		return driver.findElement(By.xpath("//input[@name='personal[txtOtherID]']"));
	}
	
	public WebElement get_driving_licence() {
		return driver.findElement(By.xpath("//input[@name='personal[txtLicenNo]']"));
	}
	
	public WebElement get_click_licence_expiry_date() {
		return driver.findElement(By.xpath("//input[@name='personal[txtLicExpDate]']"));
	}
	
	public WebElement get_Select_licence_expiry_year() {
		return driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
	}
	
	//Select year=new Select(get_Select_licence_expiry_year());                               //YEAR SELECT
	
	public WebElement get_Select_licence_expiry_month() {
		return driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
	}
	
	//Select month=new Select(get_Select_licence_expiry_month());                        //MONTH SELECT
	
	public WebElement get_SSN_number() {
		return driver.findElement(By.xpath("//input[@name='personal[txtNICNo]']"));
	}
	
	public WebElement get_SIN_number() {
		return driver.findElement(By.xpath("//input[@name='personal[txtSINNo]']"));
	}
	
	public WebElement get_gender_male() {
		return driver.findElement(By.xpath("//label[text()='Male']"));
	}
	
	public WebElement get_gender_Female() {
		return driver.findElement(By.xpath("//label[text()='Female']"));
	}
	
	public WebElement get_Select_Material_status() {
		return driver.findElement(By.xpath("//select[@name='personal[cmbMarital]']"));
	}
	
	public WebElement get_Material_status() {
		return driver.findElement(By.xpath("//select[@name='personal[cmbMarital]']"));
	}
	
	//Select status=new Select(get_Material_status());                                              //STATUS SELECT
	
	public WebElement get_Select_Nationality() {
		return driver.findElement(By.xpath("//select[@name='personal[cmbNation]']"));
	}
	
	public WebElement get_Nationality() {
		return driver.findElement(By.xpath("//select[@name='personal[cmbNation]']"));
	}
	
	//Select nationality=new Select(get_Nationality());                                            //NATIONALITY SELECT
	
	public WebElement get_click_birth_date() {
		return driver.findElement(By.xpath("//input[@name='personal[DOB]']"));
	}
	
	public WebElement get_Select_birth_year() {
		return driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	}
	
	//Select birth_year=new Select(get_Select_birth_year());                               //BIRTH YEAR SELECT
	
	public WebElement get_Select_birth_month() {
		return driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	}
	
	//Select birth_month=new Select(get_Select_birth_month());                        //BIRTH MONTH SELECT
	
	
	public WebElement get_Nick_Name() {
		return driver.findElement(By.xpath("//input[@name='personal[txtEmpNickName]']"));
	}
	
	public WebElement get_Smoker_Checkbox() {
		return driver.findElement(By.xpath("//input[@name='personal[chkSmokeFlag]']"));
	}
	
	public WebElement get_Military_Service() {
		return driver.findElement(By.xpath("//input[@name='personal[txtMilitarySer]']"));
	}
	
	public WebElement get_edit_custom_button() {
		return driver.findElement(By.xpath("//input[@id='btnEditCustom']"));
	}
	
	public WebElement get_Select_blood_type() {
		return driver.findElement(By.xpath("//select[@name='custom1']"));
	}
	
	public WebElement get_edit_custom_feilds_headline() {
		return driver.findElement(By.xpath("//h1[text()='Custom Fields']"));
	}
	
	public WebElement get_add_attachment_button() {
		return driver.findElement(By.xpath("//input[@class='addbutton']"));
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
	
	public WebElement get_all_file_name() {
		return driver.findElement(By.xpath("//input[@id='attachmentsCheckAll']"));
	}
	
	public WebElement get_check_box_1() {
		return driver.findElement(By.xpath("//td//input[@value='2']"));
	}
	
	public WebElement get_check_box_2() {
		return driver.findElement(By.xpath("//td//input[@value='3']"));
	}
	
	public WebElement get_check_box_3() {
		return driver.findElement(By.xpath("//td//input[@value='1']"));
	}
	
	public WebElement get_attachment_delete_button() {
		return driver.findElement(By.xpath("//input[@id='btnDeleteAttachment']"));
	}
	
	public WebElement get_Required_feild_informatory_message() {
		return driver.findElement(By.xpath("//li[@class='required new']"));
	}
	
////////////////////////////////////////////////CONTACT DETAILS/////////////////////////////////////////////////////////////////	
	
	
}
