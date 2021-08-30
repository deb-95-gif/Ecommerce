package com.qa.ecommerce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.qa.ecommerce.utils.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/Debanjan/SeleniumConcepts/ECommerce/src/main"
					+ "/java/com/qa/ecommerce/config/config.properties");
		
			prop.load(ip);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	
	@Parameter
	public static void intialization(String name) throws IOException {
		
		
		if(name .equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Debanjan/SeleniumConcepts/ECommerce/src/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		} else if(name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/Debanjan/SeleniumConcepts/ECommerce/src/resources/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (name.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:/Users/Debanjan/SeleniumConcepts/ECommerce/src/resources/Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}

}
