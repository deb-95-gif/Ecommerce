package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class OrderHistoryPage extends TestBase {
	
	//Web Elelment Locators
	
	@FindBy(xpath = "//p[@class='alert alert-warning']")
	WebElement alertMessage;
	
	
	public OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		String text = driver.getTitle();
		return text;
	}
	
	public String verifyAlertMessage() {
		String text = alertMessage.getText();
		return text;
	}

}
