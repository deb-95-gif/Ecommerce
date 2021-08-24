package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class OrderPage extends TestBase {
	
	//Web Element Locators
	@FindBy(xpath = "//td[@class='cart_product']//img[@alt='Faded Short Sleeve T-shirts']")
	WebElement prdImg;
	
	@FindBy(xpath = "//a[@title='Add']")
	WebElement addQty;
	
	@FindBy(xpath = "//a[@title='Subtract']")
	WebElement minusQty;
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	WebElement msg;
	
	@FindBy(xpath = "//td[@class='price']//span[contains(text(),'$18.51')]")

	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String verifyChangeinQtyMessageadd() {
		addQty.click();
		addQty.click();
		String message = msg.getText();
		return message;
	}

	public String verifyChangeinQtyMessageasub() {
		minusQty.click();
		String message = msg.getText();
		return message;
	}

}
