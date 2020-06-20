package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FaceBookActionPage {
	
	WebDriver driver;
	
	public FaceBookActionPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="month")
	WebElement click_Month;
	WebElement ClickMonth() {
		return click_Month;
		}
	Select select = new Select(click_Month);
	
	

}
