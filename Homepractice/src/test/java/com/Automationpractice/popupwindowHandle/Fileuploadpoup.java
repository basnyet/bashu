package com.Automationpractice.popupwindowHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpoup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();            
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.get("https://html.com/input-type-file/");
		
		
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@type=\"file\"]"));
		
		scrollIntoView(driver,chooseFile);
		
		
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		
	
		
		//jse.executeScript("arguments[0].scrollIntoView(true);",chooseFile);
		
	
	

	//	element.sendKeys("C:\\Users\\basny_gg\\OneDrive\\Documents.xlsx");
		
		
		//scrollIntoView(driver,element);

	

	

	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element) {         //Scroll Page down in particular element
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	

}


