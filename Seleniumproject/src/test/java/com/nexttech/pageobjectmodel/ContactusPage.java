package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {
	
	WebDriver driver;
	 public ContactusPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath = "//*[@id=\"columnLeft\"]/div[5]/div[2]/a[4]")
 WebElement contactus_click;
	 
	 public WebElement contactus_click() {
		return contactus_click;}
	 
	 @FindBy(name="name")
	 WebElement type_full_name;
	 
	 public WebElement type_full_name() {
		return type_full_name;}
	 
	 @FindBy(name="email")
	 WebElement type_email_address;
	 
	 public WebElement type_email_address() {
		return type_email_address;
	 }
    
	 
	 @FindBy(name="enquiry")
     WebElement type_message;
	 
    public WebElement type_message() {
		return type_message;}
      
@FindBy(className="ui-button-text")
WebElement click_continue;
public WebElement click_continue() {
	return click_continue;
	}

}    
     
     
     
