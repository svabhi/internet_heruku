package com.internet_heruku.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABTestingPage {
	WebDriver driver;
	
	public ABTestingPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="div#content>ul>li>a")
	private WebElement abtestinglink;
	
	@FindBy(css="//h3[text()='A/B Test Variation 1']")
	private WebElement header;
	
	public void clickonheader() {
		header.click();
	}
	
	public void clickonabtestinglink() {
		abtestinglink.click();
	}

}
