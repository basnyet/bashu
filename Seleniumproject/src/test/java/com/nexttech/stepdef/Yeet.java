package com.nexttech.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.YeetPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Yeet {
WebDriver driver;

@Given("^User is at yeet homepage\\.$")
public void user_is_at_yeet_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.yeet.com");
	
	 
    }

@When("^User click department\\.$")
public void user_click_department() throws Throwable {
	YeetPage obj = new  YeetPage(driver);
	user_click_department();
    
}

@Then("^User can click select a product\\.$")
public void user_can_click_select_a_product() throws Throwable {
	
	 
    
}
}
