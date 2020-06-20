package com.Automationpractice.popupwindowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();            
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		driver.get("https://www.rediff.com/");
	
		driver.findElement(By.className("signin")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
