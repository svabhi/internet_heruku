package com.internet_heruku.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPageP {
	WebDriver driver;
	
	public CheckBoxesPageP(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(linkText="Checkboxes")
   private WebElement checkboxesLink;
    
    @FindBy(xpath="(//form[@id='checkboxes']//input)1]")
    private WebElement checkboxone;
    
    @FindBy(xpath="(//form[@id='checkboxes']//input)[2]")
    private WebElement checkboxtwo;
    
    public void clickOnCheckBoxLink() {
    	checkboxesLink.click();
    }

}
