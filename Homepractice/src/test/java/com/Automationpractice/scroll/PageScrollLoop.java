package com.Automationpractice.scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();                           
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/infinite_scroll");          //   //Scroll loop or
		                                                                          // //scroll dynamically for lodaing page(loop)
		
		            
			JavascriptExecutor jse =(JavascriptExecutor)driver;
			     long initialHight=(long)jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			     
			     while(true) {
		     
			jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");  
		    long currentlHight=(long)jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		    if(initialHight==currentlHight) {
		    	break;
		    }
		    initialHight=currentlHight;
		    
			     }  

	}
	
}
