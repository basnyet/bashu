package com.Automationpractice.scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();            
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
      
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		WebElement itemPerPageSelect=
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[2]/div[1]/div[2]/select"));
		itemPerPageSelect.click();
		Select select = new Select(itemPerPageSelect);
		
		select.selectByVisibleText("30");
	
				
	
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
		efwd.executeScript("document.xpath('//*[@id=\"1591192126188-grid-container\"]/div[2]').ScrollTop-1000");
	}

}
