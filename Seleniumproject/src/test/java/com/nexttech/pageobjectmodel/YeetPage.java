package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YeetPage {
WebDriver driver;
   
     public YeetPage(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    	 }
     
  @FindBy(className="view")  
 WebElement click_departments;  
  WebElement click_departments() {
	return click_departments;}
  }
