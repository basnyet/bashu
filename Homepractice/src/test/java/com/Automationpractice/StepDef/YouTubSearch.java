package com.Automationpractice.StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Automationpractice.PageObjectModel.AutomationpracticeYouTubpagee;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YouTubSearch {

	WebDriver driver;              
	


	@Given("^the user is in youbtub home page site$")
	public void the_user_is_in_youbtub_home_page_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();            
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		driver.get("https://www.youtube.com/");
		
		
	}


	@When("^the user type in\"([^\"]*)\"$")
	public void the_user_type_in(String arg1) throws Throwable {
		
		//AutomationpracticeYouTubpagee youtub = new  AutomationpracticeYouTubpagee(driver);
		//youtub.Type_in_search_box().sendKeys("arg1")
		
		driver.findElement(By.id("search")).sendKeys(arg1);
		
	  
	}


	@When("^the user click in search sign$")
	public void the_user_click_in_search_sign() throws Throwable {
		//AutomationpracticeYouTubpagee youtub = new  AutomationpracticeYouTubpagee(driver);
		//youtub.Click_search_sign().click();
		
		driver.findElement(By.xpath("//yt-icon[@class=\"style-scope ytd-searchbox\"]")).click();
	  
	 
	}

	@Then("^usre can able to get this page$")
	public void usre_can_able_to_get_this_page() throws Throwable {
	  
	  
	}

}
