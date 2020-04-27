package com.fkt.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fkt.qa.base.TestBase;

public class ProductsPage extends TestBase {
	
	//@FindBy(xpath="//body/div[@id='container']/div/div[contains(@class,'t-0M7P _2doH3V')]/div[contains(@class,'_3e7xtJ')]/div[contains(@class,'_1HmYoV hCUpcT')]/div[contains(@class,'_1HmYoV _35HD7C')]/div[2]/div[1]/div[1]/div[1]")
	//WebElement product;
	@FindBy(className="_1UoZlX")
	List<WebElement> list=driver.findElements(By.className("_1UoZlX"));
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	WebElement addToCart;
	
	@FindBy(xpath="//a[@class='_3ko_Ud']")
	WebElement cartBtn;
	
	@FindBy(xpath="//div[conatains(text(),'Remove']")
	WebElement remove;
	
	public ProductsPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnproduct()  {
		
		for(int i=1;i<list.size();i++) {
			list.get(1).click();
			break;
			
		}
		
	}
	public CartPage addToCartBtn() throws InterruptedException {
		Thread.sleep(3000);
		addToCart.click();
		return new CartPage();
	}

	
}
