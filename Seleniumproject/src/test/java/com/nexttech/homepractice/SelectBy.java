package com.nexttech.homepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBy {
	
    WebDriver driver;
	
public  void main (String[]args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	 
   driver.get("https://www.facebook.com");

       WebElement month = driver.findElement(By.id("month"));


        WebElement day = driver.findElement(By.id("day"));


         WebElement year = driver.findElement(By.id("year"));



Select select = new Select(month);
select.selectByVisibleText("Sep");

Select select1= new Select(day);
select1.selectByValue("19");
	
Select select3 = new Select(year);
select3.selectByValue("1989");

}


}

	
	
	
	
	
	
	
	
	


