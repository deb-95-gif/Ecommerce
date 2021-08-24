package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class MyAddressPage extends TestBase {
	
	//Define the Locators
	@FindBy(xpath = "//ul[@class='last_item item box']")
	WebElement myadressVerifytext;
	
	
	
	public MyAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateMyAddressPageTile() {
		String title = driver.getTitle();
		return title;
	}
	
	public String validateMyAddress() {
		String addressField = myadressVerifytext.getText();
		return addressField;
	}

}
