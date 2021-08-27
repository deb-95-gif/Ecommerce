package com.qa.ecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerece.pages.OrderAddress;
import com.qa.ecommerece.pages.OrderPage;
import com.qa.ecommerece.pages.SignINPage;

public class OrderAddressTest extends TestBase {
	
	SignINPage signIn;
	OrderPage orderPage;
	OrderAddress orderAddress;
	
	public OrderAddressTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
	intialization();
	signIn = new SignINPage();
	orderPage  =  signIn.addProductCart();
	orderAddress = orderPage.clickOnCheckOut();
	
	}
	
//	@Test(priority = 1)
//	public void validatePageTitle() {
//		String title = orderAddress.validatePageTitle();
//		Assert.assertEquals(title, "Order - My Store");
//	}
	
	@Test(priority = 2)
	public void validateBillingAddress() {
		String addRess = orderAddress.validateBillingAddress();
		Assert.assertEquals(addRess, 
"DEBANJAN BHOWMICK" + "Self Employed" + "301, Raj Palace Apartment,3rd Floor , Boripara , Pandabnagar Near West Guwahati Commerce College" +"Cleveland, Ohio 44101" +"United States" +"0361244343" +"7002478770");
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
	
	
	

}
