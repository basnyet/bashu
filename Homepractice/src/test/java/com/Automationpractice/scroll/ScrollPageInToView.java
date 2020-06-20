package com.Automationpractice.scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPageInToView {

	public static void main(String[] args) {                    
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();                           
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 
		driver.get("https://www.amazon.com/");
		
		
		
		
		WebElement Harry_Potter=
	driver.findElement(By.className("product-image"));
		
		scrollIntoView(driver,Harry_Potter);    //   //Scroll Page down in particular element
		
		 Harry_Potter.click();
	
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element) {         //Scroll Page down in particular element
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	
	
}
      
	  









