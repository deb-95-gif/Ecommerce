package com.qa.ecommerce.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerce.utils.TestUtil;
import com.qa.ecommerece.pages.SignINPage;
import com.qa.ecommerece.pages.eveningDressPage;

public class eveningDressPageTest extends TestBase {
	
	SignINPage signIn;
	TestUtil util;
	eveningDressPage evening;
	
	public eveningDressPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		intialization(" ");
		util = new TestUtil();
		signIn = new SignINPage();
		evening = signIn.clickonDresses();
	}
	
//	@Test(priority = 1)
//	public void validatepageTitle() {
//		String title  = evening.verifyPageTitle();
//		Assert.assertEquals(title, "Evening Dresses - My Store");
//	}
	
//	@Test(priority = 2)
//	public void validatePrdDescinListView() {
//		String desc  = evening.listView();
//		Assert.assertEquals(desc, "Printed evening dress with straight sleeves with black thin waist belt and ruffled linings." );
//	}
//	
//	@Test(priority = 3)
//	public void checkTheSize() {
//		boolean flag = evening.checkthesize();
//		Assert.assertEquals(flag, true);
//	}
	
//	@Test(priority = 4)
//	public void checktheColor() {
//		boolean flag = evening.checktheColor();
//		Assert.assertEquals(flag, true);
//	}
	
	@Test(priority = 5)
	public void checktherestOfCheckboxes() throws IOException {
		boolean flag = evening.checktheCheckboxes();
		Assert.assertEquals(flag, true);
		util.takeScreenshot("checkBoxes");
	}
//	
//	@Test(priority = 6)
//	public void verifyThetxt() {
//		String text = evening.getTextunderInfo();
//		Assert.assertEquals("INFORMATION\r\n" + 
//				"\r\n" + 
//				" Delivery\r\n" + 
//				" Legal Notice\r\n" + 
//				" Terms and conditions of use\r\n" + 
//				" About us\r\n" + 
//				" Secure payment\r\n" + 
//				" Our stores",text);
//	}
	
	@AfterMethod
	 public void tearDown() {
//    {
//        TakesScreenshot scr= ((TakesScreenshot)driver);
//        File file1= scr.getScreenshotAs(OutputType.FILE);
//        File DestFile=new File("C:/Users/Debanjan/SeleniumConcepts/ECommerece/test-output");
//        FileUtils.copyFile(file1, DestFile);
//        System.out.println("Screenshot of the test is taken");
	 		driver.quit();
    }
	
}
