package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MrBoolActions {

WebDriver driver;

@Given("^User in Home page of MrBool website\\.$")
public void user_in_Home_page_of_MrBool_website() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("http://mrbool.com/");
	  
	  
	  Actions action = new Actions(driver);
	  
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	
		
action.moveToElement(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[1]/a"))).build().perform();

action.moveToElement(driver.findElement(By.xpath("//a[@href=\"http://mrbool.com/course\"]"))).build().perform();
WebDriverWait wait2 = new WebDriverWait(driver,20);
		action.moveToElement(driver.findElement(By.xpath("//a[@href=\"http://mrbool.com/pocket-video\"]")));
}
    








@When("^User click Content botton\\.$")
public void user_click_Content_botton() throws Throwable {
}

@Then("^User able to click single video botton\\.$")
public void user_able_to_click_single_video_botton() throws Throwable {
	 
}
}