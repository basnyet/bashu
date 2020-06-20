package com.nexttech.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.FbLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin {
	
	WebDriver driver;
	
		@Given("^user go to Facebook website page$")
  public void user_go_to_Facebook_website_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
}

		@When("^UserType \"([^\"]*)\"and\"([^\"]*)\"$")
		public void usertype_and(String arg1, String arg2) throws Throwable {
   FbLoginPage obj = new FbLoginPage(driver);
	obj.EmailAddress().sendKeys(arg1);
	Thread.sleep(3000);
	obj.Password().sendKeys(arg2);
}

@When("^userclick Login or Signup option$")
public void userclick_Login_or_Signup_option() throws Throwable {
	FbLoginPage obj1 = new FbLoginPage(driver);
	obj1.Login().click();
} 



@Then("^user able to open the won facebook page\\.$")
public void user_able_to_open_the_won_facebook_page() throws Throwable {
   } 


}



