package com.qa.ecommerece.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class SignINPage extends TestBase {
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement SigninLink;
	
	@FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//a[@title='Faded Short Sleeve T-shirts'][normalize-space()='Faded Short Sleeve T-shirts']")
	WebElement productName;
//	
//	@FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@title='Faded Short Sleeve T-shirts']")
//	WebElement prdImg;
//	
	
	@FindBy(xpath = "//body/div[@id='page']/div/div[@id='columns']/div/div[@id='center_column']/div/ul[@id='homefeatured']/li[1]/div[1]")
	WebElement hoveronPrd;
	
	@FindBy(linkText =  "Add to cart")
	WebElement addTocartlink;
	
	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	WebElement proceedChkbtn;
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement viewShoppingCart;
	
	@FindBy(xpath = "//span[normalize-space()='Check out']")
	WebElement checkOut;
	
	@FindBy(xpath = "//body/div/div/header/div/div/div/div/ul/li[2]/ul[1]/li[2]/a[1]")
	WebElement eveningDress;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
	WebElement Dress;
	
	Actions action = new Actions(driver);
	
	public SignINPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateSignInPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage SigninAction() {
		SigninLink.click();
		return new HomePage();
		
	}
	
	public OrderPage addProductCart() throws InterruptedException {
		// if(productName.getText() ==" Faded Short Sleeve T-shirts ") {
			 
			action.moveToElement(hoveronPrd).build().perform();
			Thread.sleep(2000);
			addTocartlink.click();
//			 Set<String> handler = driver.getWindowHandles(); 
//			 Iterator<String> it = handler.iterator();
//			 String parentWindowId =  it.next(); //parent WindowId 
//			 String childWindowId = it.next();
//			 driver.switchTo().window(childWindowId); // switch to childWindowId
			 proceedChkbtn.click();
			 return new OrderPage();
//			 if(driver.findElement(By.xpath("//h2[normalize-space()='Product successfully added to your shopping cart']")).getText() == "Product successfully added to your shopping cart") {
//				 System.out.println("AlertMessage verified");
//			 }
		 }
	
	public eveningDressPage clickonDresses() throws InterruptedException {
		action.moveToElement(Dress).build().perform();
		Thread.sleep(2000);
		eveningDress.click();
		return new eveningDressPage();
	}
//	
//		public OrderPage ProductcheckOut() {
//			if(viewShoppingCart.isDisplayed()== true) {
//				checkOut.click();
//			}
//			return new OrderPage();
//		}
}
