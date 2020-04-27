package com.fkt.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fkt.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="//img[@class='_1e_EAo']")
	WebElement flipkartLogo;
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement search;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	WebElement searchBtn;
	
	@FindBy(tagName="html")
	WebElement scroll;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	public boolean flipkartLogoImage() {
		return flipkartLogo.isDisplayed();
		
	}
	public String homePageTitle() {
		return driver.getTitle();
	}
	public void searchProducts() throws InterruptedException {
		Thread.sleep(2000);
		search.sendKeys("Samsung Mobiles");
	}
	public ProductsPage searhBtnClick() {
		searchBtn.click();
		return new ProductsPage();
	}
	//public void ScrollTo() {
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("scroll(0, 250);");
		
	//}
	public void scrollTo() throws InterruptedException  {
		scroll.sendKeys(Keys.END);
		Thread.sleep(200);
		scroll.sendKeys(Keys.HOME);
	}

}
