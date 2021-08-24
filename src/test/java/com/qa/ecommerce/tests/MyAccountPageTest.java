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
import com.qa.ecommerece.pages.SignINPage;

public class MyAccountPageTest extends TestBase {
	
	SignINPage signin;
	HomePage homePage;
	MyAccountPage myAccount;
	MyAddressPage myAddress;
	
	public MyAccountPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		signin = new SignINPage();
		homePage = signin.SigninAction();
		myAccount = homePage.login(prop.getProperty("username"), prop.getProperty("password"));
		myAddress = myAccount.clickMYAdrress();
	}
	
//	@Test(priority = 1)
//	public void validateAddressPageTitle() {
//		//myAccount.clickMYAdrress();
//		String pageTitle = myAddress.validateMyAddressPageTile();
//		Assert.assertEquals(pageTitle, "Addresses - My Store");
//	}
//	
	@Test(priority = 1)
	public void validateAddressField() {
		//myAccount.clickMYAdrress();
		if(myAddress.driver.getPageSource().contains("MY ADDRESS\r\n" +
				"DEBANJAN BHOWMICK\r\n" + 
				"Self Employed\r\n" + 
				"301, Raj Palace Apartment,3rd Floor , Boripara , Pandabnagar Near West Guwahati Commerce College\r\n" + 
				"Cleveland, Ohio 44101\r\n" + 
				"United States\r\n" + 
				"0361244343\r\n" + 
				"7002478770\r\n" + 
				"Update\r\n" + 
				"Delete")) {
			System.out.println("Txt verified");
				
		}
//		Assert.assertEquals(addressText, "MY ADDRESS\r\n" + 
//				"DEBANJAN BHOWMICK\r\n" + 
//				"Self Employed\r\n" + 
//				"301, Raj Palace Apartment,3rd Floor , Boripara , Pandabnagar Near West Guwahati Commerce College\r\n" + 
//				"Cleveland, Ohio 44101\r\n" + 
//				"United States\r\n" + 
//				"0361244343\r\n" + 
//				"7002478770\r\n"+
//				"Update\r\n"+
//				"Delete");
	}
	
	@Test
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
