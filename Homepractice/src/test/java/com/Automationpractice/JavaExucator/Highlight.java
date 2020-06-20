package com.Automationpractice.JavaExucator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Highlight {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();            
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		WebElement emailorphone=
		
		driver.findElement(By.id("email"));
		
	    HighLightElement(driver,emailorphone);
		emailorphone.sendKeys("basnyetb@gmail.com");
		
		Thread.sleep(4000);
		WebElement password=
				
		driver.findElement(By.id("pass"));		
		 HighLightElement(driver, password);
		 password.sendKeys("Password");
		 
		 Thread.sleep(4000);
		 WebElement login=
		
		driver.findElement(By.id("u_0_b"));
		 HighLightElement(driver, login);
		 login.click();

	}
public static void HighLightElement(WebDriver driver, WebElement element) {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].setAttribute('style', 'background: yello; bordre: 2px solid red;') ", element);
	
	
	//jse.executeScript("arguments[0].setAttribute('style', 'bordre: 2px solid white;') ", element);  //back to normal color
	
}
	
	
}






