package com.qa.ecommerce.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.ecommerce.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 40;
	
	
	public void takeScreenshot(String fileName	) throws IOException {
		File file1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("C:/Users/Debanjan/SeleniumConcepts/ECommerce/test-output/" +fileName+" .jpg"));
	    System.out.println("Screenshot of the test is taken");
	  }
	}

