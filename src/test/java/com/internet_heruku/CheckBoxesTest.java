package com.internet_heruku;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter_heruku.qa.base.BaseClass;
import com.internet_heruku.pages.CheckBoxesPageP;

public class CheckBoxesTest extends BaseClass{
	public WebDriver driver;
  // Properties prop;

	public CheckBoxesTest() throws IOException {
		super();
	}
   @AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@BeforeMethod
	public void setUp() throws IOException {
		
		driver = initializeBrowserAndOpenAppUrl(prop.getProperty("browserName"));
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void clickonCheckBoxesLink() {
		
		 CheckBoxesPageP checkboxpage = new CheckBoxesPageP(driver);
		//WebElement checkboxLink = driver.findElement(By.linkText("Checkboxes"));
		//checkboxLink.click();
		 checkboxpage.clickOnCheckBoxLink();
		WebElement checkbox2 = driver.findElement(By.cssSelector("form#checkboxes>input:nth-of-type(2)"));
		WebElement checkbox1 = driver.findElement(By.cssSelector("form#checkboxes>input:nth-of-type(1)"));
		Assert.assertTrue(checkbox2.isSelected());
		Assert.assertFalse(checkbox1.isSelected());
		System.out.println("Enter Some Data in CheckBoxesPage Page");
	}
}
