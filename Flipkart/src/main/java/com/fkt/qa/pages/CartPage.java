package com.fkt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fkt.qa.base.TestBase;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//img[@class='_1e_EAo']")
	WebElement flkImg;
	
	@FindBy(xpath="//a[@class='_3ko_Ud']")
	WebElement cartBtn;
	
	@FindBy(xpath="//div[contains(text(),'Remove')]")
	WebElement removeFromCart;
	
	@FindBy(xpath="//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")
	WebElement remove;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void flkImgClick() {
		flkImg.click();
	}
	public void CartBtnClick()  {
		
		cartBtn.click();
		
	}
	public void removeFromCartClick() throws InterruptedException {
		Thread.sleep(2000);
		removeFromCart.click();
	}
	
	public void removeClick() {
		
		remove.click();
	}
		
}
