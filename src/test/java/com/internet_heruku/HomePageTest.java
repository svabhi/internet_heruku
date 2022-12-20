package com.internet_heruku;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inter_heruku.qa.base.BaseClass;
import com.internet_heruku.pages.HomePageP;

public class HomePageTest extends BaseClass{
	public WebDriver driver;
	HomePageP homepagep;
	//Properties prop;
	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		
		driver = initializeBrowserAndOpenAppUrl(prop.getProperty("browserName"));
		driver.get(prop.getProperty("url"));
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void verifyHomePageOpen() {
		String title = driver.getTitle();
		System.out.println(title);
		String curUrl = driver.getCurrentUrl();
		System.out.println(curUrl);
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Welcome to the-internet']")).isDisplayed());
		Assert.assertEquals(curUrl, "https://the-internet.herokuapp.com/", "CurrentURL is NOT NOT Correct");
	}

	/*
	 * @Test(priority = 2) public void clickOnABTestLink() {
	 * driver.findElement(By.linkText("A/B Testing")).click();
	 * Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed()); }
	 */

	@Test
	public void VerifycountOfLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is" + links.size());
		System.out.println("Enter Some Data in HomePage Page");
	}
	
//	@Test
//	public void VerifyForkMe() {
//		WebElement ForkMe = driver.findElement(By.tagName("img"));
//		Assert.assertEquals(true, ForkMe.isDisplayed());
//	}
	
	@Test
	public void VerifyForkMe() {
		homepagep = new HomePageP(driver);
		homepagep.clickonForkImage();
	}

	/*
	 * @Test(priority = 3) public void clickOnAddRemoveElements() {
	 * driver.findElement(By.linkText("Add/Remove Elements")).click();
	 * Assert.assertTrue(driver.findElement(By.tagName("button")).isDisplayed());
	 * 
	 * }
	 */
}
