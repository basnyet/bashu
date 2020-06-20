package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class AHSinsPage {

	
   WebDriver driver;
   
	public AHSinsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//*[@class=\"ahs-blue bold ml-1\"]")
	WebElement Click_MyAccount;
	public WebElement MyAccount() {
		return Click_MyAccount;
		
	}
	
    @FindBy(name="login")
	WebElement Type_Email;
	public WebElement Email() {
		return Type_Email;
		}

	@FindBy(name="password")
	WebElement Type_password;
	public WebElement password() {
		return Type_password;
		
		
	}
   @FindBy(xpath="//*[@class=\"buttons\"]")
	WebElement Click_Login;
	public WebElement login() {
		return Click_Login;
		
	}
	
	
    }
