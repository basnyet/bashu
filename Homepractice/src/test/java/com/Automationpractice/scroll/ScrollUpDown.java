package com.Automationpractice.scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();            
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.get("https://html.com/input-type-file/");
		
		
		
		

		 scrollPagedown(driver);
		 
		Thread.sleep(4000);
		
		scrollPageup(driver);
		
	}
	
	public static void scrollPagedown(WebDriver driver) {                         //Scroll Page down
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,45000)");
	}

	public static void scrollPageup(WebDriver driver) {                         //Scroll Page up
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-45000)");
}
	
}
