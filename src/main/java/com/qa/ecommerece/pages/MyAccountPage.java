package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class MyAccountPage extends TestBase {
	
	MyAddressPage addressPage;
	
	@FindBy(xpath = "//span[normalize-space()='My addresses']")
	WebElement myAddressbtn;
	
	@FindBy(xpath = "//span[normalize-space()='My personal information']")
	WebElement MyPersonalInfobtn;
	
	@FindBy(xpath = "//span[normalize-space()='Order history and details']")
	WebElement orderHistoryDetails;
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement viewShoppingCart;
	
	@FindBy(xpath = "//span[normalize-space()='Check out']")
	WebElement checkOut;
	
	
//	@FindBy(xpath ="//span[@class='address_company']")
//	WebElement verifyMyAddress;
//	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateMyAccountPageTitle() { 
	String title = driver.getTitle();
	return title;
	}
	
	public MyAddressPage clickMYAdrress() {
		myAddressbtn.click();
		return new MyAddressPage();
	}
	
	
	public MyInfoPage clickMYInfobtn() {
		MyPersonalInfobtn.click();
		return new MyInfoPage();
	}
	

	public OrderHistoryPage clickOrderHistoryButton() {
		orderHistoryDetails.click();
		return new OrderHistoryPage();
	}

}
