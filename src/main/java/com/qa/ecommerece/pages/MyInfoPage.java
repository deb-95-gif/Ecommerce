package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class MyInfoPage extends TestBase {
	
	//Web Element Locators
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstNameField;
	
	@FindBy(xpath = "//input[@id='lastname']")
	WebElement lastnameField;
	
	@FindBy(xpath ="//input[@id='email']")
	WebElement emailField;
	
	@FindBy(xpath = "//select[@id='days']")
	WebElement dayField;
	
	@FindBy(xpath = "//select[@id='months']")
	WebElement monthField;
	
	@FindBy(xpath = "//select[@id='years']")
	WebElement yearField;
	
	
	public MyInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidatePageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String verifyfirstName() {
	String text =  firstNameField.getAttribute("value");
	return text;
	}
	
	
	public String verifyLastNameField() {
		String text = lastnameField.getAttribute("value");
		return text;
	}
	
	public String verifyEmailField() {
		String text = emailField.getAttribute("value");
		return text;
	}
	
	public String verifyDayField() {
		String text = dayField.getAttribute("value");
		return text;
	}
	
	public String verifyMonthField() {
		String text = monthField.getAttribute("value");
		return text;
	}
	
	public String verifyyearField() {
		String text = yearField.getAttribute("value");
		return text;
	}
	
	
	
	
	
	
	

}
