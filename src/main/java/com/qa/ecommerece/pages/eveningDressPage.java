package com.qa.ecommerece.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ecommerce.base.TestBase;

public class eveningDressPage extends TestBase {

	//web element locators
	@FindBy(xpath = "//body/div/div/div/div/div/div/div/ul/li[3]")
	WebElement list;
	
	@FindBy(xpath = "//p[@class='product-desc']")
	WebElement prdDesc;
	
	//Locators for Size
	@FindBy(xpath = "//input[@name='layered_id_attribute_group_1']")
	WebElement size1;
	
	@FindBy(xpath = "//input[@name='layered_id_attribute_group_2']")
	WebElement size2;
	
	@FindBy(xpath = "//input[@name='layered_id_attribute_group_3']")
	WebElement size3;
	
	//for colors
	@FindBy(css = "input[name='layered_id_attribute_group_7']")
	WebElement beige;
	
	@FindBy(css ="input[name='layered_id_attribute_group_24']")
	WebElement Pink;
	
	//Compositions
	@FindBy(xpath = "//input[@name='layered_id_feature_3']")
	WebElement comp;
	
	@FindBy(xpath = "//input[@name='layered_id_feature_16']")
	WebElement styles;
	
	@FindBy(xpath = "//input[@name='layered_id_feature_19']")
	WebElement properties;
	
	@FindBy(xpath = "//input[@name='layered_quantity_1']")
	WebElement availability;
	
	@FindBy(xpath = "//input[@name='layered_manufacturer_1']")
	WebElement manufacturers;
	
	@FindBy(xpath = "//input[@name='layered_condition_new']")
	WebElement Condition;
	
	//WebElement for Information
	@FindBy(xpath = "//a[normalize-space()='Information']")
	WebElement Info;
	
	//Sub list
	@FindBy(xpath = "//a[normalize-space()='Delivery']")
	WebElement delivery;
	
	@FindBy(xpath = "//a[normalize-space()='Legal Notice']")
	WebElement legal;
	
	@FindBy(xpath = "//div[@class='block_content list-block']//a[@title='Terms and conditions of use'][normalize-space()='Terms and conditions of use']")
	WebElement termsCondition;
	
	@FindBy(xpath = "//div[@class='block_content list-block']//a[@title='About us'][normalize-space()='About us']")
	WebElement aboutUs;
	
	@FindBy(xpath = "//a[normalize-space()='Secure payment']")
	WebElement secure;
	
	@FindBy(xpath = "//div[@class='block_content list-block']//a[@title='Our stores'][normalize-space()='Our stores']")
	WebElement Ourstore;
	
	
	
	public eveningDressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String listView() {
		list.click();
		String desc = prdDesc.getText();
		return desc;
	}
	
	public boolean checkthesize() {
		
		if(size1.isDisplayed()== true) {
			size1.click();
		} 
		if(size2.isDisplayed()== true) {
			size2.click();
		}if(size3.isDisplayed()==true) {
			size3.click();
		}
		
		return true;
	}
	
	public boolean checktheColor() {
		if(beige.isDisplayed()==true) {
			beige.click();
		} if(Pink.isDisplayed()==true) {
			Pink.click();
		}
		return true;
	}
	
	public boolean checktheCheckboxes() {
		if(comp.isDisplayed()==true) {
			comp.click();
		} if(styles.isDisplayed()==true) {
			styles.click();
		} if(properties.isDisplayed()==true) {
			properties.click();
		} if(availability.isDisplayed()==true) {
			properties.click();
		} if(manufacturers.isDisplayed()==true) {
			manufacturers.click();
		} if(Condition.isDisplayed() == true) {
			Condition.click();
		}
		return true;
	}
	
	public String getTextunderInfo() {
		String text= " ";
		String text1 = Info.getText();
		String text2 = delivery.getText();
		String text3 = legal.getText();
		String text4 = termsCondition.getText();
		String text5 = aboutUs.getText();
		String text6 = secure.getText();
		String text7 = Ourstore.getText();
		
		return text = text1 + "\r\n" + 
		"\r\n" +
		text2 + "\r\n" + 
		text3 + "\r\n" +
		text4 + "\r\n" +
		text5 + "\r\n" + 
		text6 + "\r\n" +
		text7 ; 
	}

}
