package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class OrderShippingPage extends TestBase {
	
	//locators using xpath
	
	@FindBy(xpath = "//div[@class='checker']//span")
	WebElement chckBox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	WebElement chkBtn;
	
	public OrderShippingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public paymentPage ischecked() {
		boolean flag = false ;
		if(chckBox.isDisplayed() == true) {
		chckBox.click();
		flag = chkBtn.isEnabled();
		if(flag!=false)
			chkBtn.click();
	}
		return new paymentPage();
		}
}
