package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class paymentPage extends TestBase {
	
	//web Element locators
	@FindBy(xpath = "//td[@class = 'price']")
	WebElement totalProducts;
	
	@FindBy(xpath = "//td[normalize-space()='$2.00']")
	WebElement totalShipping;
	
	@FindBy(xpath = "//tr[2]//td[1]")
	WebElement totalPrice;
	
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	WebElement payBybankWire;
	
	public paymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPagetitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String verifyTotalprice() {
	 String total = totalShipping.getText()+ totalProducts.getAttribute(" ");
		if(total == totalPrice.getText())
			System.out.println(total);
		return total;
		}
	
	public payByBankWirePage clickonbankWirelink() {
		payBybankWire.click();
		return new payByBankWirePage();
	}
}