package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MrBoolActionPage {
	
	WebDriver driver;

	public MrBoolActionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[@href=\"http://mrbool.com/articles/listcomp.asp\"]")
	WebElement Click_Content;
	WebElement Click_Content() {
		return Click_Content;
	}
	@FindBy(xpath="//a[@href=\"http://mrbool.com/pocket-video\"]")
	WebElement Click_Single_Video;
	WebElement Click_Single_Video() {
		return Click_Single_Video;
		
	}
	
	
}
