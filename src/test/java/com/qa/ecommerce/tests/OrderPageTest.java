package com.qa.ecommerce.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerece.pages.HomePage;
import com.qa.ecommerece.pages.OrderPage;
import com.qa.ecommerece.pages.SignINPage;

public class OrderPageTest extends TestBase {
	
	SignINPage signIn;
	OrderPage order;

	public OrderPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		intialization();
		signIn = new SignINPage();
		order = signIn.addProductCart();
	   // order = new OrderPage();
	}
	
//	@Test(priority = 1)
//	public void validatepageTitle() {
//		String title = order.verifyPageTitle();
//		Assert.assertEquals(title, "Order - My Store" );
//	}
//	
//	@Test(priority = 2)
//	public void validateChangeinQuantityMessage() {
//		String message = order.verifyChangeinQtyMessageadd();
//		Assert.assertEquals(message, order.verifyChangeinQtyMessageadd());
//	}
//	
//	@Test(priority = 3)
//	public void validateChangeinQuantityMessagesb() {
//		String message = order.verifyChangeinQtyMessageasub();
//		Assert.assertEquals(message, order.verifyChangeinQtyMessageasub());
//	}
//	
//	@Test(priority = 4)
//	public void validateTotalChange() {
//		String total  = order.verifyTotal();
//		Assert.assertEquals(order.verifyTotal(), total);
//	}
	
//	@Test(priority = 5)
//	public void validateStock() {
//		boolean stock = false;
//		stock = order.verifyStockavailbility();
//		Assert.assertEquals(stock, true);
//	}
	
//	@Test(priority = 6)
//	public void validateTotal() {
//		String total = order.verifyTotal();
//		Assert.assertEquals(total, order.verifyTotal());
//	}
	
//	@Test(priority = 7)
//	public void validateUnitPrice() {
//		String untPrc = order.verifyUnitPrice();
//		Assert.assertEquals(untPrc, order.verifyUnitPrice());
//	}
	
	@Test(priority = 8)
	public void validatePageHeading() {
		String heading = order.verifyPageHeading();
		Assert.assertEquals(heading, order.verifyPageHeading());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
