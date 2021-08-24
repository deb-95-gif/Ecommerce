package com.qa.ecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerece.pages.HomePage;
import com.qa.ecommerece.pages.MyAccountPage;
import com.qa.ecommerece.pages.MyAddressPage;
import com.qa.ecommerece.pages.MyInfoPage;
import com.qa.ecommerece.pages.SignINPage;

public class MyInfoPageTest extends TestBase {
	
	SignINPage signIn;
	HomePage homePage;
	MyAccountPage myAccountPage;
	MyAddressPage myAddressPage;
	MyInfoPage myInfo;
	
	public MyInfoPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() throws IOException {
		intialization();
		signIn = new SignINPage();
		homePage = signIn.SigninAction();
		myAccountPage = homePage.login(prop.getProperty("username"), prop.getProperty("password"));
		myInfo = myAccountPage.clickMYInfobtn();
		
	}
//	
//	@Test(priority = 1)
//	public void validatePageTitle() {
//		String title = myInfo.ValidatePageTitle();
//		Assert.assertEquals(title, "Identity - My Store");
//	}
	
	@Test(priority = 2)
	public void verifyFieldValues() {
		String field = myInfo.verifyfirstName();
		Assert.assertEquals(field, "DEBANJAN");
		String field2 = myInfo.verifyLastNameField();
		Assert.assertEquals(field2, "BHOWMICK");
		String field3 = myInfo.verifyEmailField();
		Assert.assertEquals(field3, "debanjan.beec.14@acharya.ac.in");
		String field4 = myInfo.verifyDayField();
		Assert.assertEquals(field4, "8");
		String field5 = myInfo.verifyMonthField();
		Assert.assertEquals(field5, "10");
		String field6 = myInfo.verifyyearField();
		Assert.assertEquals(field6, "1990");
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
