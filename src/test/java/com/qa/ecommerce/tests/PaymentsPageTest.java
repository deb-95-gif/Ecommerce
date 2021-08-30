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

public class PaymentsPageTest extends TestBase {
	
	SignINPage signIn;
	OrderPage orderPage;
	OrderAddress orderAddress;
	OrderShippingPage shippingPage;
	paymentPage payment = new paymentPage() ;
	payByBankWirePage bankWire = new payByBankWirePage();
	
	public PaymentsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		intialization();
		signIn = new SignINPage();
		orderPage = signIn.addProductCart();
		orderAddress = orderPage.clickOnCheckOut();
		shippingPage = orderAddress.addNewComment(prop.getProperty("addComment"));
		
	}
	
	@Test 
	public void validatebankWire() {
		payment = shippingPage.ischecked();
		bankWire = payment.clickonbankWirelink();
		String text =  bankWire.payByBankWire();
		Assert.assertEquals(text, "BANK-WIRE PAYMENT.\r" + 
				"You have chosen to pay by bank wire. Here is a short summary of your order:\r" + 
				"- The total amount of your order comes to: $18.51 (tax incl.)\r" + 
				"- We allow the following currency to be sent via bank wire: Dollar\r" + 
				"- Bank wire account information will be displayed on the next page.\r" + 
				"- Please confirm your order by clicking "I confirm my order.".\r"
				);
	}
	
//	@Test(priority = 1)
//	public void validateTotalPrice() {
//		String total  = payment.verifyTotalprice();
//		Assert.assertEquals(total, "$18.51");
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
