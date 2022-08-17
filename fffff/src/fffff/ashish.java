package fffff;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ashish {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input#keepLoggedInCheckBox")).click();
		driver.findElement(By.cssSelector("input#keepLoggedInCheckBox")).click();
		driver.findElement(By.cssSelector("td#loginButtonContainer")).click();
		driver.findElement(By.cssSelector("div#container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		Thread.sleep(5000);
		WebElement dropdown1 = driver.findElement(
				By.xpath("//div[@class='dropdownContainer addNewMenu']//div[@class='item createNewTasks']"));
		// dropdown1.click();
		WebElement arrow = driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]"));

		driver.findElement(By.xpath("(//div[@class='dropdownButton'])[15]")).click();

		if (dropdown1.isDisplayed()) {
			arrow.click();
		}

		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='searchItemList']//div"));
		if (lst.size() > 5) {
			Iterator<WebElement> itr = lst.iterator();
			while (itr.hasNext()) {
				WebElement aa1 = itr.next();
				try {
					if (aa1.getText().equalsIgnoreCase("Big Bang Company")) {

					}
				} catch (StaleElementReferenceException e) {
					aa1.click();
				}
			}

			arrow.click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("(//div[@class='dropdownButton'])[16]")).click();

			Thread.sleep(3000);

			List<WebElement> lst1 = driver.findElements(By.xpath("//div[@class='searchItemList']//div"));
			if (lst1.size() > 5) {
				Iterator<WebElement> itr2 = lst1.iterator();
				while (itr2.hasNext()) {
					WebElement aa = itr2.next();
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(aa));
					
			if(aa.getText().equalsIgnoreCase("- New Project -")) {
						aa.click();
						

						driver.findElement(By.cssSelector("input[class*='newProject ']")).sendKeys("GAURAV KAKA");
						driver.findElement(By.xpath("(//input[@class='inputFieldWithPlaceholder'])[1]"))
								.sendKeys("GAURAV");
						driver.findElement(By.xpath(
								"(//td[@class=\"x-btn-center\"]//em[@unselectable='on']//button[text()='set deadline'])[1]"))
								.click();
						Thread.sleep(3000);
						String month = "july";
						String year = "2022";
						String date = "25";
						while (true) {
							String dateyear = driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]"))
									.getText();
							String date_year[] = dateyear.split(" ");

							if (date_year[0].equalsIgnoreCase(month) && date_year[1].equalsIgnoreCase(year)) {
								break;
							} else {
								driver.findElement(By.xpath("(//a[@class=\" x-unselectable\"])[2]")).click();
							}
						}
						List<WebElement> dat = driver.findElements(By.xpath("//a[@class=\"x-date-date\"]"));

						Iterator<WebElement> itrrr = dat.iterator();
						while (itrrr.hasNext()) {
							WebElement tarik = itrrr.next();
							if (tarik.getText().equalsIgnoreCase(date)) {
								tarik.click();
							}
						}
						driver.findElement(By.xpath(
								"//div[@class='commitButtonPlaceHolder']//div[@class='components_button_label']"))
								.click();

						boolean flag = driver.findElement(By.xpath("//div[text()='GAURAV']")).isDisplayed();

						Assert.assertEquals(flag, true);

						driver.findElement(By.xpath("(//div[@class=\"img\"])[2]")).click();
						driver.findElement(By.xpath("//div[@class=\"delete button\"]")).click();
						driver.findElement(By.xpath("(//span[@class=\"submitTitle buttonTitle\"])[3]")).click();

						if (!flag) {
							System.out.println("entry is deleted successfully");
						}
				}
				}
					}
				}
			}
		}
	

