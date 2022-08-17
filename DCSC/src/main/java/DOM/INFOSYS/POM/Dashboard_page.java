
package DOM.INFOSYS.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Dashboard_page {
	WebDriver driver;
	
	
	@FindBy(tagName="h1")
	List<WebElement> get_dashboard;
	
	@FindBy(xpath="//h1[text()='Dashboard']")
	List<WebElement> getDashboard_img;
	
	
	@FindBy(xpath="//div[@id=\"panel_draggable_1_0\"]")
	List<WebElement> get_pie_chart;
	
	public Dashboard_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public List<WebElement> getdashboard() {
		//return driver.findElements(By.tagName("h1"));
		return get_dashboard;
	}

	public List<WebElement> getDashboard_img() {
		//return driver.findElement(By.xpath("//h1[text()='Dashboard']"));
		return getDashboard_img;
	}
	
	public List<WebElement> get_pie_chart() {
	return get_pie_chart;
	}
	
}
