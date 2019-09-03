package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebaypage {
	WebDriver driver;
	public Ebaypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath="//input[@id='userid']")
	WebElement userid_text;
	public WebElement getuserid_text() {
		return  userid_text;
	}
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	public WebElement getpassword() {
		return password;
	}
	@FindBy(id="sgnBt")
	WebElement Signinbutton;
	public WebElement getSigninbutton() {
		return Signinbutton;
	}

}
