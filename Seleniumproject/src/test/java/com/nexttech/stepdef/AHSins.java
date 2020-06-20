package com.nexttech.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.AHSinsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AHSins {
	WebDriver driver;
	
	@Given("^User in AHSins my account page$")
	public void user_in_AHSins_my_account_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.AmericanHomeShield.com");
	   }

@Given("^User click MyAccount botton$")
public void user_click_MyAccount_botton() throws Throwable {
	AHSinsPage obj = new AHSinsPage(driver);
	//WebDriverWait wait = new WebDriverWait (driver, 20);
	Thread.sleep(5000);
	obj.MyAccount().click();
}

	@When("^User Type <\"([^\"]*)\">and<\"([^\"]*)\">$")
	public void user_Type_and(String arg1, String arg2) throws Throwable {
		AHSinsPage obj = new AHSinsPage(driver);
		obj.Email().sendKeys(arg1);
		obj.password().sendKeys(arg2);
	    
	}

	@Then("^User click Login option$")
	public void user_click_Login_option() throws Throwable {
		AHSinsPage obj1 = new AHSinsPage(driver);
		obj1.login().click();
	  
	}

	@Then("^User able to open the this Account$")
	public void user_able_to_open_the_this_Account() throws Throwable {
	   
	}
}