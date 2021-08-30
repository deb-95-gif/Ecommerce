package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class payByBankWirePage extends TestBase {
	
	//Web Element Locators
	@FindBy(xpath = "//div[@class='box cheque-box']")
	WebElement paragraph;
	
	public payByBankWirePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String payByBankWire() {
		String para = paragraph.getText();
		return para;
	}

}
