package com.fkt.qa.testcases;

import org.testng.annotations.Test;

import com.fkt.qa.base.TestBase;
import com.fkt.qa.pages.HomePage;
import com.fkt.qa.pages.LoginPage;
import com.fkt.qa.pages.ProductsPage;
import com.fkt.qa.util.TestUtil;

public class ProductsPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ProductsPage productPage;
	TestUtil testUtil;
	
	public ProductsPageTest() throws InterruptedException {
		super();
		intialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		homepage.searchProducts();
		productPage=homepage.searhBtnClick();
		
		
	}
	@Test(priority=1)
	public void clickOnProduTest() throws InterruptedException  {
		Thread.sleep(2000);
		productPage.clickOnproduct();
	}
	@Test(priority=2)
	public void addToCartBtnTest() throws InterruptedException {
		testUtil.windowTabsHandle();
		productPage.addToCartBtn();
	}
	

}
