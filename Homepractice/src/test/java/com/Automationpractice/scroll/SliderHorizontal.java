package com.Automationpractice.scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SliderHorizontal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();                          
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/horizontal_slider");
	
		
		WebElement slideBar=
    	driver.findElement(By.xpath("//input[@type=\"range\"]"));
		slideBar.sendKeys(Keys.END);
		
		Thread.sleep(3000);
		slideBar.sendKeys(Keys.LEFT);
		
	
	}
	 
}


