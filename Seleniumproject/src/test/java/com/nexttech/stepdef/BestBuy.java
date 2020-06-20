package com.nexttech.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestBuy {

	
	WebDriver driver;
	

@Given("^User in Home page of BestBuy website\\.$")
public void user_in_Home_page_of_BestBuy_website() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://www.BestBuy.com");
    }
@When("^User click product botton\\.$")
public void user_click_product_botton() throws Throwable {
	Actions action = new  Actions(driver);
	Thread.sleep(3000);
action.moveToElement(driver.findElement(By.xpath("//span[@class=\"flyBtn\"]"))).build().perform();
//Thread.sleep(3000);
//action.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-menu-155\"]/li[3]/ul/li[5]/button"))).build().perform();
//Thread.sleep(3000);
//action.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-menu-61\"]/li[1]/button"))).build().perform();
//Thread.sleep(3000);
//action.moveToElement(driver.findElement(By.xpath("//*[@id=\"header-menu-50\"]/li[1]/a"))).build().perform()Thread.sleep(3000);
}

@Then("^User able to choose single product through this\\.$")
public void user_able_to_choose_single_product_through_this() throws Throwable {
 
}

	
}
