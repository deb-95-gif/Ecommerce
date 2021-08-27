package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class OrderAddress extends TestBase {
	
	//Web locators
	//for Billing Address
	
	@FindBy(css = "ul[class='address alternate_item box'] li[class='address_firstname address_lastname']")
	WebElement Name;
	
	@FindBy(css = "ul[class='address alternate_item box'] li[class='address_company']")
	WebElement empStatus;
	
//	@FindBy(css = "ul[class='address alternate_item box'] li[class='address_city address_state_name address_postcode']")
//	WebElement houseAddress;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/ul[1]/li[3]")
	WebElement houseAdd;
	
//	@FindBy(css = "ul[class='address alternate_item box'] li[class='address_city address_state_name address_postcode']")
//	WebElement city;
	
	@FindBy(css = "ul[class='address alternate_item box'] li[class='address_country_name']")
	WebElement countryName;
	
	@FindBy(css = "ul[class='address alternate_item box'] li[class='address_phone']")
	WebElement phnNum;
	
	@FindBy(css = "ul[class='address alternate_item box'] li[class='address_phone_mobile']")
	WebElement mbNum;
	
	public OrderAddress() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String validateBillingAddress() {
		String name  = Name.getText();
		String empStaus = empStatus.getText();
		String houseAddress = houseAdd.getText();
	//	String City = city.getAttribute(" ");
		String country = countryName.getText();
		String phn = phnNum.getText();
		String Mn = mbNum.getText();
		return name+empStaus+houseAdd+country+phn+Mn;
	}
}
