package com.qa.ecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerece.pages.OrderAddress;
import com.qa.ecommerece.pages.OrderPage;
import com.qa.ecommerece.pages.OrderShippingPage;
import com.qa.ecommerece.pages.SignINPage;
import com.qa.ecommerece.pages.payByBankWirePage;
import com.qa.ecommerece.pages.paymentPage;

public class OrderAddressTest extends TestBase {
	
	SignINPage signIn;
	OrderPage orderPage;
	OrderAddress orderAddress;
	OrderShippingPage shippingPage = new OrderShippingPage();
	paymentPage payment = new paymentPage();
	payByBankWirePage bankWire = new payByBankWirePage();
	
	
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
	
//	@Test(priority = 2)
//	public void validateAddNewAddressBtnelementinTheUI() {
//		boolean flag = false; 
//		flag  = orderAddress.isaddNewaddRessBtnEnabled();
//		Assert.assertEquals(false, flag);
//	}
	
//	@Test
//	public void validateShippingPageTilte() {
//	shippingPage = orderAddress.addNewComment(prop.getProperty("addComment"));
//	String title  = shippingPage.validatePageTitle();
//	Assert.assertEquals(title, "Order - My Store");
//	}
	
//	@Test
//	public void validatePaymentPageTitle() {
//		shippingPage = orderAddress.addNewComment(prop.getProperty("addComment"));
//		payment = shippingPage.ischecked();
//		String title  = payment.verifyPagetitle();
//		Assert.assertEquals(title, "Order - My Store");
//	}
	
	@Test
	public void validatebankWire() {
		shippingPage = orderAddress.addNewComment(prop.getProperty("addComment"));
		//payment = shippingPage.ischecked();
		payment = shippingPage.ischecked();
		bankWire = payment.clickonbankWirelink();
		String text =  bankWire.payByBankWire();
		Assert.assertEquals("BANK-WIRE PAYMENT.\r\n" + 
				"You have chosen to pay by bank wire. Here is a short summary of your order:\r\n" + 
				"- The total amount of your order comes to: $18.51 (tax incl.)\r\n" + 
				"- We allow the following currency to be sent via bank wire: Dollar\r\n" + 
				"- Bank wire account information will be displayed on the next page.\r\n" + 
				"- Please confirm your order by clicking \"I confirm my order.\".",text);
	}

	
//	@Test(priority = 3)
//	public void validateBillingAddress() {
//		String addRess = orderAddress.validateBillingAddress();
//		Assert.assertEquals(addRess, 
//"DEBANJAN BHOWMICK" + "Self Employed" + "301, Raj Palace Apartment,3rd Floor , Boripara , Pandabnagar Near West Guwahati Commerce College" +"Cleveland, Ohio 44101" +"United States" +"0361244343" +"7002478770");
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
