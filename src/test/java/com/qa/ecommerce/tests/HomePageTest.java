package com.qa.ecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerece.pages.HomePage;
import com.qa.ecommerece.pages.MyAccountPage;
import com.qa.ecommerece.pages.SignINPage;

public class HomePageTest extends TestBase {
	
	SignINPage signInPage;
	HomePage homePage;
	MyAccountPage myAccountPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		signInPage = new SignINPage();
		homePage = new HomePage();
		myAccountPage = new MyAccountPage();
	}
	
	
	@Test(priority = 1)
	public void MYAccountPageTitleTest() {
		signInPage.SigninAction();
		myAccountPage = homePage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title =  myAccountPage.validateMyAccountPageTitle();
		Assert.assertEquals(title, "My account - My Store");
	}
	
//	@Test(priority = 2)
//	public void validateSuccessMesgafteraddingToCart() {
//		homePage.addProductCart();
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
