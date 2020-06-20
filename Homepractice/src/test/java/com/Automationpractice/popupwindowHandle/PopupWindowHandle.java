package com.Automationpractice.popupwindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();            
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		System.out.println("The title of the main window:" + driver.getTitle());
		
		//WebElement tabbedWindowsButton = 
		//driver.findElement(By.xpath("//a[@href=\"#Tabbed\"]"));
		// tabbedWindowsButton.click();
		// System.out.println("The title of the main window:" + driver.getTitle());
		 Thread.sleep(3000);
		 
		

		WebElement click=
		 driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
		click.click();
		  System.out.println("The title of the main window:" + driver.getTitle());
		 Thread.sleep(5000);
		
	    Set<String> window = driver.getWindowHandles();
        Iterator<String> iter = window.iterator();
        
        String mainwindow = iter.next();
        String childwindow = iter.next();
        
       driver.switchTo().window("childwindow");  
        System.out.println("The title of the main window:" + driver.getTitle());
		 
        driver.close();
        Thread.sleep(3000);
        
        driver.switchTo().window(mainwindow);
       System.out.println("The title of the main window:" + driver.getTitle());

	}

}

  
//Alert alrt= driver.switchTo().alert();
//alrt.sendKeys("basnyetb@yahoo.com");
//alrt.accept();



//Alert alrt= driver.switchTo().alert();















