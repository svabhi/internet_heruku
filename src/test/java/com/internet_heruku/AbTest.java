package com.internet_heruku;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inter_heruku.qa.base.BaseClass;
import com.internet_heruku.pages.ABTestingPage;
import com.internet_heruku.utils.Utilities;

public class AbTest extends BaseClass{
	public WebDriver driver;
	//Properties prop;
	ABTestingPage abtestingpage;
	public AbTest() throws IOException {
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
	
    @Test(priority=1)
//    		dataProvider="supplyTestDatatoAbPage")
	//public void verifyAbTestingPageOpened(String d1,String d2) 
    public void verifyAbTestingPageOpened() 
    
    {

		//driver.findElement(By.linkText("A/B Testing")).click();
    	abtestingpage = new ABTestingPage(driver);
    	abtestingpage.clickonabtestinglink();
    	Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='A/B Test Variation 1']")).isDisplayed());
		//Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='A/B Test Variation 1']")).isDisplayed());
		String curUrlAb = driver.getCurrentUrl();
		abtestingpage.clickonheader();
		System.out.println(curUrlAb + "A/B Testing Page is opened successfully in:  "+ prop.getProperty("browserName"));
		Assert.assertEquals(curUrlAb, "https://the-internet.herokuapp.com/abtest", "AbTesting Page is NOT Opened");
		//System.out.println("Entered data d1" +d1);
	//	System.out.println("Entered data d2" +d2);
	}
//    @DataProvider
//    public Object[][] supplyTestDatatoAbPage() {
//    	Object[][] data = Utilities.getTestDataFromExcel("AbTesting");
//    	return data;
//    	
//    }
}
