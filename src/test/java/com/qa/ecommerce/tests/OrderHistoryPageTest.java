package com.qa.ecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerece.pages.HomePage;
import com.qa.ecommerece.pages.MyAccountPage;
import com.qa.ecommerece.pages.OrderHistoryPage;
import com.qa.ecommerece.pages.SignINPage;


public class OrderHistoryPageTest extends TestBase {
	
	SignINPage signIn;
	HomePage homePage;
	MyAccountPage myAccountPage;
	OrderHistoryPage orderHistory;
	
	public OrderHistoryPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		signIn = new SignINPage();
		homePage = signIn.SigninAction();
		myAccountPage = homePage.login(prop.getProperty("username"), prop.getProperty("password"));
		orderHistory = myAccountPage.clickOrderHistoryButton();
	}
	
	@Test(priority = 1)
	public void validatePagetitle() {
		String title = orderHistory.validatePageTitle();
		Assert.assertEquals(title, driver.getTitle());
	}
	
	@Test(priority = 2)
	public void validateAlertMessage() {
		String text  = orderHistory.verifyAlertMessage();
		Assert.assertEquals(text, "You have not placed any orders.");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
