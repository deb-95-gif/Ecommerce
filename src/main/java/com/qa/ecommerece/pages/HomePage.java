package com.qa.ecommerece.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;

	@FindBy(xpath = "//input[@name='passwd']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit' and @class ='button btn btn-default button-medium']")
	WebElement signInBtn;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	//to Intialize your Page Factory elements we
	//we use the PageFactory Method
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public MyAccountPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		signInBtn.click();
		return new MyAccountPage();
	}
	
//	public SignInPage clickSignIn() {
//		signInBtn.click();
//		return new SignInPage();
//	}
	
	
	
}
