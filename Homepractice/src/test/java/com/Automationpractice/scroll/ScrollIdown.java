package com.Automationpractice.scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScrollIdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();                          
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
       driver.get("https://www.amazon.com/");
       

     scrollPagedown(driver);
	} 	
	public static void scrollPagedown(WebDriver driver) {                         //Scroll Page down
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,4500)");
	}

}