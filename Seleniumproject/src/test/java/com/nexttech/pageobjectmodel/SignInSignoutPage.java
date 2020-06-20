package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInSignoutPage {
	

	WebDriver driver;
	
	public SignInSignoutPage(WebDriver driver) {
		
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
	}
   
	
	@FindBy(xpath="//*[@id=\"btnAccount\"]/svg/path")
	WebElement Click_LoginLogo;
	public WebElement LoginLogo() {
		return Click_LoginLogo;
	}

	
	@FindBy(xpath="//*[@class=\"dropdown-item\"]")
	WebElement Click_Login;
	public WebElement Login() {
		return Click_Login;}
	
	@FindBy(name="username")
			WebElement Type_Username;
	public WebElement Username() {
		return Type_Username;
	}
	
   @FindBy(id="inputPassword")
		   WebElement Type_Password;
   public WebElement Password() {
	   return Type_Password;
   }
			
   @FindBy(xpath="//button[@type=\"submit\"]")
	WebElement click_LogIn;
	public WebElement LogIn() {
		
		return click_LogIn;
	}
			
	@FindBy(name="manufacturers_id")
	WebElement click_Select;
	public WebElement Select() {
		return click_Select;
		
	}
}	

	


