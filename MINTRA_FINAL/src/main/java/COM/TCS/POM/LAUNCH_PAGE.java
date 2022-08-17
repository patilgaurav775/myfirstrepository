package COM.TCS.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LAUNCH_PAGE {
	WebDriver driver;
	
	@FindBy(css = "a[href='/']")
	WebElement get_symbol;
	
	@FindBy(css = "div[class='desktop-navLink'] a[href='/shop/men']")
	WebElement get_men;
	
	@FindBy(css = "div[class='desktop-navLink'] a[href='/shop/women']")
	WebElement get_women;
	
	@FindBy(css = "div[class='desktop-navLink'] a[href='/shop/kids']")
	WebElement get_kid;
	
	@FindBy(css = "div[class='desktop-navLink'] a[href='/shop/home-living']")
	WebElement get_home_Living;
	
	
	@FindBy(css = "div[class='desktop-navContent'] div[class='desktop-navLink'] a[href='/personal-care']")
	WebElement get_beauty;
	
	@FindBy(css = "div[class='desktop-navLink'] a[href='/studio/home']")
	WebElement get_studio;
	
	@FindBy(css = "input[placeholder='Search for products, brands and more']")
	WebElement get_searchbox;
	
	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/div")
	WebElement get_men_redio_button;
	
	@FindBy(xpath = "//li//label[@class='common-customRadio gender-label']//input[@value='boys,boys girls']")
	WebElement get_boys_redio_button;
	
	@FindBy(xpath = "//a[@href=\"/men-topwear\"]")
	WebElement get_top_wear;
	
	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label/div")
	WebElement get_flipflop_colour_black;
	
	@FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[1]/label")
	WebElement get_Value_between_1495_2620;
	
	public LAUNCH_PAGE(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement get_symbol() {
		return get_symbol;
	}
	
	public WebElement get_men() {
		return get_men;
	}
	
	public WebElement get_women() {
		return get_women;
	}
	
	public WebElement get_kid() {
		return get_kid;
	}
	
	public WebElement get_home_Living() {
		return get_home_Living;
	}
	
	public WebElement get_beauty() {
		return get_beauty;
	}
	
	public WebElement get_studio() {
		return get_studio;
	}
	
	public WebElement get_top_wear() {
		return get_top_wear;
	}
	
	public WebElement get_searchbox() {
		return get_searchbox;
	}
	
	public WebElement get_men_redio_button() {
		return get_men_redio_button;
	}
	
	public WebElement get_boys_redio_button() {
		return get_boys_redio_button;
	}
	
	public WebElement get_Value_between_1495_2620() {
		return get_Value_between_1495_2620;
	}
	
	public WebElement get_flipflop_colour_black() {
		return get_flipflop_colour_black;
	}
}
