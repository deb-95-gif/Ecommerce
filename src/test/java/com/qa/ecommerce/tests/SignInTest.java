package com.qa.ecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerce.utils.TestUtil;
import com.qa.ecommerece.pages.SignINPage;
import com.qa.ecommerece.pages.HomePage;
import com.qa.ecommerece.pages.MyAccountPage;

public class SignInTest extends TestBase {
	
	//TestUtil util;
	SignINPage signIn;
	HomePage homePage;
	public SignInTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		signIn  = new SignINPage();
		homePage = new HomePage();
		
	}
	
	@Test(priority = 1)
	public void SignInPageTitletest() {
	String  title =	signIn.validateSignInPageTitle();
	Assert.assertEquals(title, "My Store");
	}
	
//	@Test(priority = 2)
//	public void Logintest() {
//	signIn.SigninAction();
//	String title = homePage.validateHomePageTitle();
//	Assert.assertEquals(title, "Login - My Store");
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
