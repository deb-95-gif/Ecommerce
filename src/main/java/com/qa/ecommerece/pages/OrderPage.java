package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class OrderPage extends TestBase {
	
	HomePage home;
	
	//Web Element Locators
	@FindBy(xpath = "//td[@class='cart_product']//img[@alt='Faded Short Sleeve T-shirts']")
	WebElement prdImg;
	
	@FindBy(xpath = "//a[@title='Add']")
	WebElement addQty;
	
	@FindBy(xpath = "//a[@title='Subtract']")
	WebElement minusQty;
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	WebElement msg;
	
	@FindBy(xpath = "//tr[7]//td[2]")
	WebElement total;
	
	@FindBy(xpath = "//td[@class='cart_avail']")
	WebElement stockavilbility;
	
	@FindBy(xpath = "//tbody/tr[@class='cart_item last_item first_item address_0 odd']/td[@class='cart_unit']/span[1]")
	WebElement unitPrice;
	
	@FindBy(xpath = "//td[contains(text(),' ')]")
	WebElement prdTotal;
	
	@FindBy(xpath = "//td[normalize-space()=' ']")
	WebElement totalTax;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement heading;
	
	@FindBy(xpath = "//span[contains(text(),'DEBANJAN BHOWMICK')]")
	WebElement cstName;
	
	@FindBy(css = ".button.btn.btn-default.standard-checkout.button-medium")
	WebElement prcCheckBtn;
	
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String verifyChangeinQtyMessageadd() {
		addQty.click();
		addQty.click();
		String message = msg.getText();
		return message;
	}

	public String verifyChangeinQtyMessageasub() {
		minusQty.click();
		String message = msg.getText();
		return message;
	}
	
	public String verifyTotal() {
		String value = total.getAttribute(" ");
		return value;
	}
	
	public boolean verifyStockavailbility() {
		boolean flag = false;
		flag = stockavilbility.isDisplayed();
		return flag;
	}
	
	public String Total() {
		String prd = prdTotal.getAttribute(" ");
		String tax = totalTax.getAttribute(" ");
		return prd+tax;
	}
	
	public String verifyUnitPrice() {
		String price  = unitPrice.getAttribute(" ");
		return price;
	}
	
	public String verifyPageHeading() {
		String pageHeading = heading.getText();
		return pageHeading;
	}
	
	public void clickOnCheckOut() {
		prcCheckBtn.click();
		if(cstName.getText().matches(" ")) {
			home.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		else (cstName.getText().matches("DEBANJAN")){
			
		}
	}

}
