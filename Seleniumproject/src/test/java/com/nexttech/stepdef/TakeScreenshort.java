package com.nexttech.stepdef;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.nexttech.pageobjectmodel.ContactusPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class TakeScreenshort{

	
	static WebDriver driver;
	
	

@Given("^the new user is in the oscommerce homepage$")
public static void the_new_user_is_in_the_oscommerce_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.oscommerce.com");
	

  }


@When("^user click on contact us option to go into the contact us page$")
public static void user_click_on_contact_us_option_to_go_into_the_contact_us_page() throws Throwable {
	ContactusPage obj = new ContactusPage(driver);
	obj.contactus_click().click();
	
}
	
@Then("^user can write \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
public static void user_can_write_and_and(String arg1, String arg2, String arg3) throws Throwable {
	
	ContactusPage obj1 = new ContactusPage(driver);

	obj1.type_full_name().sendKeys(arg1);
	
	obj1.type_email_address().sendKeys(arg2);

	obj1.type_message().sendKeys(arg3);
    }
@Then("^User click continue botton to go next step$")
public static void user_click_continue_botton_to_go_next_step() throws Throwable {
	ContactusPage obj2 = new ContactusPage(driver);
    obj2.click_continue().click();
   // Thread.sleep(3000);
   // driver.navigate().back();
    //Thread.sleep(3000);
   // driver.navigate().forward();
    //Thread.sleep(5000);
    //driver.navigate().refresh();
    //driver.close();
    //driver.quit();
  
TakesScreenshot ts = (TakesScreenshot)driver;
File source = ts.getScreenshotAs(OutputType.FILE);
System.out.println("the screenshot is taken");

} 
}


