package COM.TCS.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	public WebDriver driver;
	
	@FindBy(css = "input[placeholder='Search']")
	WebElement searchbox;
	
	@FindBy(xpath = "(//a[@unbxdattr='product'])[10]")
	WebElement product_name_orange;
	
	@FindBy(xpath = "div[class='flip-front flip-front-details']")
	static List<WebElement> product_discription_orange;
	
	@FindBy(xpath = "(//a[@unbxdattr='product'])[8]")
	static WebElement product_name_apple;
	
	@FindBy(xpath = "div[class='js_product_card product_card_details']")
	static List<WebElement> product_discription_apple;
	
	@FindBy(xpath = "(//a[@unbxdattr=\"product\"])[2]")
	static WebElement product_name_mango;
	
	@FindBy(xpath = "div[class='flip-front flip-front-details']")
	static List<WebElement> product_discription_mango;
	
	
	
	@FindBy(css="div[class='search-results-title']")
	WebElement Search_Result;
	
	public dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement SearchBox() {
		return searchbox;
	}
	
	public WebElement ProductName_orange() {
		return product_name_orange;
	}
	
	public WebElement ProductName_mango() {
		return product_name_mango;
	}
	
	public WebElement ProductName_apple() {
		return product_name_apple;
	}
	
	public WebElement SearchResult() {
		return Search_Result;
	}
	
	public static List<WebElement> List_Orange() {
		return product_discription_orange;
	}
	
	public static List<WebElement> List_Apple() {
		return product_discription_apple;
	}
	
	public static List<WebElement> List_Mango() {
		return product_discription_mango;
	}

}
