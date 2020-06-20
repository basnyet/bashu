package com.nexttech.stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.pageobjectmodel.SelectByDropDownPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectByDropDown {
	  
         WebDriver driver;
	
@Given("^the new user is in the facebook homepage$")
public void the_new_user_is_in_the_facebook_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
}
@When("^Usertype <\"([^\"]*)\">and<\"([^\"]*)\">$")
public void usertype_and(String arg1, String arg2) throws Throwable {
	SelectByDropDownPage obj = new SelectByDropDownPage(driver);
	obj.type_first_name().sendKeys(arg1);
	obj.type_last_name().sendKeys(arg2);
	}
@When("^User type <\"([^\"]*)\">and<\"([^\"]*)\">$")
public void user_type_and(String arg1, String arg2) throws Throwable {
	SelectByDropDownPage obj1 = new SelectByDropDownPage(driver);
	obj1.type_email_address().sendKeys(arg1);
	obj1.type_password().sendKeys(arg2);
}
@When("^user click select month to select month$")
public void user_click_select_month_to_select_month() throws Throwable {
	WebElement month = driver.findElement(By.id("month"));
	Select select = new Select(month);
	 select.selectByVisibleText("Sep");
}
@Then("^user click select day to select day$")
 public void user_click_select_day_to_select_day() throws Throwable {
	WebElement day = driver.findElement(By.id("day"));
	  Select select1= new Select(day);
	  select1.selectByValue("19");
	  Thread.sleep(3000);
	  }
	  
@Then("^User click year to selectyear$")
public void user_click_year_to_selectyear() throws Throwable {
	WebElement year = driver.findElement(By.id("year"));
	Select select3 = new Select(year);
    select3.selectByValue("1989");
    Thread.sleep(3000);
    }
@Then("^User click Gender$")
public void user_click_Gender() throws Throwable {
SelectByDropDownPage obj2 = new SelectByDropDownPage(driver);
            obj2.click_gender_male().click();
}
}

	

