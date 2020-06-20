package com.Automationpractice.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationpracticeYouTubpagee {

	WebDriver driver;
	
	
	public  AutomationpracticeYouTubpagee(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
    @FindBy(xpath="//input[@id=\"search\"]")
	



WebElement Type_in_search_box;	
	public WebElement Type_in_search_box() {
		return Type_in_search_box;
		
	}
		
	@FindBy(xpath="//yt-icon[@class=\"style-scope ytd-searchbox\"]")
	WebElement Click_search_sign;
	public WebElement Click_search_sign() {
		return Click_search_sign;}
			
		}
		
	
	
	

	
	

