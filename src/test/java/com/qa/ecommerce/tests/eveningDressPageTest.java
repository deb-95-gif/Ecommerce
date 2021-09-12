package com.qa.ecommerce.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.ecommerce.base.TestBase;
import com.qa.ecommerce.utils.TestUtil;
import com.qa.ecommerece.pages.SignINPage;
import com.qa.ecommerece.pages.eveningDressPage;

public class eveningDressPageTest extends TestBase {
	
	//What is log4j?//capturing info activities at the
	//time of program execution
	//4 levels of logsf
	//1. info
	//2. warn
	//3. error
	//4. fatal
	
	//log is very important in terms of debugging the code
	// to check the exceptions 
	// to find if file is missing or jar is missing
	
	SignINPage signIn;
	TestUtil util;
	eveningDressPage evening;
	
	public eveningDressPageTest() {
		super();
	}
	
   @BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		intialization();
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
	
//	@Test(priority = 5)
//	public void checktherestOfCheckboxes() throws IOException {
//		boolean flag = evening.checktheCheckboxes();
//		Assert.assertEquals(flag, true);
//		util.takeScreenshot("checkBoxes"); // take screenshot at the end of the test
//	}
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
	
//	@Test(priority = 7)
//	public void verifyTheDropdownSelection() {
//		boolean flag = evening.dropdown();
//		Assert.assertEquals(flag, true);
//	}
//	
//	@Test(priority = 8)
//	public void verifyCheckTheCheckBoxes() {
//	boolean flag = evening.checktheCheckboxes();
//	Assert.assertEquals(flag,true);
//	}
	
	@Test(priority = 9)
	public void verifyTheLogo() {
		boolean flag = evening.verifyLogo();
		Assert.assertEquals(flag, true);
	}
	
//	@Test(priority = 10)
//	public void verifythesearchresult() {
//		String text = evening.typeonsearchbar();
//		Assert.assertEquals(text, "Summer Dresses > Printed Chiffon Dress");
//	}
	
	@AfterMethod
	 public void tearDown() {
	 		driver.quit();
    }
	
}
