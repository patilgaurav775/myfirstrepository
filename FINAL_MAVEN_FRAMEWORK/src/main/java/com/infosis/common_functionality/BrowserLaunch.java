package com.infosis.common_functionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserLaunch {

	public static Properties property;
	public static WebDriver driver;

	public static void read_property_file() {

		try {
			property = new Properties();

			FileInputStream file = new FileInputStream(".\\resources\\config.properties");

			property.load(file);
		}

		catch (FileNotFoundException e) {

		} catch (IOException e) {
			// TODO: handle exception
		}

	}

	@BeforeSuite(alwaysRun = true)
	public void launch() {

		BrowserLaunch.read_property_file();

		String Browser_Name = property.getProperty("Browsername");

		String url = property.getProperty("url");

		if (Browser_Name.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (Browser_Name.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		else {
			System.setProperty("webdriver.edge.driver", "resources\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.get(url);

		driver.manage().window().maximize();

	}

	@AfterSuite(alwaysRun = true)

	public void teardown() {
		driver.quit();
	}

}
