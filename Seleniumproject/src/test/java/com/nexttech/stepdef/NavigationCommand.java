package com.nexttech.stepdef;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	
	
WebDriver driver;
	public void Navigation() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.AmericanHomeShield.com");
		 driver.get("https://demo.oscommerce.com");
		 driver.navigate().back();
		 Thread.sleep(5000);
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 driver.close();
		 driver.quit();
	}

}
