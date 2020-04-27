package com.fkt.qa.testcases;

import org.testng.annotations.Test;

import com.fkt.qa.base.TestBase;
import com.fkt.qa.pages.CartPage;
import com.fkt.qa.pages.HomePage;
import com.fkt.qa.pages.LoginPage;
import com.fkt.qa.pages.ProductsPage;
import com.fkt.qa.util.TestUtil;

public class CartPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ProductsPage productPage;
	TestUtil testUtil;
	CartPage cartPage;
	
	public CartPageTest() throws InterruptedException {
		super();
		intialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.searchProducts();
		productPage=homepage.searhBtnClick();
		productPage.clickOnproduct();
		testUtil.windowTabsHandle();
		productPage.addToCartBtn();
		cartPage=new CartPage();
		
			
	}
	
	@Test(priority=1)
	public void flkImgClickTest() {
		cartPage.flkImgClick();
		
	}
	@Test(priority=2)
	public void CartBtnClickTest()  {
		
		cartPage.CartBtnClick();
	}
	@Test(priority=3,enabled=false,dependsOnMethods="CartBtnClickTest")
	public void removeFromCartClickTest() throws InterruptedException {
		cartPage.removeFromCartClick();
		
	}
	@Test(priority=4)
	public void removeTest() {
		
		cartPage.removeClick();
	}
		
	
}
