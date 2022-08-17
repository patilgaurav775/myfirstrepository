package com.tcs.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import COM.TCS.COMMON_FUNCTIONALITY.EXCEL_SHEET;
import COM.TCS.POM.dashboard;

public class first_test extends EXCEL_SHEET {

	@Test(priority = 1)
	public static void Orange() throws InterruptedException {
		dashboard name = new dashboard(driver);
		name.SearchBox().sendKeys(EXCEL_SHEET.getStringCellData("Orange juice", "Keyword"));
		Thread.sleep(5000);
		name.ProductName_orange().click();

		for (int i = 0; i <dashboard.List_Orange().size(); i++) {

			String str = dashboard.List_Orange().get(i).getText();
			String[] strarray = str.split("\\n");
			int o = 0;
			for (int j = strarray.length - 1; j >= 0; j--) {
				// System.out.println(strarray[j]);
				int columnnumber = o + 1;
				o++;
		EXCEL_SHEET.Updatecell(property.getProperty("Path"), property.getProperty("Sheet"), 1, columnnumber,strarray[j]);
			}
		}
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public static void Apple() throws InterruptedException {
		dashboard name = new dashboard(driver);
		name.SearchBox().sendKeys(EXCEL_SHEET.getStringCellData("Apple Juice", "Keyword"));
		Thread.sleep(5000);
		name.ProductName_apple().click();

		for (int i = 0; i < dashboard.List_Apple().size(); i++) {

			String str = dashboard.List_Apple().get(i).getText();
			String[] strarray = str.split("\\n");
			int o = 0;
			for (int j = strarray.length - 2; j >= 0; j--) {
				// System.out.println(strarray[j]);
				int columnnumber = o + 1;
				o++;
				EXCEL_SHEET.Updatecell(property.getProperty("Path"), property.getProperty("Sheet"), 2, columnnumber,
						strarray[j]);
			}
		}
		driver.navigate().back();
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public static void Mango() throws InterruptedException {
		dashboard name = new dashboard(driver);
		name.SearchBox().sendKeys(EXCEL_SHEET.getStringCellData("Mango Juice", "Keyword"));
		Thread.sleep(5000);
		name.ProductName_mango().click();

		List<WebElement> list = driver.findElements(By.cssSelector("div[class='flip-front flip-front-details']"));

		for (int i = 0; i < dashboard.List_Mango().size(); i++) {

			String str = dashboard.List_Mango().get(i).getText();
			String[] strarray = str.split("\\n");
			int o = 0;
			for (int j = strarray.length - 1; j >= 0; j--) {
				// System.out.println(strarray[j]);
				int columnnumber = o + 1;
				o++;
				EXCEL_SHEET.Updatecell(property.getProperty("Path"), property.getProperty("Sheet"), 3, columnnumber,
						strarray[j]);
			}
		}
		

	}
}
