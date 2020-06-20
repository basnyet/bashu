package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FbLoginPage {
	
	
WebDriver driver;
  
public FbLoginPage (WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

  @FindBy(name="email")
WebElement Type_EmailAddress;
public WebElement EmailAddress() {
	return Type_EmailAddress;
}
	
  @FindBy(name="pass")
	WebElement Type_password;
	public WebElement Password(){
		return Type_password;
	}
	
  @FindBy(id="u_0_b")
 WebElement Click_Login;
 public WebElement Login() {
	return Click_Login;
 }
 

}
