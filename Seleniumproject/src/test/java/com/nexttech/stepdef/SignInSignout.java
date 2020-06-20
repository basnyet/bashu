package com.nexttech.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.SignInSignoutPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSignout {
	
	WebDriver driver;
	
	
@Given("^the user want to SignIn and SignOff from osCommerce$")
public void the_user_want_to_SignIn_and_SignOff_from_osCommerce() throws Throwable {
   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
   driver= new ChromeDriver();
   driver.get("https://www.oscommers.com");
}

@When("^the user visit osCommerce website$")
public void the_user_visit_osCommerce_website() throws Throwable {
  
}

@When("^the user click the LoginLogo for Login$")
public void the_user_click_the_LoginLogo_for_Login() throws Throwable {
	 SignInSignoutPage obj = new  SignInSignoutPage(driver);
	 obj.LoginLogo().click();
}

@Then("^the user can click log in option$")
public void the_user_can_click_log_in_option() throws Throwable {
	 SignInSignoutPage obj2 = new  SignInSignoutPage(driver);
	 obj2.LogIn().click();
 
}

@Then("^the User can type <\"([^\"]*)\" and <\"([^\"]*)\">$")
public void the_User_can_type_and(String arg1, String arg2) throws Throwable {
	 SignInSignoutPage obj3 = new  SignInSignoutPage(driver);
	 obj3.Username().sendKeys(arg1);
	 obj3.Password().sendKeys(arg2);
    
}

@Then("^The User Click Login for open the page$")
public void the_User_Click_Login_for_open_the_page() throws Throwable {
	 SignInSignoutPage obj1 = new  SignInSignoutPage(driver);
	 obj1.Login().click();
   

}
@Then("^user can click sign off option for logout$")
public void user_can_click_sign_off_option_for_logout() throws Throwable {
   
}


	}

	
	
	


