package com.internet_heruku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageP {
	
	WebDriver driver;
   
	public HomePageP(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Objects
	@FindBy(tagName = "img") 
	private WebElement ForkImage;
	

	
	//Actions
	
	public void clickonForkImage() {
		ForkImage.click();
	}
	
	
}
