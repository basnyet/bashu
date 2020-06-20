package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectByDropDownPage {
	
WebDriver driver;

public SelectByDropDownPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(name="firstname")
WebElement type_first_name;
public WebElement type_first_name() {
	return type_first_name;
	}
@FindBy(name="lastname")
WebElement type_last_name;
public WebElement type_last_name() {
	return type_last_name;}

@FindBy(name="reg_email__")
WebElement type_email_address;
public WebElement type_email_address() {
	return type_email_address;}


@FindBy(name="reg_passwd__")
WebElement type_password;
public WebElement type_password() {
	return type_password;}

@FindBy(name="sex")
WebElement click_gender_male;
public WebElement click_gender_male() {
	return click_gender_male;}

@FindBy(id="day")
WebElement select_day;
Select select = new Select(select_day);


}


